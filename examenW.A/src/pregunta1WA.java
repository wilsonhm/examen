
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
public class pregunta1WA {
       public static void main(String[] args) {
        int opcion,salir;
        Scanner sc = new Scanner(System.in); 
        do{
            System.out.println("-------------------------------");
            System.out.println("Ingrese una opcion");  
            opcion = sc.nextInt();
            switch(opcion){
                case 1 : primero();break;
                
                
                default : System.out.println("Opcion no valida");break;
            }
            System.out.println("-------------------------------");
            System.out.println("Precione 1 para continuar");
            
            salir = sc.nextInt();
        }while(salir == 1);
    } 
    public static void primero(){
        Scanner in=new Scanner(System.in);
    int i,n;
    double categoria1,categoria2,categoria3,clave,costo;
    double impuesto, impuestoapagar;
    categoria1=0;
    categoria2=0;
    categoria3=0;
    impuestoapagar=0;
        System.out.println("ingrese el valor de n:");
        n=in.nextInt();
        in.nextLine();
        for (i=1; i<=n; i++) {
            System.out.println("proceso"+i);
            System.out.println("ingrese el valor de la clave");
            clave=in.nextDouble();
            System.out.println("ingrese el valor del costo:");
            costo=in.nextDouble();
            impuesto=0;
            if (clave==1)
            {
                impuesto=costo*0.1;
                categoria1=categoria1+impuesto;
            }
            if (clave==2)
            {
                impuesto=costo*0.07;
                categoria2=categoria2+impuesto;               
            }
            if (clave==3)
            {
                impuesto=costo*0.05;
                categoria3=categoria3+impuesto;
            }
            impuestoapagar=impuestoapagar+impuesto;
            System.out.println("valor del impuesto"+impuesto);
            System.out.println();
        }
        System.out.println("valor de categoria 1"+categoria1);
        System.out.println("valor de categoria 2"+categoria2);
        System.out.println("valor de categoria 3"+categoria3);
        System.out.println("valor de impuesto a pagar"+impuestoapagar);
    }
}

