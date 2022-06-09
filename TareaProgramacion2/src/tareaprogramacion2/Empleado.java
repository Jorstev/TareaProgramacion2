/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaprogramacion2;

/**
 *
 * @author JordanStevenChavarri
 */
public class Empleado extends Persona {
    protected int employeeID;
    protected String ContractType;//fulltime-halftime
    
    public Empleado(String pname, int page, String plastName, String pContractType, int pEmployeeID){
        super(pname, page, plastName);
        this.ContractType = pContractType;
        this.employeeID = pEmployeeID;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getContractType() {
        return ContractType;
    }

    public void setContractType(String ContractType) {
        this.ContractType = ContractType;
    }
    
    
}
