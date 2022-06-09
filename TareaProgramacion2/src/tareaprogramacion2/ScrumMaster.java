/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaprogramacion2;

/**
 *
 * @author JordanStevenChavarri
 */
public class ScrumMaster extends DisenadorUX{
    protected String responsability;//work on requirements
    private String mainSkill;
    
    public ScrumMaster(String pname, int page, String plastName, String pContractType, int pEmployeeID, int pSalary, String presponsability){
        super(pname, page, plastName, pContractType, pEmployeeID, pSalary);
        this.responsability = presponsability; 
    }
    
    @Override
    public void mostrarInformacion(){
        System.out.println("Mi nombre es "+name+" "+lastName+" y tengo "+age+" con tipo de contrato "+ContractType+" y número de empleado "+employeeID+" mi salario es "+salary+" y mi responsabilidad es "+responsability);
    }

    public String getResponsability() {
        return responsability;
    }

    public void setResponsability(String responsability) {
        this.responsability = responsability;
    }

    public String getMainSkill() {
        return mainSkill;
    }

    public void setMainSkill(String mainSkill) {
        this.mainSkill = mainSkill;
    }
    
    
}
