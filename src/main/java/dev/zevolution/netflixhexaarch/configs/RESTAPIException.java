package dev.zevolution.netflixhexaarch.configs;

import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

public class RESTAPIException {

    private final String userMessage;
    private final String developerMessage;
    private final int status;
    private final String error;
    private final LocalDateTime timestamp;

    public RESTAPIException(String userMessage, String developerMessage, HttpStatus httpStatus, LocalDateTime timestamp) {
        this.userMessage = userMessage;
        this.developerMessage = developerMessage;
        this.status = httpStatus.value();
        this.error = httpStatus.name();
        this.timestamp = timestamp;
    }

    public String getUserMessage() {
        return userMessage;
    }

    public String getDeveloperMessage() {
        return developerMessage;
    }

    public int getStatus() {
        return status;
    }

    public String getError() {
        return error;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

}
