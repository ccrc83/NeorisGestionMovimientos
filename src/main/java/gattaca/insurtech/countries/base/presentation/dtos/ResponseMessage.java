package gattaca.insurtech.countries.base.presentation.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseMessage<T> {

    @JsonProperty(value = "data", required = true)
    @ApiModelProperty(notes = "Objeto JSON que encierra el cuerpo de la respuesta")
    private T data;
    @ApiModelProperty(notes = "código de la respuesta")
    private int code;
    @ApiModelProperty(notes = "Mensaje de la respuesta")
    private String message;
    public String toJsonString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }

    public static <T> ResponseMessage<T> fromJsonString(String jsonString, List<T> dataClass) {
        Gson gson = new Gson();
        return gson.fromJson(jsonString, ResponseMessage.class);
    }
}
