package Classes_util;

import java.io.Serializable;
import java.time.LocalDate;

public class RequestReturn implements Serializable {

    //defining attributes
    private LocalDate returnDate;
    private String recipient;
    private String description;
    private boolean status;
    private int requestID;


    public RequestReturn(LocalDate returnDate, String recipient, String description, boolean status, int requestID, LocalDate requestDate){
        this.returnDate = returnDate;
        this.recipient = recipient;
        this.description = description;
        this.status = status;
        this.requestID = requestID;
    }

    public RequestReturn(){}

    public LocalDate getReturnDate() {return returnDate;}

    public void setReturnDate(LocalDate returnDate) {this.returnDate = returnDate;}

    public String getRecipient() {return recipient;}

    public void setRecipient(String recipient) {this.recipient = recipient;}

    public String getDescription() {return description;}

    public void setDescription(String description) {this.description = description;}

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


    public int getRequestID() {
        return requestID;
    }

    public String toNotification() {

        return String.format("requestID: %d \nDescrição: %s \nStatus: %s \nData da resposta: %s",
                getRequestID(),
                getDescription(),
                getStatus(),
                getReturnDate()
        );


    }
}