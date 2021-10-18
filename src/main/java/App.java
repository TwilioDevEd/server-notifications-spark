import logging.LoggingFilter;
import models.Administrator;
import utils.Client;
import utils.Repository;

import static spark.Spark.afterAfter;
import static spark.Spark.exception;
import static spark.Spark.get;

public class App {
    public static void main(String[] args) {
        get("/", (request, response) -> {
            throw new Exception("Impossible happened");
        });

        // http://sparkjava.com/documentation.html#exception-mapping
        exception(Exception.class, (e, request, response) -> {
            String message = String.format("It appears the server is having Exception: %s " +
                    "Help from a friendly bot is on the way. ",
                    e.getMessage());

            String mediaUrl = "https://farm8.staticflickr.com/7090/6941316406_80b4d6d50e_z_d.jpg";

            Administrator[] administrators = new Repository().getAdministrators();
            for(Administrator administrator : administrators) {
                new Client().sendMessage(administrator.getPhoneNumber(), message, mediaUrl);
            }

            response.body("Something unexpected happened. Keep calm, administrators were notified.");
        });

        // Log all requests and responses
        afterAfter(new LoggingFilter());
    }
}
