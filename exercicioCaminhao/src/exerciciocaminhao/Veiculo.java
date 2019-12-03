package exerciciocaminhao;

public class Veiculo {
    protected float motor;
    protected int numRodas;
    
    Veiculo(float motor, int numRodas){
        this.motor=motor;
        this.numRodas=numRodas;
    }
    
    public void setMotor(float motor){
        this.motor=motor;
    }
    
    public float getMotor(){
        return motor;
    }
    
    public void setRodas(int numRodas){
        this.numRodas=numRodas;
    }
    
    public int getRodas(){
        return numRodas;
    }
    
}
