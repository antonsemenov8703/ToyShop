package model;

import java.util.List;

public class Toymapper {

    public String saveMapToy(Toy toy){
        return String.format("%d;%s;%d;%d", toy.getToyId(), toy.getToyName(), toy.getToysCount(), toy.getToyWinning());
    }

    public Toy loadMapToy(String toy){
        String[] toyString = toy.split(";");
        return new Toy(Integer.parseInt(toyString[0]), toyString[1],
                Integer.parseInt(toyString[2]), Integer.parseInt(toyString[3]));
    }
}