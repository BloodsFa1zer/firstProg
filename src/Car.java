import java.io.IOException;


public class Car implements Cloneable {
    int amountOfDoor;
     int amountOfWheel;
    String marka;
     String color;
     String model;



    public Car(int amountOfWheel, int amountOfDoor, String model, String marka, String color){
        this.amountOfDoor = amountOfDoor;
        this.amountOfWheel = amountOfWheel;
        this.color = color;
        this.model = model;
        this.marka = marka;
    }

    protected Object clone() throws  CloneNotSupportedException{
        return super.clone();
    }

}
