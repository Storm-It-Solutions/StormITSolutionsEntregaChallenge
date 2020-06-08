package Classes_util;

import javax.swing.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.*;

public class Recruiter extends Persona implements Serializable {
    private DataBase banco;
    public Recruiter(){}

    public Recruiter(String nickname, String function, float accumulatedExperience, float nextLevelExperience, int currentLevel, List<Achievement> achievements, String name, String office, LocalDate admissionDate, LocalDate birthDate, String gender, String departament, int employeeID) {
        super(nickname, function, accumulatedExperience, nextLevelExperience, currentLevel, achievements, name, office, admissionDate, birthDate, gender, departament, employeeID);
    }

    public Job createJob(){
        String stop;

        int jobId = Integer.parseInt(JOptionPane.showInputDialog("Digite o JobID"));
        String name = JOptionPane.showInputDialog("Digite o nome da vaga: ");
        String departament = JOptionPane.showInputDialog("Digite o departamento da vaga: ");
        String benefits = JOptionPane.showInputDialog("Digite os beneficios:");
        String requirements = JOptionPane.showInputDialog("Digite os requisitos");



        String hiringContract = JOptionPane.showInputDialog("Digite o formato de contratação: ");
        LocalDate postDate = LocalDate.now();
        String jobDescription = JOptionPane.showInputDialog("Digite a descrição da vaga: ");
        String typeOfJob = JOptionPane.showInputDialog("Digite o tipo da vaga: ");
        int jobLevel = Integer.parseInt(JOptionPane.showInputDialog("Digite o nivel de personagm exigido pela vaga: "));

        return new Job(jobId,
                name,
                departament,
                benefits,
                requirements,
                hiringContract,
                postDate,
                true,
                jobDescription,
                typeOfJob,
                jobLevel);
    } // feito

    public Course createCourse(){

        return new Course(JOptionPane.showInputDialog("Nome do curso:"), // Course name
                JOptionPane.showInputDialog("Tipo do curso: "), // Course Type
                Float.parseFloat(JOptionPane.showInputDialog("Duração do curso: ")), // Course Duration
                LocalDate.now(), // Create date
                JOptionPane.showInputDialog("Descrição do curso:"), // Course Description
                Integer.parseInt(JOptionPane.showInputDialog("Course ID:")) // Course ID
        );
    } // feito


    public void postJob(Job job){
        this.banco.addJob(this.createJob());
    } // feito

    public void postCourse(Course job){this.banco.addCourse(this.createCourse());} // feito



    public List<Job> showJob(){
        return this.banco.buscarVagas(Integer.parseInt(
                JOptionPane.showInputDialog("Digite o nivel das vagas que deseja buscar:")
                )
        );
    } // feito



    public void deleteJob(int jobID){
        boolean confirmacao = banco.deleteJob(jobID);

        if (confirmacao){
            JOptionPane.showMessageDialog(null,
                    "Vaga deletada com sucesso;");
        } else{
            JOptionPane.showMessageDialog(null,
                    "Não foi possivel encontrar uma vaga com esse ID.");
        }


    } //feito

    public void deleteCourse(int courseID){
        boolean confirmacao = banco.deleteCourse(courseID);

        if (confirmacao){
            JOptionPane.showMessageDialog(null,
                    "Curso deletado com sucesso;");
        } else{
            JOptionPane.showMessageDialog(null,
                    "Não foi possivel encontrar um curso com esse ID.");
        }

    } //feito


    public void updateJob(int jobID){ JOptionPane.showMessageDialog(null,
            "Digite os dados atualizados da vaga.");
        boolean confirmacao = this.banco.updateJob(jobID, createJob());

        if (confirmacao){
            JOptionPane.showMessageDialog(null, "Vaga atualizada com sucesso!");
        }else{
            JOptionPane.showMessageDialog(null, "Vaga não existente adicionada!");
        }


    } // feito

    public void updateCourse(int courseID){

        boolean confirmacao = this.banco.updateCourse(courseID, createCourse());

        if (confirmacao){
            JOptionPane.showMessageDialog(null,
                    "Curso atualizado com sucesso;");
        } else{
            JOptionPane.showMessageDialog(null,
                    "Id do curso não encontrado, o curso foi adicionado aos demais.");
        }

    } // feito




    public void defineDataBase(DataBase banco){
        this.banco = banco;
    } // provisorio


}
