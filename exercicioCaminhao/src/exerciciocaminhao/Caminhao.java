package exerciciocaminhao;

public class Caminhao extends Veiculo {
    private String carga;
    
    public Caminhao(float motor, int numRodas, String carga){
        super(motor, numRodas);
        this.carga=carga;
    }
    
    public void setCarga(String carga){
        this.carga=carga;
    }
    
    public String getCarga(){
        return carga;
    }
    
    public void mostrarCaminhao(){
        System.out.println("========================================");
        System.out.println("Motor: " + motor);
        System.out.println("Numero de Rodas: " + numRodas);
        System.out.println("Carga: " + carga);
    }
}
