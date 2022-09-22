package it.contrader.customException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class LoginFailed extends RuntimeException{

    public LoginFailed() {
    }

    public LoginFailed(String message) {
        super(message);
    }

    public LoginFailed(String message, Throwable cause) {
        super(message, cause);
    }

    public LoginFailed(Throwable cause) {
        super(cause);
    }
}
