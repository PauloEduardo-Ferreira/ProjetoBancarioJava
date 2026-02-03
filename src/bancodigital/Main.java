package bancodigital;

import bancodigital.model.TipoTransacao;
import bancodigital.model.Transacao;

import java.math.BigDecimal;


public class Main {

    public static void main(String[] args) {

        Transacao t = new Transacao(TipoTransacao.DEPOSITO, new BigDecimal("100.00"));

        System.out.println(t.getValor());
    }
}
