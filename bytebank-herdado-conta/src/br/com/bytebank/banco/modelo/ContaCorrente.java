package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel {

    public ContaCorrente(int agencia, int conta) {
        super(agencia, conta);
    }

    @Override
    public boolean saca(double valor) {
        double valorASacar = valor + 0.2;
        try {
            super.saca(valorASacar);
        } catch (SacaException ex) {
            System.out.println("Saldo insuficiente. \n Valor a sacar: " + valorASacar);
            ex.printStackTrace();
        }
        return true;
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

    @Override
    public double getValorImposto() {
        return super.saldo * 0.01;
    }

    @Override
    public String toString() {
        return "ContaCorrente, " + super.toString();
    }
}
