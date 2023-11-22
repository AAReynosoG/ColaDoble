import java.util.Scanner;

public class ColaDoble {

    final static int MAX = 2;
    static int[] cola = new int[MAX];
    static int inicio = -1;
    static int fin = -1;

    Scanner sc = new Scanner(System.in);

    public boolean estaLlena(){
        return (fin + 1) % MAX == inicio;
    }


    public void Insertar(int valor) {

        Scanner sc = new Scanner(System.in);

        if ((inicio == 0 && fin == MAX - 1) || (fin + 1) % MAX == inicio) {
            System.out.println("La cola ya esta llena.");
            return;
        }
        else{
            if (inicio == -1) {
                inicio = fin = 0;
                cola[fin] = valor;
                System.out.println("Tú elemento: " + valor + " Se inserto en la posicion: " + "[" + fin + "]");
            } else {
                System.out.println("¿Quieres Insertar por el final de la cola? \n 1).Si \n 2).No");
                String opcion = sc.nextLine();
                switch (opcion) {
                    case "1":
                        if ((fin + 1) % MAX == inicio) { //fin == MAX - 1// <- otra manera de validar los datos
                            System.out.println("No se puede insertar por el final, la cola ya esta llena.");
                        } else {
                            fin = (fin + 1) % MAX;
                            cola[fin] = valor;
                            System.out.println("Tú elemento: " + valor + " Se inserto en la posicion: " + "[" + fin + "]");
                        }
                        break;
                    case "2":
                        if (inicio == 0) {
                            inicio = MAX - 1;
                        } else {
                            inicio = inicio - 1;
                        }
                        cola[inicio] = valor;
                        System.out.println("Tú elemento: " + valor + " Se inserto en la posicion: " + "[" + inicio + "]");
                        break;
                }

            }
        }
    }

    public int[] BorrarCola() {
        if (inicio == -1 && fin == -1) {
            System.out.println("La cola ya esta vacía");
        } else {
            System.out.println("Cola borrada.");
        }
        inicio = -1;
        fin = -1;
        return new int[MAX];
    }

    public void VerCola() {
        if (inicio == -1 && fin == -1) {
            System.out.println("Cola vacía");
        } else {
            int i = inicio;
            while (true){
                System.out.println(cola[i] + "[" + i + "]");
                if (i == fin){
                    break;
                }
                i = (i + 1) % MAX;
            }
            System.out.println();
        }
    }


    public void EliminarItem() {
        if (inicio == -1 && fin == -1) {
            System.out.println("No hay nada que borrar. La cola esta vacía.");
        } else {

            System.out.println("¿Quieres eliminar por el inicio o final de la cola? \n 1).Inicio \n 2).Final");
            String opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    System.out.println("Se elimino el numero: " + cola[inicio] + " de la posicion: " + inicio);
                    if(inicio == fin){
                        inicio = -1;
                        fin = -1;
                    }else{
                        inicio = (inicio + 1) % MAX;
                    }
                    break;
                case "2":
                    System.out.println("Se elimino el numero: " + cola[fin] + " de la posicion: " + fin);
                    if(inicio == fin){
                        inicio = -1;
                        fin = -1;
                    }else{
                        fin = (fin - 1 + MAX) % MAX;
                    }
                    break;
            }
        }
    }


}