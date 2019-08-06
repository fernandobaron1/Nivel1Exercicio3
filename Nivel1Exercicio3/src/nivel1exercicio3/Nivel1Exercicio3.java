
package nivel1exercicio3;

import java.util.Scanner;


public class Nivel1Exercicio3 {

    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        System.out.println ("Informe o Salário");
        double salario = leia.nextDouble();
        
        System.out.println ("Informe o percentual a ser reajustado");
        double percentual = leia.nextDouble();
        
        double resultado = (salario + (salario * percentual/100));
        System.out.println("O Salário reajustado é R$: "+resultado);

    }
    
}
