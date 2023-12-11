package gattaca.insurtech.countries.base.infrastructure.adapters;

import gattaca.insurtech.countries.base.domain.entities.Countries;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountriesRepository extends CrudRepository<Countries, Integer> {

}
