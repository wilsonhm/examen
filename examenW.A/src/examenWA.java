
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TEODORO
 */
public class examenWA {
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int vector[] = {1,2,3,6,9,10};
        examenWA b = new examenWA();
        System.out.print("Buscar: ");
        int buscar = teclado.nextInt();
        
      
        
       
        /*-*/ int posicion = b.busquedaBinaria(vector, buscar, 0, 5); 
       
        if(posicion==-1){
            System.out.println("No existe el numero");
        }else{
            System.out.println("Posicion: "+posicion);
        }
    }
    
    public int busquedaBinaria(int vector[], int dato, int inferior, int superior){
        int mitad;
        if(inferior > superior){
            return -1;
        }else{
            mitad = (inferior+superior)/2;
            if(dato==vector[mitad]){
                return mitad;
            }else if(dato>vector[mitad]){
                return busquedaBinaria(vector, dato, mitad+1, superior);
            }else{
                return busquedaBinaria(vector, dato, inferior, mitad-1);
            }
            
        }
    }
}
