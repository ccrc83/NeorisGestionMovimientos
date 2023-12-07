package gattaca.insurtech.base.presentation.controllers;

import gattaca.insurtech.base.domain.usecases.FindAllCountriesUseCase;
import gattaca.insurtech.base.domain.entities.Countries;
import gattaca.insurtech.base.infrastructure.constants.Constants;
import gattaca.insurtech.base.presentation.dtos.ResponseErrorMessage;
import gattaca.insurtech.base.presentation.dtos.ResponseMessage;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.SwaggerDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("Countries")
@SwaggerDefinition
public class CountriesController {

    @Autowired
    private FindAllCountriesUseCase findAllCountriesUseCase;


    @ApiResponses(value = {
            @ApiResponse(code = Constants.CODE_200, message = Constants.MESSAGE_200, response = ResponseMessage.class),
            @ApiResponse(code = Constants.CODE_400, message = Constants.MESSAGE_400, response = ResponseErrorMessage.class),
            @ApiResponse(code = Constants.CODE_422, message = Constants.MESSAGE_422, response = ResponseErrorMessage.class),
            @ApiResponse(code = Constants.CODE_500, message = Constants.MESSAGE_500, response = ResponseErrorMessage.class) })
    @ApiOperation(value = "Obtiene la lista de países", response = ResponseMessage.class)
    @GetMapping("/list")
    public  ResponseEntity<ResponseMessage> list(){
        List<Countries> countries = findAllCountriesUseCase.execute();
        ResponseMessage responseMessage= new ResponseMessage(countries,Constants.CODE_200,Constants.MESSAGE_200);

        return ResponseEntity.ok(responseMessage);
    }

}
