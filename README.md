# Segundo Projeto de Demonstração de Injeção de Dependência em Java

Este projeto é um exemplo simples que demonstra o uso de injeção de dependência em Java.  Ele ilustra como calcular o valor de cada parcela, considerando juros e taxa de pagamento.

## Funcionalidades

O projeto consiste em classes e interfaces que realizam as seguintes funcionalidades:

- A classe `Contrato` representa um contrato com informações como número, data e valor total.
- A classe `Parcela` representa uma parcela do contrato, contendo informações como data e valor.
- A interface `ServicoPagamentoOnline` define os métodos `juro` e `taxaPagamento` para calcular juros e taxas de pagamento.
- A classe `ServicoPaypal` implementa a interface `ServicoPagamentoOnline` e calcula juros e taxas de pagamento específicos para o serviço Paypal.
- A classe `ServicoGerarParcelas` é responsável por gerar as parcelas do contrato com base na quantidade de meses e nos cálculos de juros e taxa de pagamento.

## Uso

O arquivo `Main.java` contém o método `main` que demonstra a geração das parcelas de um contrato usando o serviço Paypal.

```java
public static void main(String[] args) {
    String numero = "8028";
    LocalDate data = LocalDate.of(2018, 06, 25);
    Double valorTotal = 600.00;

    Contrato c = new Contrato(numero, data, valorTotal);
    Integer qtdParcelas = 3;

    ServicoGerarParcelas sgp = new ServicoGerarParcelas(new ServicoPaypal());

    sgp.gerarParcelas(qtdParcelas, c);

    for (Parcela p : c.getParcelas()) {
        System.out.println(p);
    }
}
