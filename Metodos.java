import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Metodos {

    public int[][] llenarMatriz(Scanner sc) {
        System.out.println("Ingrese la dimension de la matriz cuadrada:");
        int n = sc.nextInt();

        int[][] matriz = new int[n][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Ingrese valor [" + i + "][" + j + "]:");
                matriz[i][j] = sc.nextInt();
            }
        }

        return matriz;
    }

    public void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    // 4) Cambiar negativos por 0
    public void cambiarNegativosPorCero(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0) {
                    matriz[i][j] = 0;
                }
            }
        }
    }

    // 1) Multiplicar matrices y guardar resultado en cola
    public Queue<Integer> multiplicarMatricesEnCola(int[][] a, int[][] b) {
        Queue<Integer> cola = new LinkedList<>();
        int n = a.length;
        int[][] resultado = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                resultado[i][j] = 0;

                for (int k = 0; k < n; k++) {
                    resultado[i][j] += a[i][k] * b[k][j];
                }

                cola.offer(resultado[i][j]);
            }
        }

        return cola;
    }

    public void mostrarCola(Queue<Integer> cola) {
        for (Integer num : cola) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // 2) Media de una matriz
    public double mediaMatriz(int[][] matriz) {
        int suma = 0;
        int cantidad = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
                cantidad++;
            }
        }

        return (double) suma / cantidad;
    }

    // 3) Factorial de la media
    public long factorialMedia(double media) {
        int num = (int) media;
        long fact = 1;

        if (num < 0) {
            return 0;
        }

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        return fact;
    }
}