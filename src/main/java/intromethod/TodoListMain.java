package intromethod;

import java.util.Arrays;

public class TodoListMain {

    public static void main(String[] args) {

        TodoList todoList = new TodoList();


        todoList.addTodo("Első tennivaló");
        todoList.addTodo("Második tennivaló");
        todoList.addTodo("Harmadik tennivaló");
        todoList.addTodo("NEgyedik tennivaló");

        System.out.println(todoList);
        todoList.finishTodos("Első tennivaló");
        System.out.println(todoList.numberOfFinishhedTodos());
        System.out.println(todoList);

        System.out.println(todoList.todosToFinish());

        todoList.finishAllTodos(todoList.todosToFinish());
        System.out.println(todoList.todosToFinish());
        System.out.println(todoList);
        System.out.println(todoList.numberOfFinishhedTodos());


    }
}
