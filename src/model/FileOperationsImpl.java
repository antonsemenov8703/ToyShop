package model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileOperationsImpl implements FileOperations{

    private String fileName;

    public FileOperationsImpl(String fileName){
        this.fileName = fileName;
        try (FileWriter csvWriter = new FileWriter(fileName, true)){
            csvWriter.flush();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }


    @Override
    public void putAllToys(List<String> toys) {
        try (FileWriter csvWriter = new FileWriter(fileName, true)){
            for (String toy: toys){
                csvWriter.write(toy);
                csvWriter.append("\n");
            }
            csvWriter.flush();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<String> getAllToys() {
        List<String> allToys = new ArrayList<>();
        try{
            File file = new File(fileName);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            if (line != null){
                allToys.add(line);
            }
            while (line != null){
                line = bufferedReader.readLine();
                if (line != null){
                    allToys.add(line);
                }
            }
            fileReader.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        return allToys;
    }

    @Override
    public void removeToys() {
        try {
            FileWriter fw = new FileWriter(fileName, false);
            PrintWriter pw = new PrintWriter(fw, false);
            pw.flush();
            pw.close();
            fw.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}