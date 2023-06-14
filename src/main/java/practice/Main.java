package practice;

import java.util.Scanner;

public class Main {
    private static TodoList todoList = new TodoList();

    public static void main(String[] args) {


        while (true) {
            String input = new Scanner(System.in).nextLine();
            String commandsUser ;
            String todo ;

            int index = 0 ;
            int team = input.indexOf(' ');
            if (team < 0) {
                commandsUser = input;
            } else {
                commandsUser = input.substring(0, team);
            }
            todo = input.substring(team + 1);
            if (Character.isDigit(todo.charAt(0)) && commandsUser.equals("ADD")) {
                todoList.stringWithNumber(index, todo);
                todoList.add(index,todo);
            } else if (commandsUser.equals("ADD")) {
                todoList.add(todo);
            } else if (commandsUser.equals("LIST")) {
                todoList.list();
            } else if (commandsUser.equals("DELETE") && Character.isDigit(todo.charAt(0))) {
                String delete = input.substring(team + 1);
                index = Integer.parseInt(delete);
                todoList.delete(index);
            } else if (commandsUser.equals("EDIT") && Character.isDigit(todo.charAt(0))) {
                todoList.stringWithNumber(index, todo);
                todoList.edit(index,todo);
            } else {
                System.out.println("Команда не распознана, повторите попытку.");
            }


            // TODO: написать консольное приложение для работы со списком дел todoList
        }

    }
}