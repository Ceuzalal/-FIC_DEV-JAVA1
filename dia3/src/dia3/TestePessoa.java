package dia3;


public class TestePessoa {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa();
    p1.setNome("João");
    p1.setIdade(25);
    
    System.out.println("Nome: " + p1.getNome());
    System.out.println("Idade: " + p1.getIdade());
    }
}
