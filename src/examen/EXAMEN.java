/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class EXAMEN {

    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
                int numero;
                
    System.out.println("Ingrese el tamaño que tendrá el arreglo: ");
                numero=sc.nextInt();
                int arreglo[]=new int[numero];
                
    System.out.println("Ingrese "+ numero+ " valores enteros: ");
                for(int ent=0; ent<numero; ent++)
                    {         
                    arreglo[ent]=sc.nextInt();    
                    }
                
                int back=0;

                for(int ent2=0; ent2<numero; ent2++)
                    {
                        for(int ent3=0; ent3<numero-1; ent3++)
                            { 
                           if(arreglo[ent3] > arreglo[ent3+1])
                                {
                                back= arreglo[ent3];
                                arreglo[ent3]= arreglo[ent3+1];
                                arreglo[ent3+1]= back;
                                }
                            }
                    }
                
                int et = 0;
            
    System.out.println("Ahota se muestran los Números Ordenados: ");
                 while(et < numero)
                {
    System.out.println(arreglo[et]);
                et++;
                }  
    
    }
    
}
