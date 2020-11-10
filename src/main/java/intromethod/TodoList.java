package intromethod;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class TodoList {

    private List<Todo> todos = new ArrayList<>();

    // Add todos -> a teendőlistához hozzáad
    public void addTodo(String caption) {
        Todo todo = new Todo(caption);
        todos.add(todo);
    }

    // Egy feladat befejezettre állítása, ha egyezik a neve a paraméterrel
    public void finishTodos(String caption) {

        for (Todo todo : todos) {
            if (todo.getCaption().equals(caption)) {
                todo.finish();
            }
        }

    }

        // Összes készre állítása

public void finishAllTodos(List<String>todosToFinish){
        for(String todoToFinish:todosToFinish) {
            finishTodos(todoToFinish);
     }
    }

    // több készre állítása
    public List<String> todosToFinish() {
        List<String> todosToFinish = new ArrayList<>();

        for(Todo todo:todos) {
            if(!todo.isFinished()){
                todosToFinish.add(todo.getCaption());
            }
        }
        return todosToFinish;

    }


    // Számláló
    public int numberOfFinishhedTodos() {
        int count = 0;

        for (Todo todo: todos) {
            if(todo.isFinished()) {
                count ++;
            }
        }
        return count;

    }

    @Override
    public String toString() {
        return todos.toString();
    }
}
