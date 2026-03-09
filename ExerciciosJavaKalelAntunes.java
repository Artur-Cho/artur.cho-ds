

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciosjava.kalelantunes;

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;
public class ExerciciosJavaKalelAntunes {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escreva um numero: ");
        int numero = scanner.nextInt();
        
        if (numero % 2 == 0)
        {
            System.out.println("Seu numero e par.");
            
        }
        else {
            System.out.println("Seu numero e impar.");
        }
    }
    
}
