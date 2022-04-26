public class testeFuncionario {

    public static void main(String[] args) {
        Gerente nico = new Gerente();
        nico.setNome("Nico stefanio");
        nico.setCpf("141.208.096-76");
        nico.setSalario(2600.0);

        System.out.println(nico.getNome());
        System.out.println(nico.getBonificacao());

    }
}
