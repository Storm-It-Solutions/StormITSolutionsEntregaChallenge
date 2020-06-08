package Classes_util;


import java.io.Serializable;
import java.time.LocalDate;

public class Request implements Serializable {

    //defining attributes
    private int requestID;
    private LocalDate requestDate;
    private String recipient;
    private String description;
    private boolean isRead;

    public Request(int requestID, LocalDate requestDate, String recipient, String description, boolean isRead) {

        this.requestID = requestID;
        this.requestDate = requestDate;
        this.recipient = recipient;
        this.description = description;
        this.isRead = isRead;
    }

    public Request() {
    }

    //getters & setters
    public int getRequestId() {
        return requestID;
    }

    public LocalDate getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(LocalDate requestDate) {
        this.requestDate = requestDate;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        isRead = read;
    }
}