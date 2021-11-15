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
    @Size(min = 3, max =)
    private String name;
    @Column(name = "nome_pt")
    private String namePt;
    @Column(name = "sigla")
    private String abbreviation;
    @Column
    private Integer bacen;
}
