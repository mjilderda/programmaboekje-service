package nl.jilderda.rest;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import nl.jilderda.model.content.PupilContent;
import nl.jilderda.rest.beans.PupilContentDto;

@ApplicationScoped
public class PupilContentImpl implements ContentResource {


    @Inject
    PupilContent pupilContent;


    @Override
    public PupilContentDto getPupilContent() {
        PupilContentDto dto = new PupilContentDto();
        dto.setContent(pupilContent.getPupilUitnodiging());
        return dto;
    }
}
