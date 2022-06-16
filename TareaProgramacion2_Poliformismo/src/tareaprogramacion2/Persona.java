/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaprogramacion2;

/**
 *
 * @author JordanStevenChavarri
 */
public class Persona {
    protected String name;
    protected int age;
    protected String lastName;

    public Persona(String pname, int page, String plastName) {
        this.name = pname;
        this.age = page;
        this.lastName = plastName;
    }

    public void mostrarInformacion(){
        System.out.println("Mi nombre es "+name+" "+lastName+" y tengo "+age);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
