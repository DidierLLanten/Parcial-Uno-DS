/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialuno;

import javax.swing.JOptionPane;

/**
 *
 * @author Didie
 */
public class ParcialUno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean numeros = true;
        do {
            try {
                String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante: ");
                double codigo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el codigo del estudiante: "));
                double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del primer Corte: "));
                double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del segundo Corte: "));
                double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del Tercer Corte: "));

                mostrarMensaje("Nombre: "+nombre + "\n"
                        + "Codigo: " + codigo + "\n"
                        + "\nNota definitiva: " + calcularNotaFinal(nota1, nota2, nota3));

            } catch (NumberFormatException | NullPointerException ex) {
                if (ex.getMessage() == null) {
                    System.exit(0);
                }
                mostrarMensaje("Este campo solo acepta valores numericos.");
                numeros = false;
            }
        } while (numeros == false);
    }

    private static double calcularNotaFinal(double nota1, double nota2, double nota3) {
        double notaDefinitiva = ((nota1 * 0.3) + (nota2 * 0.25) + (nota3 * 0.45));
        return notaDefinitiva;
    }

    private static void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
