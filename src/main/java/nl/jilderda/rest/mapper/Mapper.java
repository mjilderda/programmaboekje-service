package nl.jilderda.rest.mapper;

import nl.jilderda.model.entity.Wedstrijd;
import nl.jilderda.rest.beans.NewWedstrijdDto;
import nl.jilderda.rest.beans.WedstrijdDto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mapper {

    private Mapper() {
    }

    public static WedstrijdDto map(Wedstrijd wedstrijd) {
        WedstrijdDto wedstrijdDto = new WedstrijdDto();
        wedstrijdDto.setId(wedstrijd.getId().intValue());
        wedstrijdDto.setDatum(datumVanDomeinNaarDto(wedstrijd.getDatum()));
        wedstrijdDto.setTegenstander(wedstrijd.getTegenstander());

        return wedstrijdDto;
    }

    public static Wedstrijd map(WedstrijdDto wedstrijdDto) {
        Wedstrijd wedstrijd = new Wedstrijd();
        wedstrijd.setDatum(datumVanDtoNaarDomein(wedstrijdDto.getDatum()));
        wedstrijd.setTegenstander(wedstrijdDto.getTegenstander());
        return wedstrijd;
    }


    public static Wedstrijd map(NewWedstrijdDto wedstrijdDto) {
        Wedstrijd wedstrijd = new Wedstrijd();
        wedstrijd.setDatum(datumVanDtoNaarDomein(wedstrijdDto.getDatum()));
        wedstrijd.setTegenstander(wedstrijdDto.getTegenstander());
        return wedstrijd;
    }

    private static String datumVanDomeinNaarDto(LocalDate localDate) {
        return String.format("%s-%s-%s", localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
    }

    private static LocalDate datumVanDtoNaarDomein(String date) {
        return LocalDate.parse(date, DateTimeFormatter.ISO_DATE);
    }
}
