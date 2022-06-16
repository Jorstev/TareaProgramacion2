/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareaprogramacion2;

/**
 *
 * @author JordanStevenChavarri
 */
public class TareaProgramacion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
        //creación de objetos utilizando las subclases, aplicación de poliformismo.
        Persona[] persona = new Persona[4];
        persona[0] = new Empleado("Jordan", 28, "Chavarria", "FullTime", 1234);
        persona[1] = new Desarrollador("July", 28, "Williams", "FullTime", 1236, 10000, "FrontEnd");
        persona[2] = new ScrumMaster("Raul", 28, "Salas", "Half-Time", 1237, 5000, "Project Management");
        persona[3] = new DisenadorUX("Zara", 28, "Salas", "Half-Time", 1239,7000);
    }
    
}
