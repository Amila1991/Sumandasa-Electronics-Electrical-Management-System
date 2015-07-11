/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author Amila Karunathilaka
 */
public class JobDescription {
    private int Description_No;
    private String Job_Description;
    private String Job_Code;

    public JobDescription() {
    }

    public JobDescription(int Description_No, String Job_Description, String Job_Code) {
        this.Description_No = Description_No;
        this.Job_Description = Job_Description;
        this.Job_Code = Job_Code;
    }

    /**
     * @return the Deficiency_No
     */
    public int getDescription_No() {
        return Description_No;
    }

    /**
     * @return the Job_Deficiency
     */
    public String getJob_Description() {
        return Job_Description;
    }

    /**
     * @return the Job_Code
     */
    public String getJob_Code() {
        return Job_Code;
    }

    /**
     * @param Deficiency_No the Deficiency_No to set
     */
    public void setDescription_No(int Description_No) {
        this.Description_No = Description_No;
    }

    /**
     * @param Job_Deficiency the Job_Deficiency to set
     */
    public void setJob_Description(String Job_Description) {
        this.Job_Description = Job_Description;
    }

    /**
     * @param Job_Code the Job_Code to set
     */
    public void setJob_Code(String Job_Code) {
        this.Job_Code = Job_Code;
    }
    
    public boolean equals(Object ob){
        JobDescription jobDescription=(JobDescription) ob;
        if(Job_Code.equals(jobDescription.getJob_Code())&&Job_Description.equals(jobDescription.getJob_Description())){
            return true;
        }else{
            return false;
        }
    }
    
}
