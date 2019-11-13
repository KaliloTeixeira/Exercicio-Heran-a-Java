package exerciciocaminhao;

public class Automovel extends Veiculo {
    private String modelo;
    
    public Automovel(float motor, int numRodas, String modelo){
        super(motor, numRodas);
        this.modelo=modelo;
    }
    
    public void setTipo(String modelo){
        this.modelo=modelo;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public void mostrarAuto(){
        System.out.println("========================================");
        System.out.println("Motor: " + motor);
        System.out.println("Numero de Rodas: " + numRodas);
        System.out.println("Modelo: " + modelo);
    }
}
