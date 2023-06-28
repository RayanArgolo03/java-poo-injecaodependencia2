
package model.entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Contrato {
    
    private String numero;
    private LocalDate data;
    private Double valorTotal;
    
    List<Parcela> parcelas = new ArrayList<>();

    public Contrato(String numero, LocalDate data, Double valorTotal) {
        this.numero = numero;
        this.data = data;
        this.valorTotal = valorTotal;
    }

    public Contrato() {
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<Parcela> getParcelas() {
        return parcelas;
    }
    
    public void addParcelas(Parcela p){
        parcelas.add(p);
    }
    
    public void removerParcelas(Parcela p){
        parcelas.remove(p);
    }
    
}
