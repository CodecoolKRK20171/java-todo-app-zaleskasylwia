import java.util.Scanner;

/**
 * Class representing the TodoApp application.
 * It is the main entry point for this program.
 */

public class App{
  public static void main(String[] args) {
      TodoList listToDo = new TodoList();
      
      Scanner input = new Scanner(System.in);
      int choice = 0;

      System.out.println("WELCOME IN TO-DO APP");

      while (choice != 4) {
        String menu = String.format("%s\n%s\n%s\n%s\n%s\n%s\n",
                      "0. to see your to do list.",
                      "1. to add a new thing to your to do list.",
                      "2. to mark an item",
                      "3. to archive marked an item",
                      "4. to exit the program.",
                      "Select an option: ");

        System.out.print(menu);

        choice = input.nextInt();
        if (choice==0){
          for (TodoItem todo: listToDo.toDoList){
            System.out.println(todo.displayInfo());
            }
        }

        if (choice==1){
          System.out.println("What you want add: ");
          Scanner sc = new Scanner(System.in);
          String toDoThing = sc.nextLine();
          listToDo.addItem(toDoThing);
        }

        if (choice==2){
          System.out.println("Type item to mark it. ");
          Scanner sc1 = new Scanner(System.in);
          String toDoThing = sc1.nextLine();
          listToDo.markTask(toDoThing);
        }

        if (choice==3){
          listToDo.archieveTask();
        }
    }
  }
}

