public class TesteSiste {

    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.setSenha(2222);

        Administrador A = new Administrador();
        A.setSenha(5555);

        Cliente cliente=new Cliente();
        cliente.setSenha(2222);

        SistemaInterno si = new SistemaInterno();
        si.autentica(g);
        si.autentica(A);
        si.autentica(cliente);
    }
}
