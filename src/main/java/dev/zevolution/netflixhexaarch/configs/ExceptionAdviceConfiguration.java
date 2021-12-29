package dev.zevolution.netflixhexaarch.configs;

import dev.zevolution.netflixhexaarch.repositories.exceptions.InternalServerErrorException;
import dev.zevolution.netflixhexaarch.repositories.exceptions.NotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;
import static org.springframework.http.HttpStatus.NOT_FOUND;

@ControllerAdvice
public class ExceptionAdviceConfiguration extends ResponseEntityExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<Object> repositoryNotFoundExceptionHandler(NotFoundException e, WebRequest request) {
        this.logger.error("Error " + e + " path " + ((ServletWebRequest) request).getRequest().getRequestURI());

        var apiError = new RESTAPIException(e.getMessage(), e.getMessage(), NOT_FOUND, LocalDateTime.now());
        return new ResponseEntity<>(apiError, NOT_FOUND);
    }

    @ExceptionHandler(InternalServerErrorException.class)
    public ResponseEntity<Object> repositoryInternalServerErrorExceptionHandler(InternalServerErrorException e, WebRequest request) {
        this.logger.error("Error " + e + " path " + ((ServletWebRequest) request).getRequest().getRequestURI());

        var apiError = new RESTAPIException(e.getMessage(), e.getMessage(), INTERNAL_SERVER_ERROR, LocalDateTime.now());
        return new ResponseEntity<>(apiError, INTERNAL_SERVER_ERROR);
    }

}