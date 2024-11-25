package nl.jilderda.model.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Wedstrijd extends PanacheEntity {

    private Long id;

    @Column(name = "tegenstander")
    private String tegenstander;

    @Column(name = "datum")
    private String datum;
}
