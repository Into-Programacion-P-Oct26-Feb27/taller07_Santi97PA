/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

/**
 *
 * @author SALASC
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador = 1;
        int denominador = 1;

        double termino;
        double suma = 0;

        String reporte = "";

        while (contador <= 8) {

            termino = 1.0 / denominador;

            if (contador % 2 == 0) {
                termino = termino * -1;
            }

            suma = suma + termino;

            if (contador == 1) {
                reporte = String.format("%.0f", termino);
            } else {
                if (termino > 0) {
                    reporte = String.format("%s + 1/%d",
                            reporte, denominador);
                } else {
                    reporte = String.format("%s - 1/%d",
                            reporte, denominador);
                }
            }

            denominador = denominador + 2;
            contador = contador + 1;
        }

        System.out.println("Serie:");
        System.out.println(reporte);

        System.out.printf("Resultado de la serie: %.2f\n", suma);
    }

}
