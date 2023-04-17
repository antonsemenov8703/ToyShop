package model;

import java.util.List;

public interface FileOperations {
    void putAllToys(List<String> toys);
    List<String> getAllToys();
    void removeToys();
}
