package Classes_util;

import java.io.Serializable;
import java.time.LocalDate;

public class JobRequest extends Request implements Serializable {

    //defining attributes
    private Job job;
    private String sender;


    public JobRequest(Job job, int requestID,  LocalDate requestDate, String recipient, String description, boolean isRead, String sender){
        super(requestID, requestDate, recipient, description, isRead);
        this.sender = sender;
        this.job = job;
    }

    public JobRequest(){}


    public String toNotification(){
        return String.format("Remetente: %s \n requestID: %d Data de Postagem: %s \n Descrição da Mensagem: %s",
                getSender(),
                getRequestId(),
                getRequestDate(),
                getDescription()
        );
    }


    //getters & setter
    public Job getJob() {return job;}

    public void setJob(Job job) {this.job = job;}

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
}