//contrato Autenticavel
   // quen assinar esse contrato, precisa implementar
       //meto setSenha
       //metodo autentica

public abstract interface Autenticavel {


    public abstract void setSenha(int senha);

    public abstract boolean autentica(int senha);
}
