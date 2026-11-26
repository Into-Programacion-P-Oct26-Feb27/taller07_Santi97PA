/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
         boolean bandera = true;

        String nombre;
        String posicion;
        int edad;
        double estatura;

        String listadoJugadores = "Listado de Jugadores\n";
        String listadoEdades = "Listado de Edades\n";

        double sumaEstaturas = 0;
        int sumaEdades = 0;
        int contador = 0;

        double promedioEdades;
        double promedioEstaturas;

        while (bandera == true) {

            contador = contador + 1;

            System.out.println("Ingrese nombre del jugador:");
            nombre = entrada.nextLine();

            System.out.println("Ingrese posicion en el campo de juego:");
            posicion = entrada.nextLine();

            System.out.println("Ingrese la edad del jugador:");
            edad = entrada.nextInt();

            System.out.println("Ingrese la estatura del jugador:");
            estatura = entrada.nextDouble();

            
            listadoJugadores = String.format(
                "%s%d. %s -%s-, edad %d, estatura %.2f\n",
                listadoJugadores, contador, nombre, posicion,
                edad, estatura);

            
            listadoEdades = String.format(
                "%s%d\n", listadoEdades, edad);

            
            sumaEdades = sumaEdades + edad;
            sumaEstaturas = sumaEstaturas + estatura;

            
            entrada.nextLine();

            String salir;

            System.out.print("Desea salir del ciclo? Ingrese si: ");
            salir = entrada.nextLine();

            if (salir.equalsIgnoreCase("si")) {
                bandera = false;
            }
        }
        promedioEdades = (double) sumaEdades / contador;
        promedioEstaturas = sumaEstaturas / contador;

        System.out.println("\n" + listadoJugadores);
        System.out.println(listadoEdades);

        System.out.printf("Promedio de edades: %.2f\n",
                promedioEdades);

        System.out.printf("Promedio de estaturas: %.2f\n",
                promedioEstaturas);

    }
}
