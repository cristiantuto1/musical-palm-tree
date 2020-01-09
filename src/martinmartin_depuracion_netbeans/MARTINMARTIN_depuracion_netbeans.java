/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package martinmartin_depuracion_netbeans;

/*Crear un programa que realice un bucle de 0 a 10, y que obtenga en cada paso 
del bucle un número al azar entre 0 y 100.
 El programa compara el número obtenido y muestra un mensaje del tipo:
"El número al azar" # "es mayor/menor que 50"

Fija puntos de interrupción en las sentencias del bucle que se pueda.
Añade la inspección de la variable del bucle y de la variable que contiene el número al azar.
Depura el programa paso a paso para ver cómo se ejecuta y qué sentencias va ejecutando el programa.

 */
public class MARTINMARTIN_depuracion_netbeans {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for(int a=0;a<10;a++){
            int azar=(int)(1+100*Math.random());
            String menor;
            if(azar<50){
                menor="menor";
            }else if(azar==50){
                menor="igual";}
            else{
                menor="mayor";
            }
            System.out.println("El numero al azar "+azar+" es "+menor+" que 50");
        }
    }
    
}
