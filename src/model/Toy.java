package model;

public class Toy {

    private int toyId;
    private String toyName;
    private int toysCount;
    private int toyWinning;

    public Toy(int toyId, String toyName, int toysCount, int toyWinning){
        this.toyId = toyId;
        this.toyName = toyName;
        this.toysCount = toysCount;
        this.toyWinning = toyWinning;
    }

    public Toy(String toyName, int toysCount){
        this.toyId = 0;
        this.toyName = toyName;
        this.toysCount = toysCount;
        this.toyWinning = 0;
    }

    public int getToyId() {
        return toyId;
    }

    public String getToyName() {
        return toyName;
    }


    public int getToyWinning() {
        return toyWinning;
    }

    public int getToysCount() {
        return toysCount;
    }

    public void setToyName(String toyName) {
        this.toyName = toyName;
    }



    @Override
    public String toString() {
        return "Toy{" +
                "toyId=" + toyId +
                ", toyName='" + toyName + '\'' +
                ", toyWinning=" + toyWinning +
                '}';
    }
}