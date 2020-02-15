package homework12;

import java.util.Collections;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyList list = new MyList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println(list);

        int index = 4;
        System.out.println("index = 4\nМетод get(int index): " + list.get(index) + "\n");

        list.set(2, 80);
        System.out.println("index = 2\nvalue = 80\nМетод set(int index, int value): " + list + "\n");

        list.add(5, 90);
        System.out.println("index = 5\nvalue = 90\nМетод add(int index, int value): " + list + "\n");

        list.remove(3);
        System.out.println("index = 3\nМетод remove(int index): " + list + "\n");

        list.removeByValue(40);
        System.out.println("value = 40\nМетод removeByValue(int value): " + list + "\n");

        list.sort();
        System.out.println(list.toString());

    }
}
