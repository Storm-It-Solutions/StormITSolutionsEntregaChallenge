package Classes_util;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class Job implements Serializable {

    //defining attributes
    private int jobId;
    private String name;
    private String departament;
    private String benefits;
    private String requirements;
    private String hiringContract;
    private LocalDate postDate;
    private boolean jobStatus;
    private String jobDescription;
    private String typeOfJob;
    private int jobLevel;

    public Job(int jobId,String name, String departament, String benefits, String requirements,
               String hiringContract, LocalDate postDate, boolean jobStatus, String jobDescription, String typeOfJob,
               int jobLevel){

        this.jobId = jobId;
        this.name = name;
        this.departament = departament;
        this.benefits = benefits;
        this.requirements = requirements;
        this.hiringContract = hiringContract;
        this.postDate = postDate;
        this.jobStatus = jobStatus;
        this.jobDescription = jobDescription;
        this.typeOfJob = typeOfJob;
        this.jobLevel = jobLevel;
    }

    public Job(){
    }


    public String toNotification(){
        return String.format("Nome da Vaga: %s \nDepartamento: %s \nBeneficios: %s \nRequisitos: %s \nNivel necessario: %d \nStatus da vaga: %s \nDescrição da vaga: %s \nData de postagem: %s",
                getName(),
                getDepartament(),
                getBenefits(),
                getRequirements(),
                getJobLevel(),
                (isJobStatus())? "Disponível":"Encerrada",
                getJobDescription(),
                getPostDate()
        );
    }



    //getters & setters
    public int getJobId() {return jobId;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getDepartament() {return departament;}

    public void setDepartament(String departament) {this.departament = departament;}

    public String getBenefits() {return benefits;}

    public void setBenefits(String benefits) {this.benefits = benefits;}

    public String getRequirements() {return requirements;}

    public void setRequirements(String requirements) {this.requirements = requirements;}

    public String getHiringContract() {return hiringContract;}

    public void setHiringContract(String hiringContract) {this.hiringContract = hiringContract;}

    public LocalDate getPostDate() { return postDate;}

    public void setPostDate(LocalDate postDate) {this.postDate = postDate;}

    public boolean isJobStatus() {return jobStatus;}

    public void setJobStatus(boolean jobStatus) {this.jobStatus = jobStatus;}

    public String getJobDescription() {return jobDescription;}

    public void setJobDescription(String jobDescription) {this.jobDescription = jobDescription;}

    public String getTypeOfJob() {return typeOfJob;}

    public void setTypeOfJob(String typeOfJob) {this.typeOfJob = typeOfJob;}

    public int getJobLevel() {return jobLevel;}

    public void setJobLevel(int jobLevel) {this.jobLevel = jobLevel;}
}