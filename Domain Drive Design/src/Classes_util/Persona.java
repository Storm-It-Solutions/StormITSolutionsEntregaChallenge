package Classes_util;

import javax.swing.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Persona extends Employee implements Serializable {

    private String nickname;
    private float accumulatedExperience;
    private float nextLevelExperience;
    private int currentLevel;
    private String function;
    private List<Achievement> achievements;
    private DataBase dataBase;


    public Persona(String nickname, String function, float accumulatedExperience,float nextLevelExperience,int currentLevel,List<Achievement> achievements, String name, String office, LocalDate admissionDate, LocalDate birthDate,String gender, String departament, int employeeID){
        super(name, office, admissionDate, birthDate, gender, departament, employeeID);
        this.nickname = nickname;
        this.function = function;
        this.accumulatedExperience = accumulatedExperience;
        this.nextLevelExperience = nextLevelExperience;
        this.currentLevel = currentLevel;
        this.achievements = achievements;
    }

    public Persona() { }








    public void receiveAchievements(Achievement achievement){
        this.achievements.add(achievement);
        this.receiveXP(achievement.getXP());
    } // feito

    public void receiveXP(float amount){
        if (amount > 0 ){
            if (amount >= (this.getNextLevelExperience() - this.getAccumulatedExperience())){
                float xp_res = this.getNextLevelExperience() - this.getAccumulatedExperience();
                this.accumulatedExperience += xp_res;
                this.isNextLevel();
                float remainingXP = (amount - (this.getNextLevelExperience() - this.getAccumulatedExperience()));
                this.receiveXP(amount - xp_res);
            }
            else{
                this.accumulatedExperience += amount;
                this.isNextLevel();
            }
        }
    } // feito

    public void sendJobRequest(Job job){
        int requestID = Integer.parseInt(JOptionPane.showInputDialog("Digite o requestID"));
        LocalDate dataDePostagem = LocalDate.now();
        String recipient = JOptionPane.showInputDialog("Digite o nome detinatario: ");
        String description = JOptionPane.showInputDialog("Digite o texto da solicitação: ");


        this.dataBase.addJobRequest(new JobRequest(selectJob(),
                requestID,
                dataDePostagem,
                recipient,
                description,
                false,
                this.getName()
                )
        );
    } // feito

    public void sendCourseRequest(){
        Course curso = dataBase.buscarCurso();
        int requestID = Integer.parseInt(JOptionPane.showInputDialog("Digite o requestID: "));
        LocalDate dataDaRequisicao = LocalDate.now();
        String recipient = JOptionPane.showInputDialog("Digite o nome do destinatário: ");
        String description = JOptionPane.showInputDialog("Digite o texto da solicitação: ");


        this.dataBase.addCourseRequest(new CourseRequest(curso,
                requestID,
                dataDaRequisicao,
                recipient,
                description,
                false,
                this.getName()
                )
        );
    } // feito

    public void showInfo() {
        JOptionPane.showMessageDialog(null, String.format(
                "Nickname: %s \nLevel atual: %d \nExperiência: %.2f / %.2f \nDepartamento: %s \nFunção: %s",
                        getNickname(),
                        getCurrentLevel(),
                        getAccumulatedExperience(),
                        getNextLevelExperience(),
                        getDepartament(),
                        getFunction()
                )
        );
    }

    public void verifyStatusRequest(int requestID){
            JOptionPane.showMessageDialog(null, this.dataBase.buscarRespostaDaRequisicao(requestID).toNotification());
    } // feito

    public Job selectJob(){
        List<Job> jobs = dataBase.buscarVagas(this.currentLevel);


        JOptionPane.showMessageDialog(null, "Mostrando as vags disoniveis");
        for (Job job : jobs){
            int opcao = JOptionPane.showConfirmDialog(null, job.toNotification());
            if (opcao == 0){
                return job;
            }
        }
        return new Job();
    } // feito

    public void showAchievements(){
        for (Achievement conquista : getAchievements()){
            JOptionPane.showMessageDialog(null, conquista.toNotification());
        }
    } // feito






    public String showCurrentLevel(){
        return String.format("O level atual é : %d", this.getCurrentLevel());
    } // feito

    public void isNextLevel(){
        if (this.getAccumulatedExperience() == this.getNextLevelExperience()){
            this.setCurrentLevel( this.getCurrentLevel() + 1);
            this.setNextLevelExperience((float) (this.getNextLevelExperience() + Math.pow(500.0, 1.05)));
            JOptionPane.showMessageDialog(null, "Parabéns vou passou para o Level" + getCurrentLevel());
        }
    } // feito

    public void setDataBase(DataBase banco){
        this.dataBase = banco;
    } // feito



        // getters e setters

    public String getNickname() {
        return nickname;
    } // feito

    public float getAccumulatedExperience() {
        return accumulatedExperience;
    } // feito

    public float getNextLevelExperience() {
        return nextLevelExperience;
    } // feito

    public int getCurrentLevel() {
        return currentLevel;
    } // feito

    public String getFunction() {
        return function;
    } // feito

    public List<Achievement> getAchievements() {
        return achievements;
    } // feito

    public void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    } // feito

    public void setNextLevelExperience(float nextLevelExperience) {
        this.nextLevelExperience = nextLevelExperience;
    } // feito

}
