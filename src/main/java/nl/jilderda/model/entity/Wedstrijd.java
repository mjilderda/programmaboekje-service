package nl.jilderda.model.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@Entity
public class Wedstrijd extends PanacheEntity {

    private Long id;

    @Column(name = "tegenstander")
    private String tegenstander;

    @Column(name = "datum")
    private LocalDate datum;
}
