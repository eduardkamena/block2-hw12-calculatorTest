package pro.sky.calculatorTest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "На ноль делить нельзя")
public class DivideOnNullException extends IllegalArgumentException {
    public DivideOnNullException(String message) {
        super(message);
    }

}
