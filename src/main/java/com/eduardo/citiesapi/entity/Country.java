package com.eduardo.citiesapi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "pais")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Country {

    @Id
    private Long id;
    @Column(name = "nome")
    @Size(min = 3, max = 60)
    private String name;
    @Column(name = "nome_pt")
    @Size(min = 3, max = 60)
    private String namePt;
    @Column(name = "sigla")
    @Size(min = 2, max = 2)
    private String abbreviation;
    @Column
    @Size(min = 3)
    private Integer bacen;
}
