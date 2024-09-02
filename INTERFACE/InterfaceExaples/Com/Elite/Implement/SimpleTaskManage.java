package InterfaceExaples.Com.Elite.Implement;

import InterfaceExaples.Com.Elite.Interfaces.TaskManager;

import java.util.List;

public class SimpleTaskManage implements TaskManager {

    private List<String> task;
    @Override
    public void addTask(String task) {
     callvalidateTask(task);
//     task.wait(Long.parseLong(task));
     System.out.println(task);
    }
    public List<String> getTask(){
        return task;
    }
}
