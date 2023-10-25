/**
 * @author mrGreenNV
 */
public class StudentTree {
    public static DecisionQuery<Student> decisionTree() {

        var isPassExam = new DecisionQuery<>(
                "PassExam",
                new DecisionResult<Student>("Экзамен"),
                new DecisionResult<Student>("Автомат 3"),
                Student::getPassExam
        );

        var isActivities = new DecisionQuery<>(
                "Activities",
                new DecisionResult<Student>("Автомат 5"),
                isPassExam,
                Student::getActivities
        );

        var isTheories = new DecisionQuery<>(
                "Theories",
                isActivities,
                new DecisionResult<Student>("Экзамен"),
                Student::getTheories
        );

        return new DecisionQuery<>(
                "Practice",
                isTheories,
                new DecisionResult<Student>("Пересдача"),
                Student::getPractice
        );
    }
}
