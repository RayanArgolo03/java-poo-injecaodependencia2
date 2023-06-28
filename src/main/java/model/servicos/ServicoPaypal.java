
package model.servicos;


public class ServicoPaypal implements ServicoPagamentoOnline{

    @Override
    public Double juro(Double valor) {
        return valor * 0.01;
    }

    @Override
    public Double taxaPagamento(Double valor) {
        return valor * 0.02;
    }
    
}
