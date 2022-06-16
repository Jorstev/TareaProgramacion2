/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaprogramacion2;

/**
 *
 * @author JordanStevenChavarri
 */
public class DisenadorUX extends Empleado {
    protected int salary;
    private String DesignerCertification;//academic
    
    public DisenadorUX(String pname, int page, String plastName, String pContractType, int pEmployeeID, int pSalary){
        super(pname, page, plastName, pContractType, pEmployeeID);
        this.salary = pSalary;
  
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDesignerCertification() {
        return DesignerCertification;
    }

    public void setDesignerCertification(String DesignerCertification) {
        this.DesignerCertification = DesignerCertification;
    }
    
    
}
