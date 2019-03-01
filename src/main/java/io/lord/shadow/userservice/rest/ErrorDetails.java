package io.lord.shadow.userservice.rest;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
class ErrorDetails {

    private final String returnCode;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
    private final LocalDateTime timestamp;
    private final String message;
    private final String details;

    ErrorDetails(String returnCode, LocalDateTime timestamp, String message, String details) {
        this.returnCode = returnCode;
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }
}
