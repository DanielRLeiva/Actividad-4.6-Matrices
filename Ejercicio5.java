/**
 * Necesitamos crear un programa para registrar sueldos de hombres y mujeres de
 * una empresa y detectar si existe brecha salarial entre ambos. El programa pedirá
 * por teclado la información de N personas distintas (valor también introducido por teclado).
 * Para cada persona, pedirá su género (0 para varón y 1 para mujer) y su sueldo. Esta
 * información debe guardarse en una única matriz. Luego se mostrará por pantalla el sueldo medio
 * de cada género.
 * 
 * @author Daniel Leiva
 */
public class Ejercicio5 {
    public static void main(String[] args) {

        while (true) {

            try {
                System.out.println("Ingrese una cantidad de personas: ");
                int cantidadDePersonas = Integer.parseInt(System.console().readLine());

                double[][] registroSueldos = new double[cantidadDePersonas][2];

                

                for (int i = 0; i < registroSueldos.length; i++) {
                    for (int j = 0; j < registroSueldos[0].length; j++) {

                        if (j == 0) {
                            System.out.println("Ingrese el genero (0 para varon o 1 para mujer) de la persona " + (i + 1) + ": ");
                            registroSueldos[i][j] = Double.parseDouble(System.console().readLine());
                        }

                        if (j == 1) {
                            System.out.println("Ingrese el sueldo de esa persona: ");
                            registroSueldos[i][j] = Double.parseDouble(System.console().readLine());
                        }
                    }
                }

                for ( int i = 0; i < registroSueldos.length; i++) {
                    for ( int j = 0; j < registroSueldos[0].length; j ++) {
                        System.out.print(registroSueldos[i][j] + "\t");
                    }
                    System.out.println();
                }

                Double varones = 0.0;
                Double mujeres = 0.0;
                Double sueldoVarones = 0.0;
                Double sueldoMujeres = 0.0;

                for ( int i = 0; i < registroSueldos.length; i++) {
                    for ( int j = 0; j < registroSueldos[0].length; j++) {
                        if (registroSueldos[i][0] == 0.0) {
                            varones ++;
                            sueldoVarones += registroSueldos[i][1];
                        }

                        if (registroSueldos[i][0] == 1.0) {
                            mujeres ++;
                            sueldoMujeres += registroSueldos[i][1];
                        }
                    }
                }

                Double promedioSueldoVarones = (sueldoVarones / varones);
                Double promedioSueldoMujeres = (sueldoMujeres / mujeres);

                System.out.println("El sueldo promedio de los varones es de: " + promedioSueldoVarones);
                System.out.println("El sueldo promedio de las mujeres es de: " + promedioSueldoMujeres);

            } catch (NumberFormatException nfe) {
                System.out.println("Valor incorrecto. Ingrese un numero entero: ");
            }
            System.exit(0);
        }
    }
}
