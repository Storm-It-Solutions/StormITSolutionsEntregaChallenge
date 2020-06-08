package Classes_util;

import javax.print.attribute.standard.DateTimeAtCompleted;
import javax.swing.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class Manager extends Persona implements Serializable {
    private String managementDepartment;
    private int managedTeamSize;
    private List<Persona> managedPeople;
    private List<JobRequest> jobRequests;
    private List<CourseRequest> courseRequests;
    private DataBase bancoDeDados;

    public Manager(String nickname, String function, float accumulatedExperience, float nextLevelExperience, int currentLevel, List<Achievement> achievements, String name, String office, LocalDate admissionDate, LocalDate birthDate, String gender, String departament, int employeeID, String managementDepartment, int managedTeamSize, List<Persona> managedPeople, List<JobRequest> jobRequests, List<CourseRequest> courseRequests) {
        super(nickname, function, accumulatedExperience, nextLevelExperience, currentLevel, achievements, name, office, admissionDate, birthDate, gender, departament, employeeID);
        this.managementDepartment = managementDepartment;
        this.managedTeamSize = managedTeamSize;
        this.managedPeople = managedPeople;
        this.jobRequests = jobRequests;
        this.courseRequests = courseRequests;
    }

    public Manager(){

    }

    public void evaluateRequest(JobRequest request){
        int statusRequest = Integer.parseInt(String.valueOf(JOptionPane.showConfirmDialog(null, request + "\n\n Deseja aprovar essa solicitação? ")));
        if (statusRequest != 2) {
            String recipientRequest = JOptionPane.showInputDialog("Digite o nome do endereçado: ");
            String descriptionRequest = JOptionPane.showInputDialog("Digite o texto de resposta: ");
            LocalDate postDateRequest = LocalDate.now();

            switch (statusRequest){
                case 1:
                    bancoDeDados.addRequestReturn(new RequestReturn(postDateRequest,recipientRequest,descriptionRequest, false, request.getRequestId(), request.getRequestDate()));
                    break;
                case 0:
                    bancoDeDados.addRequestReturn(new RequestReturn(postDateRequest,recipientRequest,descriptionRequest, true, request.getRequestId(), request.getRequestDate()));
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ocorreu algum erro");
            }
        }
    } // feito

    public void evaluateCourseRequest(CourseRequest request){
        int status = Integer.parseInt(String.valueOf(JOptionPane.showConfirmDialog(null, request + "\n\n Deseja aprovar essa solicitação? ")));
        if (status != 2) {
            String recipientRequest = JOptionPane.showInputDialog("Digite o nome do endereçado: ");
            String descriptionRequest = JOptionPane.showInputDialog("Digite o texto de resposta: ");
            LocalDate postDateRequest = LocalDate.now();

            switch (status){
                case 1:
                    bancoDeDados.addRequestReturn(new RequestReturn(postDateRequest,recipientRequest,descriptionRequest, false, request.getRequestId(), request.getRequestDate()));
                    break;
                case 0:
                    bancoDeDados.addRequestReturn(new RequestReturn(postDateRequest,recipientRequest,descriptionRequest, true, request.getRequestId(), request.getRequestDate()));
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ocorreu algum erro");
            }
        }
    } // feito

    public void defineDataBase(DataBase banco){
        this.bancoDeDados = banco;
    } // feito


    public void showJobRequests(){
        List<JobRequest> requests = this.bancoDeDados.buscarJobRequests(getName());
        for (JobRequest job : requests){
            int op = JOptionPane.showConfirmDialog(null, job.toNotification() + "\n Deseja aprovar?");
            if (op == 0){
                job.setRead(true);
                this.bancoDeDados.addRequestReturn(new RequestReturn(LocalDate.now(),
                        job.getSender(),
                        JOptionPane.showInputDialog("Digite o texto de resposta"),
                        true,
                        job.getRequestId(),
                        job.getRequestDate()
                        )
                );

            }else if(op == 1){
                job.setRead(true);
                this.bancoDeDados.addRequestReturn(new RequestReturn(LocalDate.now(),
                        job.getSender(),
                        JOptionPane.showInputDialog("Digite o texto de resposta"),
                        false,
                        job.getRequestId(),
                        job.getRequestDate()
                        )
                );
            }else{
                JOptionPane.showMessageDialog(null, "Operação cancelada");
                break;
            }

        }
    } // feito

    public void showCoursesRequests(){
        List<CourseRequest> requests = this.bancoDeDados.buscarCourseRequests(this.getName());
        for (CourseRequest course : requests){
            int op = JOptionPane.showConfirmDialog(null, course.toNotification() + "\n Deseja aprovar?");
            if (op == 0){
                course.setRead(true);
                this.bancoDeDados.addRequestReturn(new RequestReturn(LocalDate.now(),
                                course.getSender(),
                                JOptionPane.showInputDialog("Digite o texto de resposta"),
                                true,
                                course.getRequestId(),
                                course.getRequestDate()
                        )
                );

            }else if(op == 1){
                course.setRead(true);
                this.bancoDeDados.addRequestReturn(new RequestReturn(LocalDate.now(),
                                course.getSender(),
                                JOptionPane.showInputDialog("Digite o texto de resposta"),
                                false,
                                course.getRequestId(),
                                course.getRequestDate()
                        )
                );
            }else{
                JOptionPane.showMessageDialog(null, "Operação cancelada");
                break;
            }

        }
    } // feito




    // getters e settes // feito
    public String getManagementDepartment() {
        return managementDepartment;
    }

    public void setManagementDepartment(String managementDepartment) {
        this.managementDepartment = managementDepartment;
    }

    public int getManagedTeamSize() {
        return managedTeamSize;
    }

    public void setManagedTeamSize(int managedTeamSize) {
        this.managedTeamSize = managedTeamSize;
    }

    public List<Persona> getManagedPeople() {
        return managedPeople;
    }

    public void setManagedPeople(List<Persona> managedPeople) {
        this.managedPeople = managedPeople;
    }

    public List<JobRequest> getJobRequests() {
        return jobRequests;
    }

    public void setJobRequests(List<JobRequest> jobRequests) {
        this.jobRequests = jobRequests;
    }

    public List<CourseRequest> getCourseRequests() {
        return courseRequests;
    }

    public void setCourseRequests(List<CourseRequest> courseRequests) {
        this.courseRequests = courseRequests;
    }


}