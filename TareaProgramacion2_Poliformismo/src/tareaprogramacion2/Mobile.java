/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaprogramacion2;

/**
 *
 * @author JordanStevenChavarri
 */
public class Mobile extends Desarrollador{
    protected String mobileLanguage; //programming language
    
    public Mobile(String pname, int page, String plastName, String pContractType, int pEmployeeID, int pSalary, String pTechnologyExpertise, String pmobileLanguage) {
        super(pname, page, plastName, pContractType, pEmployeeID, pSalary, pTechnologyExpertise);
        this.mobileLanguage = pmobileLanguage;
    }

    public String getMobileLanguage() {
        return mobileLanguage;
    }

    public void setMobileLanguage(String mobileLanguage) {
        this.mobileLanguage = mobileLanguage;
    }
    
    
    
}
