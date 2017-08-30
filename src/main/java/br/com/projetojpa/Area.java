package br.com.projetojpa;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author Jhonatan
 */

@Entity(name = "area")
@Table(name = "area")
@SequenceGenerator(name = "area_seq", allocationSize = 10, sequenceName = "area_seq")
public class Area implements Serializable {
    
    @Id
    @GeneratedValue(generator = "area_seq", strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "nome_area")
    private String nome;
    @OneToMany(mappedBy = "area", cascade = CascadeType.ALL)
    private List<Animal> animais;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "area_operador")
    private List<Operador> operador;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Animal> getAnimais() {
        return animais;
    }

    public void setAnimais(List<Animal> animais) {
        this.animais = animais;
    }

    public List<Operador> getOperador() {
        return operador;
    }

    public void setOperador(List<Operador> operador) {
        this.operador = operador;
    }
    
    
}
