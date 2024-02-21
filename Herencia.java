package Herencia;

public class Herencia {

    public static void main(String[] args) {
        
        CarroBMW a;
        a = new CarroBMW();
        a.apagar();
        a.encender();
        a.turbo();

        CarroToyota b;
        b = new CarroToyota();
        b.apagar();
        b.encender();
        System.out.println(b.modelo());
}
}
