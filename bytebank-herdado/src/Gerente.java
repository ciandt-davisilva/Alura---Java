//Gerente é um funcionario, gerente gerda da classe Funcionario, assina o contrato autenticavel
public class Gerente extends Funcionario implements Autenticavel {

    private AutenticacaoUtil autenticador;

    public Gerente(){
        autenticador = new AutenticacaoUtil();
    }
    @Override
    public double getBonificacao() {
        System.out.println("Chamando o método de bonificaçao do GERENTE");
        return super.getSalario();
    }

    @Override
    public void setSenha(int senha) {
     this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
    return this.autenticador.autentica(senha);
    }
}
