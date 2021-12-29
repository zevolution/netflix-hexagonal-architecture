package dev.zevolution.netflixhexaarch.repositories.exceptions;

public class NotFoundException extends RuntimeException {

    public NotFoundException(String message) {
        super(message);
    }

    public NotFoundException() {
        super("The requested resource could not be found.");
    }

}
