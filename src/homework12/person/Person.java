package homework12.person;

public class Person {
    private String name;
    private String lastName;
    private int ege;
    private int weight;
    private int height;

    public Person(String name, String lastName, int ege, int weight, int height) {
        this.name = name;
        this.lastName = lastName;
        this.ege = ege;
        this.weight = weight;
        this.height = height;
    }

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "\n" + name + " " + lastName + " " + ege + "лет " + weight + "кг " + height + "cм";

    }
}
