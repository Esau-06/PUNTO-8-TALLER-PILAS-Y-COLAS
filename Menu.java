import java.util.Scanner;
import java.util.Queue;

public class Menu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Metodos m = new Metodos();

        int[][] matrizA = null;
        int[][] matrizB = null;
        Queue<Integer> colaResultado;

        boolean seguir = true;

        while (seguir) {
            System.out.println("\n--- MENU PUNTO 8 ---");
            System.out.println("1) Llenar matriz A");
            System.out.println("2) Llenar matriz B");
            System.out.println("3) Mostrar matrices");
            System.out.println("4) Cambiar negativos por 0");
            System.out.println("5) Multiplicar A * B y mostrar en cola");
            System.out.println("6) Mostrar medias y cual es mayor");
            System.out.println("7) Factorial de la media de A y B");
            System.out.println("8) Salir");

            int opt = sc.nextInt();

            switch (opt) {
                case 1:
                    matrizA = m.llenarMatriz(sc);
                    break;

                case 2:
                    matrizB = m.llenarMatriz(sc);
                    break;

                case 3:
                    if (matrizA != null) {
                        System.out.println("Matriz A:");
                        m.mostrarMatriz(matrizA);
                    } else {
                        System.out.println("Matriz A no ha sido llenada");
                    }

                    if (matrizB != null) {
                        System.out.println("Matriz B:");
                        m.mostrarMatriz(matrizB);
                    } else {
                        System.out.println("Matriz B no ha sido llenada");
                    }
                    break;

                case 4:
                    if (matrizA != null && matrizB != null) {
                        m.cambiarNegativosPorCero(matrizA);
                        m.cambiarNegativosPorCero(matrizB);
                        System.out.println("Negativos cambiados por 0");
                    } else {
                        System.out.println("Debe llenar ambas matrices");
                    }
                    break;

                case 5:
                    if (matrizA != null && matrizB != null) {
                        colaResultado = m.multiplicarMatricesEnCola(matrizA, matrizB);
                        System.out.println("Resultado A * B en cola:");
                        m.mostrarCola(colaResultado);
                    } else {
                        System.out.println("Debe llenar ambas matrices");
                    }
                    break;

                case 6:
                    if (matrizA != null && matrizB != null) {
                        double mediaA = m.mediaMatriz(matrizA);
                        double mediaB = m.mediaMatriz(matrizB);

                        System.out.println("Media matriz A: " + mediaA);
                        System.out.println("Media matriz B: " + mediaB);

                        if (mediaA > mediaB) {
                            System.out.println("La media mayor es la de la matriz A");
                        } else if (mediaB > mediaA) {
                            System.out.println("La media mayor es la de la matriz B");
                        } else {
                            System.out.println("Las medias son iguales");
                        }
                    } else {
                        System.out.println("Debe llenar ambas matrices");
                    }
                    break;

                case 7:
                    if (matrizA != null && matrizB != null) {
                        double mediaA = m.mediaMatriz(matrizA);
                        double mediaB = m.mediaMatriz(matrizB);

                        long factA = m.factorialMedia(mediaA);
                        long factB = m.factorialMedia(mediaB);

                        System.out.println("Factorial de la media de A: " + factA);
                        System.out.println("Factorial de la media de B: " + factB);
                    } else {
                        System.out.println("Debe llenar ambas matrices");
                    }
                    break;

                case 8:
                    seguir = false;
                    System.out.println("Fin del programa");
                    break;

                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }

        sc.close();
    }
}