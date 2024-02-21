package Carro;

public class Ej{

public static void main (String[] args){


Carro vocho= new Carro();
vocho.Modelo="Vocho";
vocho.Marca="VW";
vocho.Color="Azul";

vocho.Enciende();
vocho.Acelera();
vocho.Frenar();

System.out.println("Marca : "+ vocho.Marca);
System.out.println("Modelo : "+ vocho.Modelo);
System.out.println("Color : "+ vocho.Color);

}
}