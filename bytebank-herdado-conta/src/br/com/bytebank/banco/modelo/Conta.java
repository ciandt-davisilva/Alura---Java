package br.com.bytebank.banco.modelo;

/**
 * Classe que representa a implementação de uma conta
 *
 * @author Davi Costa
 */

public abstract class Conta {
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    /**
     * Contrutor para inicializar o objeto conta a partir da agencia e numero
     *
     * @param agencia
     * @param numero
     */
    public Conta(int agencia, int numero) {
        Conta.total++;
        this.agencia = agencia;
        this.numero = numero;
    }

    public abstract void deposita(double valor);


    /**
     * Método que verifica se o saldo é maior que o valor a ser sacado e lança uma exceçao caso contrario
     *
     * @param valor
     * @throws SacaException
     */
    public boolean saca(double valor) throws SacaException {

        if (this.saldo < valor) {
            throw new SacaException("Saldo: " + this.saldo + ", Valor a sacar: " + saldo);
        } else {
            this.saldo -= valor;
            return true;
        }

    }


    public boolean transfere(double valor, Conta destino) throws SacaException {
        if (!this.saca(valor)) {
            destino.deposita(valor);
            return true;
        } else {
            throw new SacaException(("Valor inválido"));
        }
    }

    public Conta() {
        super();
    }

    @Override
    public boolean equals(Object ref) {

        Conta outra = (Conta) ref;

        if (this.agencia != outra.agencia) {
            return false;
        }
        if (this.numero != outra.numero) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Numero: " + this.numero + ", Agencia: " + this.agencia;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public static int getTotal() {
        return Conta.total;
    }
}
