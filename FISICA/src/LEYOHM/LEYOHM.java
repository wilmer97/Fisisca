package LEYOHM;

import java.util.Random;
import java.util.Scanner;

public class LEYOHM {

    public static void main(String[] args) {

            //Wilmer Danilo Moncada Parra

            Scanner Teclado = new Scanner(System.in);
            Random Aleatorio = new Random();

            int Resitencia1;
            int Resistencia2;
            int Resistencia3;
            int Resistencia4;
            int RT;
            
            double Corriente2;
            double Corriente3;
            double Corriente4;

            double Intencidad;
            double Voltaje;

            Resitencia1 = Aleatorio.nextInt(50);
            Resistencia2 = Aleatorio.nextInt(50);
            Resistencia3 = Aleatorio.nextInt(50);
            Resistencia4 = Aleatorio.nextInt(50);

            Voltaje = Aleatorio.nextInt(100);
            //Calcula el total de las resistencias
            RT = Resitencia1 + Resistencia2 + Resistencia3 + Resistencia4;
            System.out.println("La resistencia total es: " + RT);

            //Calcula el valor del voltaje
            System.out.println("El valor del voltaje es: "+ Voltaje);

            Intencidad=Voltaje/RT;
            Corriente2 =(Intencidad*Resistencia2);
            Corriente3 =(Intencidad*Resistencia3);
            Corriente4 =(Intencidad*Resistencia4);

            //Calcula el valor de la intensidad
            System.out.println("El valor de la intensidad es: " + Intencidad);

            //Valor de la resistencia1
            System.out.println("El valor del voltaje multiplicado por la resistencia 1 es: "+ Intencidad * Resitencia1);

            //Valor de la resistencia2
            System.out.println("El valor del voltaje multiplicado por la resistencia 2 es:" + Corriente2 + Intencidad * Resistencia2);

            //Valor de la resistencia3
            System.out.println("El valor del voltaje multiplicado por la resistencia 3 es: "+Corriente3 + Intencidad * Resistencia3);

            //Valor de la resistencia4
            System.out.println("El valor del voltaje multiplicado por la resistencia 4 es: "+Corriente4 + Intencidad * Resistencia3);

        }
}
