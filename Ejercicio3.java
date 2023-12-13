/**
 * Crea un programa que cree una matriz de tamaño NxM (tamaño introducido por
 * teclado) e introduzca en ella NxM valores (también introducidos por teclado). Luego
 * deberá recorrer la matriz y al final mostrar por pantalla cuántos valores son
 * mayores que cero, cuántos son menores que cero y cuántos son igual a cero.
 * 
 * @ Daniel Leiva
 */
public class Ejercicio3 {
    public static void main(String[] args) {

        System.out.println("Introduzca un tamaño de matriz N: ");
        int N = Integer.parseInt(System.console().readLine());
        System.out.println();
        System.out.println("Ahora introduzaca un valor M para la matriz: ");
        int M = Integer.parseInt(System.console().readLine());

        int[][] matriz = new int[N][M];

        while (true) {

            try {
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[0].length; j++) {
                        System.out.println();
                        System.out.println("Ingrese el valor de la posición: [" + (i) + "][" + (j) + "]: ");
                        System.out.println();
                        matriz[i][j] = Integer.parseInt(System.console().readLine());
                    }
                }

            } catch (NumberFormatException nfe) {

                System.out.println("Valor incorrecto. Ingrese un número entero: ");
                System.out.println();
            }

            int mayorQueCero = 0;
            int menorQueCero = 0;
            int igualQueCero = 0;

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[0].length; j++) {
                    int valor = matriz[i][j];

                    if (valor > 0) {
                        mayorQueCero++;

                    } else if (valor < 0) {
                        menorQueCero++;

                    } else {
                        igualQueCero++;
                    }
                }
            }
            System.out.println();
            System.out.println("Valores mayores que cero: " + mayorQueCero);
            System.out.println();
            System.out.println("Valores menores que cero: " + menorQueCero);
            System.out.println();
            System.out.println("Valores iguales que cero: " + igualQueCero);
            System.exit(0);
        }
    }
}
