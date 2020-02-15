package homework12.person;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
3. Создать класс Person который описывает человека, с полями: имя, фамилия, возраст, вес, рост.
        Создать один или несколько конструкторов которые гарантирует что у каждого есть имя, фамилия.
        Создать list из 100 обьектов типа Person заполненных случайными данными (Например создать
        массив на несколько имен и выбирать из него случайным образом).
3.1*. Обеспечить чтобы случайные данные (вес, рост, возраст) выглядели правдоподобно:
        не было человека весом 3 кг и ростом 180 итд.
*/
public class Main {

    public static final Random RANDOM = new Random();

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();

        for (int i = 0; i <100; i++) {
            String name = generateName();
            String lastName = generateLastName();
            int tmpAge = RANDOM.nextInt(66) + 5;
            int weight = generateWeight(tmpAge);
            int height = generateHigh(tmpAge);

            list.add(new Person(name, lastName, tmpAge, weight, height));
        }
       // System.out.println("\n" + people.toString());
        writeToFileV2(String.valueOf(list), "listPeople.txt");

    }

    private static void writeToFileV2(String str, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String generateLastName() {
        String[] lastName = {"Сокол", "Тищенко", "Приходько", "Усенко", "Бойко"};
        int j = RANDOM.nextInt(5);
        String tmplastName = lastName[j];
        return tmplastName;
    }

    private static String generateName() {
        String[] name = {"Роман", "Аркадий", "Ангелина", "Алексей", "Юлия", "Ирина"};
        int i = RANDOM.nextInt(6);
        String tmpName = name[i];
        return tmpName;
    }

    private static int generateWeight(int tmpAge) {
        int tmpWeight = 0;
        if (tmpAge >= 5 && tmpAge < 10) {
            tmpWeight = RANDOM.nextInt(5) + 20;
        }
        if (tmpAge >= 10 && tmpAge < 15) {
            tmpWeight = RANDOM.nextInt(15) + 25;
        }
        if (tmpAge >= 15 && tmpAge < 20) {
            tmpWeight = RANDOM.nextInt(25) + 45;
        }
        if (tmpAge >= 20 && tmpAge <= 70) {
            tmpWeight = RANDOM.nextInt(30) + 60;
        }
        return tmpWeight;
    }

    private static int generateHigh(int tmpAge) {
        int tmpHeight = 0;
        if (tmpAge >= 5 && tmpAge < 10) {
            tmpHeight = RANDOM.nextInt(20) + 80;
        }
        if (tmpAge >= 10 && tmpAge < 15) {
            tmpHeight = RANDOM.nextInt(20) + 120;
        }
        if (tmpAge >= 15 && tmpAge < 20) {
            tmpHeight = RANDOM.nextInt(30) + 160;
        }
        if (tmpAge >= 20 && tmpAge <= 70) {
            tmpHeight = RANDOM.nextInt(30) + 160;
        }
        return tmpHeight;
    }
}

