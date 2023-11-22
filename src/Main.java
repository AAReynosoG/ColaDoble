import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String option;
        ColaDoble cd = new ColaDoble();

        do {
            System.out.println("\n==================================");
            System.out.println("           Menú de Opciones");
            System.out.println("==================================");
            System.out.println("1. Insertar.");
            System.out.println("2. Borrar Cola.");
            System.out.println("3. Ver cola.");
            System.out.println("4. Eliminar item.");
            System.out.println("5. Creditos.");
            System.out.println("6. Salir.");
            System.out.println("==================================\n");
            System.out.print("Selecciona una opción: ");

            option = sc.nextLine();

            switch (option) {
                case "1":
                    try {
                        System.out.print("Ingresa el valor que deseas insertar en la cola: ");
                        int valor = Integer.parseInt(sc.nextLine());
                        cd.Insertar(valor);
                        System.out.println("Presiona 'Enter' para continuar...");
                        sc.nextLine();
                    } catch (NumberFormatException e) {
                        System.out.println("Error: Debes ingresar un número.");
                        System.out.println("Presiona 'Enter' para continuar...");
                        sc.nextLine();
                    }
                    break;
                case "2":
                    cd.BorrarCola();
                    System.out.println("Presiona 'Enter' para continuar...");
                    sc.nextLine();
                    break;
                case "3":
                    cd.VerCola();
                    System.out.println("Presiona 'Enter' para continuar...");
                    sc.nextLine();
                    break;
                case "4":
                    cd.EliminarItem();
                    System.out.println("Presiona 'Enter' para continuar...");
                    sc.nextLine();
                    break;
                case "5":
                    Creditos.Creditos();
                    break;
                case "6":
                    System.out.println("Chau!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción válida.");
                    System.out.println("Presiona 'Enter' para continuar...");
                    sc.nextLine();
                    break;
            }
        } while (!option.equals("6"));
        sc.close();
    }
}
