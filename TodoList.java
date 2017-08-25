import java.util.ArrayList;

/**
 * Class representing a todo list.
 * TodoList object should aggregate TodoItem objects.
 */

public class TodoList{

    ArrayList<TodoItem> toDoList = new ArrayList<TodoItem>();

    public void addItem(String itemName){
        toDoList.add(new TodoItem(itemName));
    }

    public void markTask(String itemName){
        for(TodoItem item: toDoList){
            if (item.getToDo().equals(itemName)){
                item.mark();
            } else {
            System.out.println("Ther is no such a todo thing in your app. Too see what you have type 0.\n");
            }
        }
    }

    public void archieveTask(){
        for (int i=0; i<toDoList.size(); i++){
            if (toDoList.get(i).getIsDone()){
                toDoList.remove(i);
            }
        }
    }

}

