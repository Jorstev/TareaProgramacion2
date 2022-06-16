/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaprogramacion2;

/**
 *
 * @author JordanStevenChavarri
 */
public class FrontEnd extends DisenadorUX {

    private String preprocessor;
    protected String framework;

    public FrontEnd(String pname, int page, String plastName, String pContractType, int pEmployeeID, int pSalary, String presponsability, String pframework) {
        super(pname, page, plastName, pContractType, pEmployeeID, pSalary);
        this.framework = pframework;
    }

    public String getPreprocessor() {
        return preprocessor;
    }

    public void setPreprocessor(String preprocessor) {
        this.preprocessor = preprocessor;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }
    

}
