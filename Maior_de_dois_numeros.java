/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosjava.kalelantunes;

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;
public class Maior_de_dois_numeros {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escreva um número: ");
        int numero1 = scanner.nextInt();
        
        System.out.println("Escreva um outro número: ");
        int numero2 = scanner.nextInt();
        
        if (numero1 > numero2 ) 
        {
            System.out.println("O primeiro numero digitado e maior que o segundo");
        }
        else if (numero2 > numero1) 
        {
            System.out.println("O segundo numero digitado e maior que o primeiro");
        }
        else {
            System.out.println("Os numeros sao iguais");
        }
    }
    
}
