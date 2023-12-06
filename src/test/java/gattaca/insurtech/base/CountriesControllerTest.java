package gattaca.insurtech.base;

import gattaca.insurtech.base.presentation.controllers.CountriesController;
import gattaca.insurtech.base.domain.usecases.FindAllCountriesUseCase;
import gattaca.insurtech.base.domain.entities.Countries;
import gattaca.insurtech.base.presentation.dtos.ResponseMessage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class CountriesControllerTest {
    @Mock
    private FindAllCountriesUseCase findAllCountriesUseCase;

    @InjectMocks
    private CountriesController countriesController;

    @Test
    public void testList() {
        List<Countries> countries = new ArrayList<>();

        Mockito.when(findAllCountriesUseCase.execute()).thenReturn(countries);

        ResponseEntity<ResponseMessage> responseEntity = countriesController.list();

        Assertions.assertEquals(200, responseEntity.getStatusCodeValue());
        Assertions.assertEquals(new ResponseMessage(countries), responseEntity.getBody());
    }

    @Test
    public void testListWithException() {
        Mockito.when(findAllCountriesUseCase.execute()).thenThrow(new RuntimeException("Error"));

        Assertions.assertThrows(RuntimeException.class, () -> countriesController.list());
    }
}
