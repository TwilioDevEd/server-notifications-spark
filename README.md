# Server Notifications on Spark

[![Build
Status](https://travis-ci.org/TwilioDevEd/server-notifications-spark.svg?branch=master)](https://travis-ci.org/TwilioDevEd/server-notifications-spark)

<a href="http://howtodocs.s3.amazonaws.com/server-notifications-notification.png"
   target="_blank">
  <img src="http://howtodocs.s3.amazonaws.com/server-notifications-notification.png"
       alt="Notification on phone" width="60%" />
</a>

Use Twilio to create SMS server alerts so that you never miss a critical server
issue.

### Local Development

1. First clone this repository and `cd` into it:
   ```
   git clone git@github.com:TwilioDevEd/server-notifications-spark.git
   cd server-notifications-spark
   ```

2. Export the environment variables:

   You can find the AccountSID and the AuthToken at https://www.twilio.com/user/account/settings.

   ```
   export TWILIO_ACCOUNT_SID=your account sid
   export TWILIO_AUTH_TOKEN=your auth token
   ```

   The Twilio Phone Number can be found at https://www.twilio.com/user/account/phone-numbers/incoming.

   ```
   export TWILIO_PHONE_NUMBER=your Twilio phone number
   ```

3. Make sure the tests succeed:

   ```
   mvn compile test
   ```

4. Run the application.

   ```
   mvn compile exec:java -Dexec.mainClass=App
   ```

5. Check it out at [http://localhost:4567](http://localhost:4567)
