package Classes_util;



import java.io.Serializable;
import java.time.LocalDate;

public class Employee implements Serializable {
    private String name;
    private String office;
    private LocalDate admissionDate;
    private LocalDate birthDate;
    private String gender;
    private String departament;
    private int employeeID;

    public Employee(String name, String office, LocalDate admissionDate, LocalDate birthDate, String gender, String departament, int employeeID) {
        this.name = name;
        this.office = office;
        this.admissionDate = admissionDate;
        this.birthDate = birthDate;
        this.gender = gender;
        this.departament = departament;
        this.employeeID = employeeID;
    }

    public Employee() { }

    public String getName() {
        return name;
    }

    public String getOffice() {
        return office;
    }

    public LocalDate getAdmissionDate() {
        return admissionDate;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getGender() {
        return gender;
    }

    public String getDepartament() {
        return departament;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }
}
