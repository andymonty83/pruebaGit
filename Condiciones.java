package holamundo;

import java.util.Scanner;

public class Condiciones {

    public static void main(String[] args) throws Exception {

        double n1, n2;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime el primer double:");
        n1 = teclado.nextDouble();
        System.out.println("Dime el segundo double:");
        n2 = teclado.nextDouble();

        if (n1 > n2 )
        System.out.println("Entonces N1 es mayor que N2");
       else {
        if (n1 == n2)
            System.out.println("Son IGUALES");
       else
         System.out.println("Entonces N1 es menor que N2");
        }

        teclado.close();


   } 

}
