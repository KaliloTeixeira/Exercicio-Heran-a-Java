package exerciciocaminhao;

public class Motocicleta extends Veiculo{
    private String marca;
    
    public Motocicleta(float motor, int numRodas, String marca){
        super(motor, numRodas);
        this.marca=marca;
    }
    
    public void setMarca(String marca){
        this.marca=marca;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void mostrarMoto(){
        System.out.println("========================================");
        System.out.println("Motor: " + motor);
        System.out.println("Numero de Rodas: " + numRodas);
        System.out.println("Marca: " + marca);
    }
}
