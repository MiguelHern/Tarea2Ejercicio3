/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2ejercicio3;
import java.util.Scanner;
/**
 *
 * @author ROCIO
 */
public class Tarea2Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce una hora para saber tu horario");
        int hora = entrada.nextInt();
        
        if(hora >= 1 && hora <= 24){
            if(hora == 6){
                System.out.println("Despertar a las " + hora + "am");
            } else if(hora == 7){
                System.out.println("Bañarse y cepillarse los dientes a las " + hora + "am");
            } else if(hora >= 8 && hora < 9){
                System.out.println("Desayunar a las" + hora + "am");
            } else if(hora >= 9 && hora < 10){
                System.out.println("Entrar a la clase desde las 9 am a las 10 am");
            } else if(hora >= 10 && hora < 12){
                System.out.println("Entrar a la clase de 10am");
            } else if(hora == 12){
                System.out.println("Entrar a la clase de 12pm");
            } else if(hora >= 13 && hora < 15){
                System.out.println("Almorzar y jugar");
            } else if(hora == 15){
                System.out.println("Tomar una siesta");
            } else if(hora >= 16 && hora < 18 ){
                System.out.println("Realizar las tareas");
            } else if(hora >= 18 && hora < 20){
                System.out.println("Hacer ejercicio");
            } else if(hora == 20){
                System.out.println("Cenar");
            } else if(hora >= 21 && hora < 23){
                System.out.println("Jugar videojuegos");
            } else if((hora >= 23 && hora <= 24) || (hora >= 1 && hora < 6)){
                System.out.println("Acostarse");
            }
        } else {
            System.out.println("Introduce una hora valida");
        }
    }
    
}
