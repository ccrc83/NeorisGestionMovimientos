package gattaca.insurtech.countries.base.presentation.dtos;

import io.swagger.annotations.ApiModelProperty;

public class ResponseErrorMessage  extends RuntimeException{

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(notes = "Codigo de respuesta del API.")
    private  String code;
    @ApiModelProperty(notes = "Descripcion especifica del mensaje de respuesta")
    private  String message;
    public ResponseErrorMessage() {
    }

    public ResponseErrorMessage(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}