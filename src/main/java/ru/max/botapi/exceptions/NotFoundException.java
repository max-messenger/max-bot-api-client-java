package ru.max.botapi.exceptions;

public class NotFoundException extends APIException {
    public NotFoundException(String message) {
        super(404, message);
    }
}
