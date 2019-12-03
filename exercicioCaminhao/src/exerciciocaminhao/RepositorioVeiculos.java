package exerciciocaminhao;

import javax.swing.JOptionPane;

public class RepositorioVeiculos {
    private Veiculo[] estoque;
    private String classe;
    private int indice;
    private static final int MAX = 10;
    
    public RepositorioVeiculos(){
        indice = 0;
        estoque = new Veiculo[MAX];
    }
    
    public void inserir(Veiculo auto){
        estoque[indice] = auto;
        indice++;
    }
    
    public void listar (){
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
            JOptionPane.showMessageDialog(null,"Veiculo: " + (i+1) + "\nTipo de Veículo: " + classe + "\nPotência: " + estoque[i].motor + "\nNumero de Rodas: " + estoque[i].numRodas);
        }
    }
}
