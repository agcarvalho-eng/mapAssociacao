package br.edu.ifto.mapAssociacao.model.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class Venda implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private Date data;
    @OneToMany(mappedBy = "venda")
    List<ItemVenda> itensVenda;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public List<ItemVenda> getItensVenda() {
        return itensVenda;
    }

    public void setItensVenda(List<ItemVenda> itensVenda) {
        this.itensVenda = itensVenda;
    }
    public double totalVenda(){
        double totalVenda = 0;
        for(ItemVenda itemVenda : itensVenda){
            totalVenda += itemVenda.totalItemVenda();
        }
        return totalVenda;
    }
}
