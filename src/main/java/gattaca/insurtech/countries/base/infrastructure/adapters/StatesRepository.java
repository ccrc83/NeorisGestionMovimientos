package gattaca.insurtech.countries.base.infrastructure.adapters;

import gattaca.insurtech.countries.base.domain.entities.States;
import org.springframework.data.repository.CrudRepository;

public interface StatesRepository extends CrudRepository<States,Integer> {
}
