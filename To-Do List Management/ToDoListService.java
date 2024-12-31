import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService
public class ToDoListService {

    private List<String> todoList = new ArrayList<>();
    
    @WebMethod
    public String addTask(String task) {
        todoList.add(task);
        return "Task added successfully!";
    }

    @WebMethod
    public String removeTask(int taskId) {
        if (taskId >= 0 && taskId < todoList.size()) {
            todoList.remove(taskId);
            return "Task removed successfully!";
        } else {
            return "Task ID not found!";
        }
    }

    @WebMethod
    public String updateTask(int taskId, String newTaskDescription) {
        if (taskId >= 0 && taskId < todoList.size()) {
            todoList.set(taskId, newTaskDescription);
            return "Task updated successfully!";
        } else {
            return "Task ID not found!";
        }
    }

    @WebMethod
    public List<String> getAllTasks() {
        return todoList;
    }
}
