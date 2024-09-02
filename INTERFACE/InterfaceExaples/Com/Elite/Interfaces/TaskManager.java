package InterfaceExaples.Com.Elite.Interfaces;

import java.util.List;

public interface  TaskManager {
    public static final String VERSION = "1.0";

    void addTask(String task);

    default void ListTasks(List<String> tasks){
        if(tasks.isEmpty()){
            System.out.println("No tasks found");
        }else {
            System.out.println("Tasks found");
            for(String task : tasks){
                System.out.println("-"+task);
            }
        }
    }
    default void callvalidateTask(String task){
        validateTask(task);
    }

    static void printVersion(){
        System.out.println(VERSION);
    }
    private void validateTask(String task){
        if(task == null || task.isEmpty()){
            throw new IllegalArgumentException("Invalid task");
        }
    }
    private static void internalFunction(){
        System.out.println("This is a function");
    }
}
