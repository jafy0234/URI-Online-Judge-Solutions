public class GaussJordan {

    public static void main(String[] args) {
        double[][] matriz = {
            {2, 1, -1, 8},
            {-3, -1, 2, -11},
            {-2, 1, 2, -3}
        };

        System.out.println("Matriz inicial:");
        mostrarMatriz(matriz);

        gaussJordan(matriz);

        System.out.println("\nMatriz final:");
        mostrarMatriz(matriz);
    }

    public static void gaussJordan(double[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int i = 0; i < filas; i++) {
            // Pivote actual
            double pivote = matriz[i][i];

            // Hacer el pivote igual a 1
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] /= pivote;
            }

            // Hacer ceros en las otras filas
            for (int k = 0; k < filas; k++) {
                if (k != i) {
                    double factor = matriz[k][i];
                    for (int j = 0; j < columnas; j++) {
                        matriz[k][j] -= factor * matriz[i][j];
                    }
                }
            }

            System.out.println("\nPaso " + (i + 1) + ":");
            mostrarMatriz(matriz);
        }
    }

    public static void mostrarMatriz(double[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas - 1; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("| " + matriz[i][columnas - 1]);
        }
    }
}
