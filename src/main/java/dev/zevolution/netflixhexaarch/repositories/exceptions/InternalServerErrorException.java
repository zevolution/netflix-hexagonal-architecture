package dev.zevolution.netflixhexaarch.repositories.exceptions;

public class InternalServerErrorException extends RuntimeException {

    public InternalServerErrorException(String message) {
        super(message);
    }

    public InternalServerErrorException() {
        super("Internal server error. Please contact us.");
    }

}