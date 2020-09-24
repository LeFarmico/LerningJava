package Unit15_CollectionsFramework;

import java.util.Deque;

public class Worker {
    private Deque toDoQueue;

    public Worker(Deque toDoQueue) {
        this.toDoQueue = toDoQueue;
    }
    public void takeTask(){
        Object task = toDoQueue.pollLast(); //взяли таск из очереди (передали в переменную)
        if (task != null){
            System.out.println("Выполняю задание немер: " + task);
        }else {
            System.out.println("Все задания выполнены!");
        }
    }
}
