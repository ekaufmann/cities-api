package com.eduardo.citiesapi.models.entities;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "estado")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TypeDefs({
        @TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
})
public class State {

    @Id
    private Long id;
    @Column(name = "nome")
    @Size(min = 3, max = 60)
    private String name;
    @Column
    @Size(min = 2, max = 2)
    private String uf;
    @Column
    private Integer ibge;
    @ManyToOne
    @JoinColumn(name = "pais", referencedColumnName = "id")
    private Country country;
    @Type(type = "jsonb")
    @Basic(fetch = FetchType.LAZY)
    @Column(columnDefinition = "jsonb")
    private List<Integer> ddd;
}
