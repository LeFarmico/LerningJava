
import taskTypes.DragAndDrop;
import taskTypes.Task;
import taskTypes.Test;
import taskTypes.WriteCode;

import java.util.Random;

public class Loader {
    public static void main(String[] args) {
        Random random = new Random();

        Mentor[] mentor = new Mentor[4];
        mentor[0] = new Mentor("Ларри", "Пэйдж", 21);
        mentor[1] = new Mentor("Анатолий", "Вассерман", 44);
        mentor[2] = new Mentor("Стив", "Возник", 30);
        mentor[3] = new Mentor("Александр", "Друзь", 999);

        Student[] student = new Student[10];
        student[0] = new Student("Генерал", "Кеноби", 20,mentor[0]);
        student[1] = new Student("Питер", "Паркер", 18,mentor[1]);
        student[2] = new Student("Рикардо", "Милос", 30,mentor[2]);
        student[3] = new Student("Кевин", "Рэнделман", 45,mentor[3]);
        student[4] = new Student("Дядя", "Фёдор", 30,mentor[1]);
        student[5] = new Student("Сын", "Маминой подруги", 30,mentor[0]);
        student[6] = new Student("Джорджи", "Мартин", 30,mentor[2]);
        student[7] = new Student("Том", "Ридл", 30,mentor[0]);
        student[8] = new Student("Шанг", "Сунг", 30,mentor[0]);
        student[9] = new Student("Джил", "Валентайн", 30,mentor[3]);

        Task[] task = createTasks(30);

        for (Student value : student) {
            System.out.println(value.getName() + " " + value.getFamilyName() + " решает задачи");
            value.solveTasks(random.nextInt(task.length), task);
            System.out.println();
        }
    }

    private static Task[] createTasks(int numberOfTasks){
        Task[] task = new Task[numberOfTasks];
        for (int i = 0; i < task.length; i++){
            if (i % 2 == 0){
                task[i] = new DragAndDrop();
                task[i].setNumber(i+1);
            }
            else if (i % 3 == 0){
                task[i] = new Test();
                task[i].setNumber(i+1);
            }
            else {
                task[i] = new WriteCode();
                task[i].setNumber(i+1);
            }
        }
        return task;
    }
}
