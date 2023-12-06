package gattaca.insurtech.base.presentation.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseMessage<T> {


    @JsonProperty(value = "data", required = true)
    @ApiModelProperty(notes = "Objeto JSON que encierra el cuerpo de la respuesta")
    private T data;

    public String toJsonString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }

    public static <T> ResponseMessage<T> fromJsonString(String jsonString, Class<T> dataClass) {
        Gson gson = new Gson();
        return gson.fromJson(jsonString, ResponseMessage.class);
    }
}
