package Classes_util;

import java.io.Serializable;
import java.time.LocalDate;

public class CourseRequest extends Request implements Serializable {

    //defining attributes
    private Course course;
    private String sender;

    public CourseRequest(Course course, int requestID, LocalDate requestDate, String recipient, String description, boolean isRead, String sender){
        super(requestID, requestDate, recipient, description, isRead);
        this.sender = sender;
        this.course = course;
    }

    public CourseRequest(){}

    public String toNotification(){
        return String.format("Request ID: %d \nRequest Date: %s \nDescription: %s \nCourse name: %s",this.getRequestId(),this.getRequestDate(), this.getDescription(),course.getName());
    }


    //getters & setters
    public Course getCourse() {return course;}

    public void setCourse(Course course) {this.course = course;}

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
}