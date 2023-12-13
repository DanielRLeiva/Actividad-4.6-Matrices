/**
 * Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados
 * “Alumno 1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario introducirá las notas por
 * teclado y luego el programa mostrará la nota mínima, máxima y media de cada alumno.
 * 
 * @author Daniel Leiva
 */
public class Ejercicio4 {
    public static void main(String[] args) {

        while (true) {

            try {

                double[][] notas = new double[4][5];

                double notaMinima = 0;
                double notaMaxima = 0;
                double promedioNotas = 0;
                double sumaNotas = 0;

                for (int i = 0; i < notas.length; i++) {
                    for (int j = 0; j < notas[0].length; j++) {
                        System.out.println();
                        System.out.println("Ingrese para el alumno: " + (i + 1) + " la nota de la materia: " + (j + 1));
                        notas[i][j] = Double.parseDouble(System.console().readLine());

                        if (j == 0) {
                            notaMinima = notas[i][j];
                            notaMaxima = notas[i][j];
                        }
                        if (notaMinima > notas[i][j]) {
                            notaMinima = notas[i][j];
                        }
                        if (notaMaxima < notas[i][j]) {
                            notaMaxima = notas[i][j];
                        }

                        sumaNotas += notas[i][j];
                    }
                    promedioNotas = (sumaNotas / 5);

                    System.out.println();
                    System.out.println("La nota mínima del alumno " + (i + 1) + " es: " + notaMinima);
                    System.out.println();
                    System.out.println("La nota máxima del alumno " + (i + 1) + " es: " + notaMaxima);
                    System.out.println();
                    System.out.println("La nota media del alumno " + (i + 1) + " es: " + promedioNotas);

                    sumaNotas = 0;

                    System.err.println();
                }
            } catch (NumberFormatException nfe) {
                System.out.println();
                System.out.println("Valor Incorrecto. Ingrese un número entero: ");
                System.out.println();
            }
            System.exit(0);
        }
    }
}
