package testsoftware.projeto;

public class Temperatura {
    

    public double Celsius(double n) {
        return (n * 9/5) + 32;    
    }

    public double Farhrenheit(double c) {
        return (c - 32) * 5/9;
    }
    
}
