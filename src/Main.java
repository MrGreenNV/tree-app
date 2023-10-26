import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author mrGreenNV
 */
public class Main {
    public static void main(String[] args) {

        boolean flagRun = false;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            while (!flagRun) {

                showMainMenu();

                String input = reader.readLine();

                int choiceUser;

                try {
                    choiceUser = Integer.parseInt(input);
                } catch (NumberFormatException nfEx) {
                    System.out.println();
                    System.out.println("Ошибка при вводе данных. Введите целое число.");
                    System.out.println();
                    continue;
                }

                switch (choiceUser) {
                    case 1 -> {
                        Student student = new Student();
                        System.out.println();
                        System.out.println("---------<Ввод данных студента>---------");
                        System.out.print("Введите имя студента: ");
                        String name = reader.readLine();
                        student.setName(name);
                        System.out.print("Если студент выполнил все практические работы введите - true: ");
                        boolean isPractice = Boolean.parseBoolean(reader.readLine());
                        student.setPractice(isPractice);
                        System.out.print("Если у студента хорошая посещаемость занятий введите - true: ");
                        boolean isTheories = Boolean.parseBoolean(reader.readLine());
                        student.setTheories(isTheories);
                        System.out.print("Если студент проявлял активность на занятиях введите - true: ");
                        boolean isActivities = Boolean.parseBoolean(reader.readLine());
                        student.setActivities(isActivities);
                        System.out.print("Если студент готов сдавать экзамен введите - true: ");
                        boolean isPassExam = Boolean.parseBoolean(reader.readLine());
                        student.setPassExam(isPassExam);
                        System.out.println("----------------------------------------");
                        System.out.println("--------------<Результат>---------------");

                        Decision<Student> tree = StudentTree.decisionTree();

                        tree.Evaluate(student);

                        reader.readLine();
                        for (int i = 0; i < 20; i++) {
                            System.out.println();
                        }
                    }

                    case 0 -> flagRun = true;

                    default -> {
                        System.out.println();
                        System.out.println("Выберите пункт меню из предложенных вариантов.");
                        System.out.println();
                    }
                }


            }

        } catch (IOException ioEx) {
            ioEx.getStackTrace();
        }

        System.out.println("Программа успешно завершена.");

    }

    public static void showMainMenu() {
        System.out.println("-----------------<Меню>-----------------");
        System.out.println("Выберите пункт меню и введите его номер.");
        System.out.println("1. Ввести данные студента");
        System.out.println("----------------------------------------");
        System.out.println("0. Выйти из программы");
        System.out.println();
        System.out.print("-> ");
    }
}