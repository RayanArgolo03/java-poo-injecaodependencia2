
package model.servicos;


public interface ServicoPagamentoOnline {

    Double juro(Double valor);
    Double taxaPagamento(Double valor);

}
