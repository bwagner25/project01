import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        System.out.println("\nWhat would you like to do?\n(1) Add a task.\n(2) Remove a task.\n(3) Update a task.\n(4) List all tasks.\n(0) Exit.\n");
        String userInput = input.nextLine();
        while(!(userInput.equals("0"))) {
            if(userInput.equals("1")){
                addTask(tasks);
            }
            if(userInput.equals("2")){
                removeTask(tasks);
            }
            if(userInput.equals("3")){
                updateTask(tasks);
            }
            if(userInput.equals("4")){
                System.out.println(tasks);
            }
            System.out.println("\nWhat would you like to do?\n(1) Add a task.\n(2) Remove a task.\n(3) Update a task.\n(4) List all tasks.\n(0) Exit.\n");
            userInput = input.nextLine();
        }
    }
    static ArrayList<String> addTask(ArrayList a){
        Scanner input = new Scanner(System.in);
        System.out.println("What task would you like to add?");
        String newTask = input.nextLine();
        a.add(newTask);
        return a;
    }
    static ArrayList<String> removeTask(ArrayList a){
        Scanner input = new Scanner(System.in);
        System.out.println("Which number task would you like to remove?");
        String taskNumber = input.nextLine();
        int taskIndex = parseInt(taskNumber) - 1;
        a.remove(taskIndex);
        return a;
    }
    static ArrayList updateTask(ArrayList a){
        Scanner input = new Scanner(System.in);
        System.out.println("Which number task would you like to update?");
        String taskNumber = input.nextLine();
        int taskIndex = parseInt(taskNumber) - 1;
        System.out.println("What would you like to change this task to be?");
        String updatedTask = input.nextLine();
        a.set(taskIndex, updatedTask);
        return a;
    }
}