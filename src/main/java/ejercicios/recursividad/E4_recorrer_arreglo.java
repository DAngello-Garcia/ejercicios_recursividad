package ejercicios.recursividad;

import javax.swing.*;

public class E4_recorrer_arreglo {
    /*
    Recorra el arreglo desde la primera posición hasta la última posición y retorne el número de veces que se repite el elemento. Parámetros: vector[] (arreglo en el cual se encuentran los elementos), inicio (es el inicio del vector), fin (es el fin del vector), elem (es el número a buscar dentro del arreglo).
     */
    public static void main(String[] args) {
        int n = 5;
        int contador = 0;
        int inicio = 0;
        int fin = n-1;
        int elem = 3;
        int[] vector = llenarArreglo(n);
        contador = recorrerArreglo(vector, inicio, fin, elem);
        System.out.println("El número de veces que está "+elem+" es: "+contador);
    }

    private static int recorrerArreglo(int[] vector, int inicio, int fin, int elem) {
        if(inicio <= fin) {
            if(vector[inicio] == elem)
                return recorrerArreglo(vector, inicio+1, fin, elem) +1;
            return recorrerArreglo(vector, inicio+1, fin, elem);
        }
        return 0;
    }

    private static int[] llenarArreglo(int n) {
        int [] vector = new int[n];
        for(int i = 0; i < n; i++) {
            vector[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número en la posición "+i));
        }
        return vector;
    }
}
