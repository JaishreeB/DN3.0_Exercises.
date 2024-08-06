public class Main {
    public static void main(String[] args) {
        SinglyLinkedList taskList = new SinglyLinkedList();

        // Add tasks
        taskList.addTask(new Task(1, "Design the system", "In Progress"));
        taskList.addTask(new Task(2, "Develop the application", "Not Started"));
        taskList.addTask(new Task(3, "Test the application", "Not Started"));

        // Traverse tasks
        System.out.println("Tasks:");
        taskList.traverseTasks();

        // Search for a task
        Task task = taskList.searchTask(2);
        if (task != null) {
            System.out.println("Found Task: " + task);
        } else {
            System.out.println("Task not found.");
        }

        // Delete a task
        taskList.deleteTask(2);
        System.out.println("After deletion:");
        taskList.traverseTasks();
    }
}
