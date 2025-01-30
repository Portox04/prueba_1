package prueba_1;

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author porto
 */
public class Prueba_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variable
        double salary = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario mensual:"));
        double SEM = salary * 0.0925;
        double IVM = salary * 0.0508;
        double total = SEM + IVM;

        JOptionPane.showMessageDialog(null, "La empresa debera abonar a la CCSS el monto de " + total + " por concepto de SEM y IVM");
    }

}
