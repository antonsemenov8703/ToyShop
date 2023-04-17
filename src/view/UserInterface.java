package view;

import controller.UserController;
import model.Toy;

import java.util.Scanner;

public class UserInterface {

    private UserController userController;

    public UserInterface(UserController userController){
        this.userController = userController;
    }

    public void startMenu(){
        System.out.println("_______________");
        System.out.println("Автомат игрушек");
        System.out.println("---------------");
        System.out.println("Доступные команды: ADD_TOY, REMOVE_TOYS," +
                "VIEW_TOYS, HELP, WIN_TOY, EXIT");
        System.out.println("Для справки введите HELP!");
    }

    public void run(){
        Commands com = Commands.NONE;
        while (true){
            startMenu();
            String command = prompt("-> ");
            try{
                com = Commands.valueOf(command.toUpperCase());
                if (com == Commands.EXIT){
                    return;
                }
                switch (com){
                    case ADD_TOY:
                        addToy();
                        break;
                    case REMOVE_TOYS:
                        removeToys();
                        break;
                    case VIEW_TOYS:
                        System.out.println("VIEW_TOYS");
                        break;
                    case WIN_TOY:
                        System.out.println("WIN_TOY");
                        break;
                    case HELP:
                        printHelp();
                }

            }catch (Exception e){
                System.out.println(e.getStackTrace());
            }
        }
    }

    public void addToy(){
        String toyName = prompt("Введите название игрушки: ");
        int toysCount = Integer.parseInt(prompt("Введите количество игрушек: "));
        userController.addToy(toyName, toysCount);
    }

    public void removeToys(){
        userController.removeToys();
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private void printHelp(){
        for (Commands com: Commands.values()){
            System.out.println(com.getTitle());
        }
    }

    private String getToyName(){
        return prompt("Введите наименование игрушки: ");
    }

    private int getToysCount(){
        String count = prompt("Введите количество игрушек: ");
        int result = 0;
        try{
            result = Integer.parseInt(count);
        }
        catch (Exception e){
            System.out.println("Вы ввели не число!");
        }
        return result;
    }

}