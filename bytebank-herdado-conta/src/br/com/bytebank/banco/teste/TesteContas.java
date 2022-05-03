package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SacaException;

public class TesteContas {

    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(111,111);
        cc.deposita(300.0);

        ContaPoupanca cp = new ContaPoupanca(222,222);
        cp.deposita(200.0);

        try{
            cc.transfere(200.0,cp);

        }catch(SacaException ex){
            System.out.println("Error: " + ex.getMessage());
        }

        System.out.println("CC: "+cc.getSaldo());
        System.out.println("CP: "+cp.getSaldo());
    }
}
