package br.edu.ifto.mapAssociacao.model.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
public class ItemVenda implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private double quantidade;
    @ManyToOne
    private Produto produto;

    @ManyToOne
    private Venda venda;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

   // Método para calcular o valor total da lista ItemVenda.
    public double totalItemVenda() {
        return quantidade * produto.getValor();
    }
}
