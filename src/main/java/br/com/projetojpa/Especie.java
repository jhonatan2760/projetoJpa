package br.com.projetojpa;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author Jhonatan
 */

@Entity(name = "especie")
@Table(name = "especie")
@SequenceGenerator(name = "especie_seq", allocationSize = 10)
public class Especie implements Serializable {
    
    @Id
    @GeneratedValue(generator = "especie_seq", strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "nome_especie")
    private String nome;

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
    
    
}
