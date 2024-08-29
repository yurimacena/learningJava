package Search;
import java.util.ArrayList;
import java.util.List;

public class TaskList {
    public List<Task> taskList;

    public TaskList() {
        this.taskList = new ArrayList<>();
    }

    public void addTask(String description) {
        taskList.add(new Task(description));
    }

    public void removeTask(String description) {
        List<Task> tasksToRemove = new ArrayList<>();
        for(Task t : taskList) {
            if(t.getDescription().equalsIgnoreCase(description)){
                tasksToRemove.add(t);
            }
        }
        taskList.removeAll(tasksToRemove);
    }
    
    public int obtainTotalTaskNumber() {
        return taskList.size();
    }

    public void obtainTasksDescriptions() {
        System.out.println(taskList);
    }

    public static void main(String[] args) {
        TaskList taskList = new TaskList();

        System.out.println("The total number of elements in the list is: " + taskList.obtainTotalTaskNumber());

        taskList.addTask("Task 1");
        taskList.addTask("Task 1");
        taskList.addTask("Task 2");
        System.out.println("The total number of elements in the list is: " + taskList.obtainTotalTaskNumber());

        taskList.removeTask("Task 1");
        System.out.println("The total number of elements in the list is: " + taskList.obtainTotalTaskNumber());

        taskList.obtainTasksDescriptions();

    }
}
