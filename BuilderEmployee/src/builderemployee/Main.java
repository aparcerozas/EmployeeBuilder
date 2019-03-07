/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderemployee;

/**
 *
 * @author aparcerozas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee empleado1 = new EmployeeBuilder("Pedro",5729374)
                .setLastName("Martínez")
                .setHireYear(2016)
                .setBirthYear(1985)
                .crearEmployee();
        System.out.println(empleado1.toString());
    }
    
}
