package exerciciocaminhao;
import javax.swing.JOptionPane;

public class main {
    public static void main(String[] args) {
        int menuOpcoes, opCadastro;
        int motor, numRodas;
        String modelo, carga, marca;
        RepositorioVeiculos autos = new RepositorioVeiculos();
        
        do{
            menuOpcoes = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - Cadastrar Novo Veículo\n2 - Imprimir Relatório de Veículos\n3 - Sair"));
            
            switch(menuOpcoes){
                case 1: 
                    opCadastro = Integer.parseInt(JOptionPane.showInputDialog("======== Tipo de Veículo ========\n1 - Automovel\n2 - Caminhao\n3 - Motocicleta\n4 - Sair"));
                    switch(opCadastro){
                        case 1:
                            motor = Integer.parseInt(JOptionPane.showInputDialog("Digite a Potencia do Motor(CV):"));
                            numRodas = Integer.parseInt(JOptionPane.showInputDialog("Digite o Numero de Rodas:"));
                            modelo = JOptionPane.showInputDialog("Digite o Modelo do Veiculo:");
                            Automovel auto1 = new Automovel(motor, numRodas, modelo);
                            autos.inserir(auto1);                            
                            break;
                        case 2:
                            motor = Integer.parseInt(JOptionPane.showInputDialog("Digite a Potencia do Motor(CV):"));
                            numRodas = Integer.parseInt(JOptionPane.showInputDialog("Digite o Numero de Rodas:"));
                            carga = JOptionPane.showInputDialog("Digite o Tipo de Carga:");
                            Caminhao auto2 = new Caminhao (motor, numRodas, carga);
                            autos.inserir(auto2);                            
                            break;
                        case 3:
                            motor = Integer.parseInt(JOptionPane.showInputDialog("Digite a Potencia do Motor(CC):"));
                            numRodas = Integer.parseInt(JOptionPane.showInputDialog("Digite o Numero de Rodas:"));
                            marca = JOptionPane.showInputDialog("Digite a Marca:");
                            Motocicleta auto3 = new Motocicleta (motor, numRodas, marca);
                            autos.inserir(auto3);                            
                            break;
                        default:
                            break;
                    }
                    break;
                case 2: 
                    autos.listar();
            }
        }while(menuOpcoes!=3);        
    }    
}
