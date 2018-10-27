/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicoslauraortizLuque;

/**
 *
 * @author Laura Ortiz Luque
 */
public class BasicosLauraOrtizLuque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        logicos();
    }
    
      public static void logicos() {

        //Declaración de variables
        Boolean primero;
        Boolean segundo;

        //Asignación de valores
        primero = true;
        segundo = false;

        //Mostrar en pantalla el contendido de las variables de tipos básicos.
        if (primero!=segundo){
            System.err.println("El valor de primero y el valor de segundo son distintos.");
        }
        else{
            System.out.println("El valor de primero y el valor de segundo son iguales.");
        }
  
    }
}
