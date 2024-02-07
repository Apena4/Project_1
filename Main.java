import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int task = prompt(input);
        while(true){
            switch (task){
                case 1:
                    newTask(input);
                    task = prompt(input);
                    break;
                case 2:
                    deleteTask(input);
                    task = prompt(input);
                    break;
                case 3:
                    changeTask(input);
                    task = prompt(input);
                    break;
                case 4:
                    list();
                    task = prompt(input);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("enter another value");
                    prompt(input);
                    break;


            }



        }

    }
    public static int prompt(Scanner input){
        System.out.println("Please Select a Task. \n1.) Add a task \n2.) Remove a task \n3.) Update a task \n4.)List all tasks \n0.) Exit \nWhich task would you like to assign?");
        int task = input.nextInt();
        input.nextLine();
        return task;
    }
//Here the newTask method asks what task they want to add then waits for the users feedback while also keeping it in a string
    public static String newTask(Scanner input){
        System.out.println("What task do you wish to add?");
        String task = input.nextLine();
        taskList.add(task);
        return task;
    }
    //prints the statement of which task the user wants to get removed then waits for the users input and then removes said task
    public static void deleteTask(Scanner input){
        System.out.println("What do you wish to remove?");
        int taskRemove = input.nextInt();
        input.nextLine();
        taskList.remove(taskRemove);
        System.out.println(taskList);

    }

    public static ArrayList<String> taskList = new ArrayList<>();
//Here it lists the tasks that are listed and then you can decide which one to change based of the index value shown next to each task
    public static void changeTask(Scanner input){
        System.out.println(taskList);
        System.out.println("Which task do you want to update");
        System.out.println(taskList.size());
        int newList = input.nextInt();
        System.out.println("What is the new tasks' description");
        String taskDescribe = input.nextLine();
        taskList.set(newList, taskDescribe);



    }
//ArrayList allows any value to get in so the list of task can be listed while also showing the index
    public static ArrayList list(){
        for(int i = 0; i < taskList.size(); i++){
            System.out.println(i + ":" + taskList.get(i) + "\n");
        }
        return taskList;
    }


}