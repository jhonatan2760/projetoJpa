package br.com.projetojpa;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author JhonatanV
 */

@Entity(name = "operador")
@Table(name = "operador")
@SequenceGenerator(name = "op_seq", sequenceName="open_seq", allocationSize = 10)
public class Operador implements Serializable {

    @Id
    @GeneratedValue(generator = "op_seq")
    private Long id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "idade")
    private int idade;
    @ManyToMany(mappedBy = "operador", cascade = CascadeType.ALL)
    private List<Area> area;

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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public List<Area> getArea() {
        return area;
    }

    public void setArea(List<Area> area) {
        this.area = area;
    }
    
    
}
