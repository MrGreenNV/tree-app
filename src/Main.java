/**
 * @author mrGreenNV
 */
public class Main {
    public static void main(String[] args) {

        Student student = new Student();

        student.setPractice(true);
        student.setTheories(true);
        student.setActivities(false);
        student.setPassExam(true);

        Decision<Student> tree = StudentTree.decisionTree();

        tree.Evaluate(student);
    }
}