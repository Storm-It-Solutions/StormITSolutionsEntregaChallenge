package Classes_util;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class Achievement implements Serializable {
    private String achievement;
    private LocalDate receiptDate;
    private String achievementType;
    private float XP;
    private String achievementDescription;

    public Achievement(String achievement, LocalDate receiptDate, String achievementType, float XP, String achievementDescription) {
        this.achievement = achievement;
        this.receiptDate = receiptDate;
        this.achievementType = achievementType;
        this.XP = XP;
        this.achievementDescription = achievementDescription;
    }


    public String toNotification(){
        return String.format("Nome da Conquista: %s \nData de recebimento: %s \nTipo da Conquista: %s \nExperiencia: %.2f \nDescrição: %s",
                getAchievement(),
                getReceiptDate(),
                getAchievementType(),
                getXP(),
                getAchievementDescription());
    }

    public Achievement() {
    }

    public String getAchievement() {
        return achievement;
    }

    public LocalDate getReceiptDate() {
        return receiptDate;
    }

    public String getAchievementType() {
        return achievementType;
    }

    public float getXP() {
        return XP;
    }

    public String getAchievementDescription() {
        return achievementDescription;
    }

    public void setAchievement(String achievement) {
        this.achievement = achievement;
    }

    public void setAchievementType(String achievementType) {
        this.achievementType = achievementType;
    }

    public void setAchievementDescription(String achievementDescription) {
        this.achievementDescription = achievementDescription;
    }
}
