package grande_loja;

public class Cliente {
	String nome;
    int idade;
    String cidade;
    String bairro;
    String rua;

    public void apresentarse() {
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }
}
