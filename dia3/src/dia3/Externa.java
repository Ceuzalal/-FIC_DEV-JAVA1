package dia3;

public class Externa {
    private int valor = 10;
    
    public class Interna{
       public void imprimeValor(){
        System.out.println("O valor da classe interna é " + valor);
       }
    }
    public class teste{
        public void teste(){
           System.out.println("Teste");
       }
    }
    public static void main(String[] args){
        Externa externa = new Externa();
        Externa.Interna interna = externa.new Interna();
        interna.imprimeValor();
    }
}

