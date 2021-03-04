package com.cathate.exception;

import com.cathate.model.httpentity.ErrorResponse;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApiException extends RuntimeException {
    ErrorResponse errorResponse;

    public ApiException(ErrorResponse e) {
        this.errorResponse = e;
    }

    public ApiException(String errorCode, String message) {
        this.errorResponse = new ErrorResponse(errorCode, message);
    }
}
