import java.util.LinkedList; // (https://docs.oracle.com/javase/7/docs/api/java/util/LinkedList.html)
import java.util.Collections; // (https://docs.oracle.com/javase/7/docs/api/java/util/Collections.html)
import java.util.Comparator; // (https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html)

public class TaskList{

    /* Do not modify */
    private String name;
    private LinkedList<Task> tasks = new LinkedList<Task>();

    /* Your code here */
    public TaskList() {
        this.name = "";
        this.tasks = new LinkedList<Task>();
    }

    public TaskList(String name, LinkedList<Task> tasks){
        this.name = name;
        this.tasks = tasks;
    }

    public TaskList(String name){
        this.name = name;
        this.tasks = new LinkedList<Task>();
    }

    public boolean addTask(Task task){
        return this.tasks.add(task);
    }

    public void sortByPriority(){
        Collections.sort(this.tasks, Comparator.comparingInt((Task task) -> task.getPriority()).reversed());
    }

    public void printList(){
       /* Your code here */
    }

    public static void main(String[] args){
        TaskList obj = new TaskList("tareas");
        System.out.println("name of obj = " + obj.name);
    }

}