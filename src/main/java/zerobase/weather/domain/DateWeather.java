package zerobase.weather.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;

@Entity(name = "date_weather")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DateWeather {

    @Id
    LocalDate date;

    private String weather;
    private String icon;
    private double temperature;

}
