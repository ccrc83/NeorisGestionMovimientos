package gattaca.insurtech.countries.base.domain.usecases;

import gattaca.insurtech.countries.base.domain.entities.Countries;
import gattaca.insurtech.countries.base.infrastructure.adapters.CountriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FindAllCountriesUseCase {

    @Autowired
    private CountriesRepository countriesRepository;

    public List<Countries> execute(){
        Countries country= new Countries();
        country.setCountryCode(1);
        country.setCountryName("colombia");
        country.setCountryISOCode("123");
        countriesRepository.save(country);
        return (List<Countries>) countriesRepository.findAll();

    }
}
