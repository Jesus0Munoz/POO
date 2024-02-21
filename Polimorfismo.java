package Polimorfismo;

public class Polimorfismo {
    
    public static void main(String[] args) {
        
        Carro a;
        a = new Carro();
        a.informacion();

        Carro b;
        b = new CarroBMW();
        b.informacion();

        Carro c;
        c = new CarroToyota();
        c.informacion();
    }
}
