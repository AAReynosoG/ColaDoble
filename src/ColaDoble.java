import java.util.Scanner;

public class ColaDoble {

    final static int MAX = 5; 
    int[] cola = new int[MAX];
    int inicio = -1;
    int fin = -1;

    public void Insertar(int valor, boolean alFinal) {
        if ((inicio == 0 && fin == MAX - 1) || (fin + 1) % MAX == inicio) {
            System.out.println("La cola ya está llena.");
            return;
        }

        if (inicio == -1) { 
            inicio = 0;
            fin = 0;
        } else if (alFinal) {
            fin = (fin + 1) % MAX;
        } else {
            inicio = (inicio - 1 + MAX) % MAX;
        }
        cola[alFinal ? fin : inicio] = valor;
        System.out.println("Elemento " + valor + " insertado en la posición: [" + ((alFinal ? fin : inicio)) + "]");
    }

    public void Eliminar(boolean delFinal) {
        if (inicio == -1) {
            System.out.println("La cola está vacía.");
            return;
        }
    
        int pos = delFinal ? fin : inicio;
        int elementoEliminado = cola[pos];
        
        System.out.println("Elemento " + elementoEliminado + " eliminado del " + (delFinal ? "final" : "inicio") + " en la posición: [" + pos + "]");
    
        if (inicio == fin) {
            inicio = -1;
            fin = -1;
        } else if (delFinal) {
            fin = (fin - 1 + MAX) % MAX;
        } else {
            inicio = (inicio + 1) % MAX;
        }
    }
    

    public void VerCola() {
        if (inicio == -1) {
            System.out.println("Cola vacía");
            return;
        }
        System.out.println("Contenido de la cola:");
        int i = inicio;
        do {
            System.out.println("Posición [" + i + "] : " + cola[i]);
            i = (i + 1) % MAX;
        } while (i != (fin + 1) % MAX);
        System.out.println(); 
    }
    

    public void BorrarCola() {
        inicio = -1;
        fin = -1;
        System.out.println("Cola borrada.");
    }
}
