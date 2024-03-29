# Server Notifications on Spark

[![Java CI](https://github.com/TwilioDevEd/server-notifications-spark/actions/workflows/maven.yml/badge.svg)](https://github.com/TwilioDevEd/server-notifications-spark/actions/workflows/maven.yml)

Use Twilio to send SMS alerts so that you never miss a critical issue.

[Read the full tutorial here](https://www.twilio.com/docs/tutorials/walkthrough/server-notifications/java/spark)!

### Local Development

1. First clone this repository and `cd` into it:
   ```bash
   git clone git@github.com:TwilioDevEd/server-notifications-spark.git
   cd server-notifications-spark
   ```

2. Export the environment variables:

   You can find the AccountSID and the AuthToken in your 
   [Twilio Console](https://www.twilio.com/console).

   ```bash
   export TWILIO_ACCOUNT_SID=your account sid
   export TWILIO_AUTH_TOKEN=your auth token
   ```

   The Twilio Phone Number can be found in the 
   [Phone Numbers section of the Twilio Console](https://www.twilio.com/console/phone-numbers/incoming).

   ```bash
   export TWILIO_PHONE_NUMBER=your Twilio phone number
   ```

3. Make sure the tests succeed:

   ```bash
   mvn compile test
   ```

4. Run the application.

   ```bash
   mvn compile exec:java -Dexec.mainClass=App
   ```

5. Check it out at [http://localhost:4567](http://localhost:4567)
