package dev.zevolution.netflixhexaarch.bootstrap.exceptions;

public class NotFoundException extends RuntimeException {

    public NotFoundException(String message) {
        super(message);
    }

    public NotFoundException() {
        super("The requested resource could not be found.");
    }

}
