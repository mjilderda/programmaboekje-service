package nl.jilderda.rest;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.NotFoundException;
import lombok.extern.slf4j.Slf4j;
import nl.jilderda.model.entity.Wedstrijd;
import nl.jilderda.rest.beans.NewWedstrijdDto;
import nl.jilderda.rest.beans.OpgehaaldeWedstrijdenDto;
import nl.jilderda.rest.beans.WedstrijdDto;
import nl.jilderda.rest.mapper.Mapper;

import java.util.List;

import static nl.jilderda.rest.mapper.Mapper.map;

@Slf4j
public class WedstrijdResourceImpl implements WedstrijdResource {

    @Override
    @Transactional
    public WedstrijdDto putWedstrijd(NewWedstrijdDto data) {
        log.info("Wedstrijd updaten");
        Wedstrijd wedstrijd = map(data);
        wedstrijd.persist();
        return map(wedstrijd);
    }

    @Override
    @Transactional
    public OpgehaaldeWedstrijdenDto getWedstrijden() {
        List<Wedstrijd> wedstrijdList = Wedstrijd.findAll().list();
        List<WedstrijdDto> list = wedstrijdList.stream().map(Mapper::map).toList();
        OpgehaaldeWedstrijdenDto dto = new OpgehaaldeWedstrijdenDto();
        dto.setResultaat(list);
        dto.setTotaalAantalItems((long) list.size());
        return dto;
    }

    @Override
    @Transactional
    public WedstrijdDto getWedstrijd(long wedstrijdId) {
        Wedstrijd wedstrijd = Wedstrijd.findById(wedstrijdId);
        if (wedstrijd == null) {
            throw new NotFoundException("niks gevonden");
        }
        return map(wedstrijd);

    }

    @Override
    @Transactional
    public void verwijderWedstrijd(long wedstrijdId) {
        Wedstrijd wedstrijd = Wedstrijd.findById(wedstrijdId);
        if (wedstrijd == null) {
            throw new NotFoundException();
        }
        wedstrijd.delete();
    }

}

