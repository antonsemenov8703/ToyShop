package controller;

import model.MachineInterface;
import view.UserInterface;

import java.util.Scanner;

public class UserController {

    private final MachineInterface machineInterface;

    public UserController(MachineInterface machineInterface){
        this.machineInterface = machineInterface;
    }

    public void addToy(String name, int toysCount){
        this.machineInterface.addToy(name, toysCount);
    }

    public void removeToys(){
        machineInterface.removeToys();
    }
}