package br.com.projetojpa;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author Jhonatan
 */

@Entity(name = "animal")
@Table(name = "animal")
@SequenceGenerator(name = "animal_seq", sequenceName = "animal_seq", allocationSize = 10)
public class Animal implements Serializable {
    
    @Id
    @GeneratedValue(generator = "animal_seq", strategy = GenerationType.SEQUENCE)
    private long id;
    @Column(name = "nome_animal")
    private String nome;
    @Column(name = "status")
    private boolean status;
    @ManyToOne(cascade = CascadeType.ALL)
    private Especie especie;
    @ManyToOne(cascade = CascadeType.ALL)
    private Area area;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }
    
}
