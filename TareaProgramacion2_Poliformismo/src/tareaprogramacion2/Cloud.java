/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaprogramacion2;

/**
 *
 * @author JordanStevenChavarri
 */
public class Cloud extends Desarrollador{
    protected String CloudTechnology; //AWS,Azure
     
    
    public Cloud(String pname, int page, String plastName, String pContractType, int pEmployeeID, int pSalary, String pTechnologyExpertise, String pCloudTechnology ) {
        super(pname, page, plastName, pContractType, pEmployeeID, pSalary, pTechnologyExpertise);
        
        this.CloudTechnology = pCloudTechnology;
    }

    public String getCloudTechnology() {
        return CloudTechnology;
    }

    public void setCloudTechnology(String CloudTechnology) {
        this.CloudTechnology = CloudTechnology;
    }
    
    
    
    
    
}
