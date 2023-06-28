package teste;

import java.time.LocalDate;
import java.util.Scanner;
import model.entidades.Contrato;
import model.entidades.Parcela;
import model.servicos.ServicoGerarParcelas;
import model.servicos.ServicoPaypal;



public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
         String numero = "8028";
         LocalDate data = LocalDate.of(2018, 06, 25);
         Double valorTotal = 600.00;
         
         Contrato c = new Contrato(numero, data, valorTotal);
         Integer qtdParcelas = 3;
         
         ServicoGerarParcelas sgp = new ServicoGerarParcelas(new ServicoPaypal());
         
         sgp.gerarParcelas(3, c);
         
         
         for (Parcela p : c.getParcelas()) {
             System.out.println(p);
        }
        
        sc.close();
    }

}
