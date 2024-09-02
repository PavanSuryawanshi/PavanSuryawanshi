package InterfaceExaples.Com.Elite;

import InterfaceExaples.Com.Elite.Implement.SimpleTaskManage;
import InterfaceExaples.Com.Elite.Interfaces.TaskManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleTaskManage st = new SimpleTaskManage();
        TaskManager.printVersion();
        System.out.println("How many tasks do you want to run? ");
        int numberOfTasks = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < numberOfTasks; i++) {
            System.out.println("Please enter" +i+ "task:");
            String name = sc.nextLine();
            st.addTask(name);

        }
        st.ListTasks(st.getTask());

        }
    }

