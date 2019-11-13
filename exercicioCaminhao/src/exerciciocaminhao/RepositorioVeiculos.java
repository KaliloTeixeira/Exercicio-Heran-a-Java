package exerciciocaminhao;

public class RepositorioVeiculos {
    private Veiculo[] estoque;
    private String classe;
    private int indice;
    private static final int max = 10;
    
    public RepositorioVeiculos(){
        indice = 0;
        estoque = new Veiculo[max];
    }
    
    public void inserir(Veiculo auto){
        estoque[indice] = auto;
        indice++;
    }
    
    public void listaVeiculos (){
        for (int i = 0; i < indice; i++) {
            classe = estoque[i].getClass().toString();
            switch(classe){
                case "class exerciciocaminhao.Automovel":
                    classe = "Automóvel";
                    break;
                case "class exerciciocaminhao.Caminhao":
                    classe = "Caminhão";
                    break;
                default:
                    classe = "Motocicleta";
                    break;
            }             
            
            System.out.println("========================================");
            System.out.println("Tipo de Veículo: " + classe);
            System.out.println("Potência: " + estoque[i].motor);
            System.out.println("Numero de Rodas: " + estoque[i].numRodas);
        }
    }
}
