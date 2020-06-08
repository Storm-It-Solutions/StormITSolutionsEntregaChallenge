package Classes_util;

import java.io.Serializable;
import java.time.LocalDate;

public class Course implements Serializable {

    //defining attributes
    private String name;
    private String courseType;
    private float courseDuration;
    private LocalDate postDate;
    private String courseDescription;
    private int courseID;


    public Course(String name, String courseType, float courseDuration, LocalDate postDate, String courseDescription, int courseID){
        this.name = name;
        this.courseType = courseType;
        this.courseDuration = courseDuration;
        this.postDate = postDate;
        this.courseDescription = courseDescription;
        this.courseID = courseID;
    }

    public Course(){}


    public String toNotification(){
        return String.format("Nome do curso: %s \nId do curso: %d \n Tipo do curso: %s \nDuração do curso: %.1fH \nData de Postagem: %s \nDescrição: %s",
                getName(),
                getCourseID(),
                getCourseType(),
                getCourseDuration(),
                getPostDate(),
                getCourseDescription()
        );
    } // feito



    //getters & setters
    public int getCourseID() {return courseID;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getCourseType() {return courseType;}

    public void setCourseType(String courseType) {this.courseType = courseType;}

    public float getCourseDuration() {return courseDuration;}

    public void setCourseDuration(int courseDuration) {this.courseDuration = courseDuration;}

    public LocalDate getPostDate() {return postDate;}

    public void setPostDate(LocalDate postDate) {this.postDate = postDate;}

    public String getCourseDescription() {return courseDescription;}

    public void setCourseDescription(String courseDescription) {this.courseDescription = courseDescription;}
}