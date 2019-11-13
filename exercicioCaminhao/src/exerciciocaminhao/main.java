package exerciciocaminhao;
import java.util.Scanner;

public class main {
    
    public static void menu(){
        System.out.println("========= Programa de Veiculos =========");
        System.out.println("1 - Cadastrar Novo Veículo");
        System.out.println("2 - Imprimir Relatório de Veículos");
        System.out.println("3 - Sair");
        System.out.println("========================================");
    }
    public static void menuCadastro(){
        System.out.println("========= Escolha o tipo de Veículo =========");
        System.out.println("1 - Automovel");
        System.out.println("2 - Caminhao");
        System.out.println("3 - Motocicleta");
        System.out.println("4 - Sair");
        System.out.println("========================================");
    }

    public static void main(String[] args) {
        int menuOpcoes, opCadastro;
        float motor;
        int numRodas;
        String modelo, carga, marca;
        Scanner read = new Scanner(System.in);
        RepositorioVeiculos autos = new RepositorioVeiculos();
        
        do{
            menu();
            menuOpcoes = read.nextInt();
            
            switch(menuOpcoes){
                case 1: 
                    menuCadastro();
                    opCadastro = read.nextInt();
                    switch(opCadastro){
                        case 1:
                            System.out.println("Digite a Potencia do Motor(CV): ");
                            motor = read.nextFloat();
                            System.out.println("Digite o Numero de Rodas: ");
                            numRodas = read.nextInt();
                            System.out.println("Digite o Modelo do Veículo: ");
                            modelo = read.next();
                            Automovel auto1 = new Automovel(motor, numRodas, modelo);
                            autos.inserir(auto1);                            
                            break;
                        case 2:
                            System.out.println("Digite a Potencia do Motor(CV): ");
                            motor = read.nextFloat();
                            System.out.println("Digite o Numero de Rodas: ");
                            numRodas = read.nextInt();
                            System.out.println("Digite o tipo de Carga: ");
                            carga = read.next();
                            Caminhao auto2 = new Caminhao (motor, numRodas, carga);
                            autos.inserir(auto2);                            
                            break;
                        case 3:
                            System.out.println("Digite a Potencia do Motor(CC): ");
                            motor = read.nextFloat();
                            System.out.println("Digite o Numero de Rodas: ");
                            numRodas = read.nextInt();
                            System.out.println("Digite a Marca: ");
                            marca = read.next();
                            Motocicleta auto3 = new Motocicleta (motor, numRodas, marca);
                            autos.inserir(auto3);                            
                            break;
                        default:
                            break;
                    }
                    break;
                case 2: 
                    System.out.println("============== RELATÓRIO ===============");
                    autos.listaVeiculos();
                    System.out.println("========================================");
            }
        }while(menuOpcoes!=3);        
    }    
}
