package az.ingress.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ErrorMessage {

    UNEXPECTED_ERROR("Unexpected error occurred"),
    INVALID_RESERVATION_TIME("Invalid event date: [%s]. Please ensure it is at least 3 days from today.");

    private final String message;
}