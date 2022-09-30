package sky.pro.myCollection.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class EmployeeNotFoundException extends  RuntimeException{

    public EmployeeNotFoundException(String message) {
        super(message);
    }
}
