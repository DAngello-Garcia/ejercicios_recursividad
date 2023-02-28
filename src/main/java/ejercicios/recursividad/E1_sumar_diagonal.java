package ejercicios.recursividad;

import javax.swing.*;

public class E1_sumar_diagonal {
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        int suma = 0;
        int[][] matriz = llenarMatriz(n, m);
        suma = sumarDiagonalMatriz(matriz);
    }

    private static int sumarDiagonalMatriz(int[][] matriz) {
        return 0;
    }

    private static int[][] llenarMatriz(int n, int m) {
        int[][] matriz = new int[n][m];
        for(int i = 0; i<n; i++) {
            for(int j = 0; j < m; j++) {
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número en la fila "+i+" y la columna "+j));
            }
        }
        return matriz;
    }
}
