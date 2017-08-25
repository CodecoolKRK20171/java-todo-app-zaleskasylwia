/**
 * Class representing a single todo item.
 * 
 */
public class TodoItem{
    
    String toDo;
    boolean isDone = false;

    public TodoItem(String toDo){
        this.toDo = toDo;
        this.isDone = false;
    }

    public boolean mark(){
        return isDone=true;
    }

    public boolean getIsDone(){
        return this.isDone;
    }

    public String getToDo(){
        return this.toDo;
    }

    public String displayInfo(){
        String msg;
        if (this.isDone){
            msg = "[x] " + this.toDo;
        } else{
            msg = "[] " + this.toDo;
        }
        return msg;
    }


}



