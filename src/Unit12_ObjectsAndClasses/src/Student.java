import lombok.Data;
import taskTypes.*;


@Data
public class Student extends Person {

    private int completedTasks;
    private static int totalTasksCompleted;
    private boolean allTasksCompleted;
    private Mentor mentor;

    public Student(String name, String familyName, int age, Mentor mentor) {
        super(name, familyName, age);
        this.completedTasks = 0;
        this.mentor = mentor;
    }

    private void solveTask(Task task) {
        if ((task instanceof Test) || (task instanceof DragAndDrop)) {
            System.out.println("Задание " + task.getNumber() + " выполнено!");
            completedTasks++;
            totalTasksCompleted++;
        } else if (task instanceof WriteCode) {
            while (true) {
                if (mentor.checkCode(task)) {
                    completedTasks++;
                    totalTasksCompleted++;
                    break;
                }
            }
        }
    }

    public void solveTasks(int numberOfTasksToComplete, Task[] tasks) {
        System.out.println("Надо решить: " + numberOfTasksToComplete + " задач из: " + tasks.length);
        if (numberOfTasksToComplete > tasks.length) {
            System.out.println("Задач должно быть меньше чем " + tasks.length);
        } else {
            for (int i = 0; i < numberOfTasksToComplete; i++) {
                solveTask(tasks[i]);
            }
            allTasksCompleted = (completedTasks == tasks.length);
        }
    }
}