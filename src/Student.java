/**
 * @author mrGreenNV
 */
public class Student implements IEntity {
    private String name;
    private Boolean isPractice;
    private Boolean isTheories;
    private Boolean isActivities;
    private Boolean isPassExam;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getPractice() {
        return isPractice;
    }

    public void setPractice(Boolean practice) {
        isPractice = practice;
    }

    public Boolean getTheories() {
        return isTheories;
    }

    public void setTheories(Boolean theories) {
        isTheories = theories;
    }

    public Boolean getActivities() {
        return isActivities;
    }

    public void setActivities(Boolean activities) {
        isActivities = activities;
    }

    public Boolean getPassExam() {
        return isPassExam;
    }

    public void setPassExam(Boolean passExam) {
        isPassExam = passExam;
    }
}
