
package model.servicos;

import java.time.LocalDate;
import model.entidades.Contrato;
import model.entidades.Parcela;



public class ServicoGerarParcelas {
    
    private ServicoPagamentoOnline spo;

    public ServicoGerarParcelas(ServicoPagamentoOnline spo) {
        this.spo = spo;
    }
    
    public void gerarParcelas(int qtdMeses, Contrato contrato){
        
        Double valorBase = contrato.getValorTotal() / qtdMeses;
        
        for (int i = 1; i <= qtdMeses; i++){
            
            Double valorComJuro = valorBase + spo.juro(valorBase) * i;
            Double valorTotal = valorComJuro + spo.taxaPagamento(valorComJuro);
            LocalDate data = gerarMeses(contrato, i);
            
            contrato.addParcelas(new Parcela(data, valorTotal));
            
        }
        
    }
    
    public LocalDate gerarMeses(Contrato contrato, int i){
        LocalDate dataAtual = contrato.getData();
        LocalDate proximaData = dataAtual.plusMonths(i);
        return proximaData;
    }
    
}
