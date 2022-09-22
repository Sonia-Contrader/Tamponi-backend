package it.contrader.handlerException;

import it.contrader.customException.LoginFailed;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ControllerAdvice
public class HandlerException {

    String handerLogin = "Username o password errati";
    @ExceptionHandler(LoginFailed.class)
    public ResponseEntity<String> handlerLogin(LoginFailed loginFailed){
        return new ResponseEntity<>(handerLogin, HttpStatus.BAD_REQUEST);
    }
}
