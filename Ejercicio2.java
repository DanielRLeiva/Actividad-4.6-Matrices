/**
 * Crea un programa que cree una matriz de 10x10 e introduzca los valores de las tablas 
 * de multiplicar del 1 al 10 (cada tabla en una fila). Luego mostrará la matriz por 
 * pantalla.
 * 
 * @ Daniel Leiva
 */
public class Ejercicio2 {
    public static void main(String[] args) {

        int[][] tablaMultiplicar = new int[10][10];

        
        for (int i = 0; i < tablaMultiplicar.length; i++) {
            for (int j = 0; j < tablaMultiplicar[0].length; j++) {
                tablaMultiplicar[i][j] = (i + 1)*(j +1);
            }
        }

        for (int i = 0; i < tablaMultiplicar.length; i++) {
            for (int j = 0; j < tablaMultiplicar[0].length; j++) {
                System.out.print(tablaMultiplicar[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}
