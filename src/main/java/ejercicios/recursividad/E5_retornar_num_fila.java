package ejercicios.recursividad;

import javax.swing.*;

public class E5_retornar_num_fila {
    /*
    Retornar el número de la fila de la matriz cuya suma de todos sus elementos sea mayor.
     */
    public static void main(String[] args) {
        int n = 2;
        int m = 3;
        int index = 0;
        int[][] matriz = llenarMatriz(n, m);
        index = retornarFilaMayor(matriz, n, m, index);
        System.out.println("El número de veces que está "+elem+" es: "+contador);
    }

    private static int retornarFilaMayor(int[][] matriz, int i, int j, int index) {
        if(i==0) {
            if(j<matriz[0].length) {
                return retornarFilaMayor(matriz, i, j+1, index) + matriz[i][j];
            } else {
                return retornarFilaMayor(matriz, i+1, 0, index);
            }
        }
        if(i < matriz.length) {
            if(retornarFilaMayor(matriz, i, j, index) > retornarFilaMayor(matriz, 0, j, index))
                return index;
        }
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
