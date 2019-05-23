/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TEODORO
 */
public class pregunta2WA {
private static int numeros[] = {42,57,14,40,96,19,8,68,1,4};

public static void main(String[] args){
    System.out.println("arreglo sin orden:");
for (int num: numeros){
    
    System.out.println(num);
}
    System.out.println();
    
    System.out.println("orden ascendente:");
    ordSelAsc(numeros);
    for(int num: numeros){
        System.out.println(num);
    }
    System.out.println();
    
    System.out.println("orden descendente:");
    ordSelDesc(numeros);
    for(int num : numeros){
        System.out.println(num);
        
    }
}
static void ordSelAsc(int[]arreglo){
    for(int i=0;i < arreglo.length -1 ; i++){
        int min =i;
    for (int j = i+1; j < arreglo.length; j++) {
        if(arreglo[j] < arreglo[min]){
            min = j;
        }        
        }
    if(i != min){
        int aux=arreglo[i];
        arreglo[i]=arreglo[min];
        arreglo[min]=aux;
    }
    }
}
static void ordSelDesc(int[]arreglo){
    for(int i =0; i < arreglo.length -1; i++){
        int max = 1;
        for(int j =i +1; j < arreglo.length;j++){
            if (arreglo[j]>arreglo[max]){
                max=j;
                
            }
            
        }
    }
}
}
