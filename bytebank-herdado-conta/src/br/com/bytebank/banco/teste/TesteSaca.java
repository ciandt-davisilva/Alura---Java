package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SacaException;
//import br.com.bytebank.banco.modelo.SacaException;

public class TesteSaca {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente(2222, 2222);

        cc.deposita(200.0);

        try {
            cc.saca(210.0);
        } catch (SacaException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Saldo: "+cc.getSaldo());
    }
}
