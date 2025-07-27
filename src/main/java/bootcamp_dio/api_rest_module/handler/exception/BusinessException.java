package bootcamp_dio.api_rest_module.handler.exception;

public class BusinessException extends RuntimeException {
    public BusinessException(String message) {
        super(message);
    }
}
