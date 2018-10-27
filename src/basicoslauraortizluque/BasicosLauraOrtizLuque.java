/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicoslauraortizLuque;

/**
 *
 * @author HP
 */
public class BasicosLauraOrtizLuque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        numericos();//Llamada al método númericos
    }
    
     /**
     * Método para mostrar ejemplos de tipos numericos.
     */
    public static void numericos() {

        //Estos son los tipos básicos
        byte elMasPeque;
        short chiquitin;
        int entero;
        long duplicaEntero;
        float grande;
        double doble;

        //Ejemplos de asignación de valores a las variables de tipos básicos
        elMasPeque=127;
        chiquitin=32767;
        entero = 2147483647;
        duplicaEntero=214748364888898989l;
        grande=3.402823f;
        doble = 9.223372036854775075555555555555555555555555555d;

        //Mostrar en pantalla el contendido de las variables de tipos básicos.
        System.out.println("Valor byte");
        System.out.println(elMasPeque);
        System.out.println("Valor short");
        System.out.println(chiquitin);
        System.out.println("Valor entero");
        System.out.println(entero);
        System.out.println("Valor long");
        System.out.println(duplicaEntero);
        System.out.println("Valor float");
        System.out.println(grande);
        System.out.println("Valor double");
        System.out.println(doble);
    }
    
}