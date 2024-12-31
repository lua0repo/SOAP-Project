import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

public class ToDoListClient {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://localhost:8080/todolistservice?wsdl");

        QName qname = new QName("http://www.example.com/todolist", "ToDoListService");

        Service service = Service.create(url, qname);

        ToDoListService todoListService = service.getPort(ToDoListService.class);

        // Add a task
        System.out.println(todoListService.addTask("Buy groceries"));

        // Get all tasks
        System.out.println(todoListService.getAllTasks());

        // Update a task
        System.out.println(todoListService.updateTask(0, "Buy groceries and cook dinner"));

        // Remove a task
        System.out.println(todoListService.removeTask(0));
    }
}
