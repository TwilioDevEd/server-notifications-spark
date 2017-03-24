package utils;

import com.twilio.exception.TwilioException;
import com.twilio.http.TwilioRestClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {

    private static Logger logger = LoggerFactory.getLogger(Client.class);


    private Credentials credentials;
    private TwilioMessageCreator messageCreator;

    public Client() {
        this.credentials = new Credentials();
        this.messageCreator = new TwilioMessageCreator(
                new TwilioRestClient.Builder(credentials.getAccountSid(), credentials.getAuthToken()).build()
        );
    }

    public Client(TwilioMessageCreator messageCreator, Credentials credentials) {
        this.credentials = credentials;
        this.messageCreator = messageCreator;
    }

    public void sendMessage(String to, String message, String mediaUrl) {
        try {
            messageCreator.create(to, credentials.getPhoneNumber(), message, mediaUrl);
        } catch (TwilioException e) {
            logger.error("An exception occurred trying to send the message \"{}\" to {}." +
                    " \nTwilio returned: {} \n", message, to, e.getMessage());
        }
    }
}
