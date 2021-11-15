package com.eduardo.citiesapi.models.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;
import org.springframework.data.geo.Point;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "cidade")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TypeDefs({
        @TypeDef(name = "point", typeClass = PointType.class)
})
public class City {

    @Id
    private Long id;
    @Column(name = "nome")
    @Size(min = 3, max = 120)
    private String name;
    @ManyToOne
    @Basic(fetch = FetchType.LAZY)
    @JoinColumn(name = "uf", referencedColumnName = "id")
    private State state;
    @Column
    private Integer ibge;
    @Column(name = "lat_lon")
    private String geolocation;
    @Type(type = "point")
    @Column(name = "lat_lon", updatable = false, insertable = false)
    private Point location;
    @Column(name = "cod_tom")
    private Integer codeTom;
}
