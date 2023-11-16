package p6;
import java.io.Serializable;

public class People implements Serializable { // интерфейс Serializable

    private String name;
    private int age;
    private transient double height;  // модификатор transient - нельзя будет в серализации отобразить данный параметр - Name: Alex Age: 34 Height: 0,00
    private transient boolean married;

    public People(String name, int age, double height, boolean married) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.married = married;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public boolean isMarried() {
        return married;
    }
}