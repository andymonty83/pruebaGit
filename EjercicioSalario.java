package holamundo;

import java.util.Scanner;

public class EjercicioSalario {

    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

       System.out.println("Selecciona el tipo de empleado:");
        System.out.println("1 - Repositor");
        System.out.println("2 - Cajero");
        System.out.println("3 - Supervisor");

        int opcion = teclado.nextInt();

        double sueldo;

        switch (opcion) {

            case 1:
                sueldo = 15890 + (15890 * 0.10);
                System.out.println("El sueldo del repositor es: $" + sueldo);
                break;

            case 2:
                sueldo = 25630.89;
                System.out.println("El sueldo del cajero es: $" + sueldo);
                break;

            case 3:
                sueldo = 35560.20 - (35560.20 * 0.11);
                System.out.println("El sueldo del supervisor es: $" + sueldo);
                break;

            default:
                System.out.println("Opción no válida");
        }

        teclado.close();


        }

}
