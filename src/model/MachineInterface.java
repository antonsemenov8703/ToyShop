package model;

import java.util.List;

public interface MachineInterface {
    public void addToy(String toyName, int toysCount);
    List<Toy> getAllToys();
    public void winToy();
    public void removeToys();
}