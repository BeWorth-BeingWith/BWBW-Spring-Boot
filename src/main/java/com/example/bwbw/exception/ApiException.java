package com.example.bwbw.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

@AllArgsConstructor
@Getter
public class ApiException {
    private final String msg;
    private final HttpStatus httpStatus;
    private final ZonedDateTime timestamp;
}
