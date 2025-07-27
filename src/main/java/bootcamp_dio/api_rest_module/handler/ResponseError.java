package bootcamp_dio.api_rest_module.handler;

import lombok.Data;

import java.util.Date;

@Data
public class ResponseError {
    private Date timestamp = new Date();
    private String status = "erro";
    private int statusCode = 400;
    private String error;
}
