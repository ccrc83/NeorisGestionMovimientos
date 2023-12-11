package gattaca.insurtech.countries.base.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="COUNTRY")
public class Countries {
    @Id
    private int countryCode;
    private String countryISOCode;
    private String countryName;

}
