package practice;

import java.util.ArrayList;

public class TodoList {

    private  ArrayList<String> todoList = new ArrayList<>();

    public void add(String todo) {
        todoList.add(todo);
        System.out.println("Добавлено дело " + "\""+todo+ "\"");
        // TODO: добавьте переданное дело в конец списка
    }

    public void add(int index, String todo) {
        if (index > todoList.size() - 1 || index < 0){
            todoList.add(todo);
            System.out.println("Добавлено дело " + "\""+todo+ "\"");
        } else {
            todoList.add(index , todo);
            System.out.println("Добавлено дело " + "\""+todo+ "\"");
        }
        // TODO: добавьте дело на указаный индекс,
        //  проверьте возможность добавления
    }

    public void edit(int index, String todo) {
        if (index > todoList.size() - 1 || index < 0){
            System.out.println("Дело с таким номером не существует");
        } else {
            todoList.set(index, todo);
            String pool= todoList.get(index);
            System.out.println("Дело" + "\"" + pool + "\"" + " заменено на " + "\""
                    + todo + "\"" );
        }

        // TODO: заменить дело на index переданным todo индекс,
        //  проверьте возможность изменения
    }

    public void delete(int index) {
        if (index > todoList.size() - 1 || index < 0){
            System.out.println("Дело с таким номером не существует");
        } else {
            System.out.println("Дело " + " \"" + todoList.get(index) + "\"" + " удалено");
            todoList.remove(index);
        }
        // TODO: удалить дело находящееся по переданному индексу,
        //  проверьте возможность удаления дела
    }
    public ArrayList<String> getTodos() {
        // TODO: вернуть список дел
        return todoList;
    }

    public void stringWithNumber(int index, String todo ){
        int start = todo.indexOf(' ');
        String figure = todo.substring(0, start);
        index = Integer.parseInt(figure);
        todo = todo.substring(start + 1);
    }

    public void list(){
        if (getTodos().isEmpty()) {
            System.out.println("Список дел пуст");
        }
        for (int i = 0; i < getTodos().size(); i++) {
            int indexElements = getTodos().indexOf(getTodos().get(i));
            System.out.println(indexElements + " - " + getTodos().get(i));
        }
    }

}