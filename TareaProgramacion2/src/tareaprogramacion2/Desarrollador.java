/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaprogramacion2;

/**
 *
 * @author JordanStevenChavarri
 */
public class Desarrollador extends Empleado {
    protected int salary;
    protected String TechnologyExpertise;
    
    public Desarrollador(String pname, int page, String plastName, String pContractType, int pEmployeeID, int pSalary, String pTechnologyExpertise){
        super(pname, page, plastName, pContractType, pEmployeeID);
        this.salary = pSalary;
        this.TechnologyExpertise = pTechnologyExpertise;
  
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getTechnologyExpertise() {
        return TechnologyExpertise;
    }

    public void setTechnologyExpertise(String TechnologyExpertise) {
        this.TechnologyExpertise = TechnologyExpertise;
    }
    
    
}
