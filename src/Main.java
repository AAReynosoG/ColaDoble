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
            System.out.println("1. Insertar al inicio o al final.");
            System.out.println("2. Borrar Cola.");
            System.out.println("3. Ver cola.");
            System.out.println("4. Eliminar del inicio o del final.");
            System.out.println("5. Créditos.");
            System.out.println("6. Salir.");
            System.out.println("==================================\n");
            System.out.print("Selecciona una opción: ");

            option = sc.nextLine();

            switch (option) {
                case "1":
                    try {
                        System.out.print("Ingresa el valor que deseas insertar en la cola: ");
                        int valor = Integer.parseInt(sc.nextLine());
                        System.out.print("Ingresa '1' para insertar al inicio o '2' para insertar al final: ");
                        String subOption = sc.nextLine();
                        boolean alFinal = "2".equals(subOption);
                        cd.Insertar(valor, alFinal);
                    } catch (NumberFormatException e) {
                        System.out.println("Error: Debes ingresar un número.");
                    }
                    break;
                case "2":
                    cd.BorrarCola();
                    break;
                case "3":
                    cd.VerCola();
                    break;
                case "4":
                        System.out.print("Ingresa '1' para eliminar del inicio o '2' para eliminar del final: ");
                        String subOption = sc.nextLine();
                        boolean delFinal = "2".equals(subOption);
                        cd.Eliminar(delFinal);
                    break;
                case "5":
                    Creditos.Creditos(); 
                    break;
                case "6":
                    System.out.println("Chau!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción válida.");
                    break;
            }
            System.out.println("Presiona 'Enter' para continuar...");
            sc.nextLine();
        } while (!option.equals("6"));
        sc.close();
    }
}
