package ejercicios.recursividad;

import javax.swing.*;

public class E4_recorrer_arreglo {
    public static void main(String[] args) {
        int n = 2;
        int suma = 0;
        int[][] matriz = llenarMatriz(n);
        suma = sumarDiagonalMatriz(matriz, n-1, n-1);
        System.out.println("Suma: "+suma);
    }

    private static int sumarDiagonalMatriz(int[][] matriz, int i, int j) {
        if(i >= 0) {
            if(j >= 0) {
                return sumarDiagonalMatriz(matriz, i, j-1) + matriz[i][j];
            }
            return sumarDiagonalMatriz(matriz, i-1, matriz.length-1);
        }
        return 0;
    }

    private static int[][] llenarMatriz(int n) {
        int[][] matriz = new int[n][n];
        for(int i = 0; i<n; i++) {
            for(int j = 0; j < n; j++) {
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número en la fila "+i+" y la columna "+j));
            }
        }
        return matriz;
    }
}
