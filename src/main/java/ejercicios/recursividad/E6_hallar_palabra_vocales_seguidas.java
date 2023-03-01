package ejercicios.recursividad;

import java.util.ArrayList;

public class E6_hallar_palabra_vocales_seguidas {


        public static void main(String[] args) {
            String[][] matriz = { { "casa", "perro", "auto", "mesa" }, { "letra", "libro", "avion", "flor" },
                    { "taza", "agua", "computadoraaa", "papel" }, { "árbol", "oso", "gato", "sol" } };

            ArrayList<String> palabras = new ArrayList<>();
            recorrerMatriz(matriz, 0, 0, palabras);

            System.out.println(palabras);
        }

        public static void recorrerMatriz(String[][] matriz, int i, int j, ArrayList<String> listaPalabras) {
            if (i >= matriz.length) {
                return;
            }

            if (j >= matriz[i].length) {
                recorrerMatriz(matriz, i + 1, 0, listaPalabras);
                return;
            }

            if (verificarVocalesSeguidas(matriz[i][j], 0)) {
                listaPalabras.add(matriz[i][j]);
            }

            recorrerMatriz(matriz, i, j + 1, listaPalabras);
        }

        public static boolean verificarVocalesSeguidas(String palabra, int index) {
            if (index >= palabra.length() - 1) {
                return false;
            }

            char letra1 = palabra.charAt(index);
            char letra2 = palabra.charAt(index + 1);

            if (esVocal(letra1) && esVocal(letra2)) {
                return true;
            }

            return verificarVocalesSeguidas(palabra, index + 1);
        }

        public static boolean esVocal(char letra) {
            return letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u';
        }
    }


