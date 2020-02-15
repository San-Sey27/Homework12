package homework12;

import java.util.Arrays;

/*
    1) Реализовать методы add(int value), get, set, toString
    2*) Реализовать остальные методы из примера выше и сделать
    сортировку вставками для MyList
*/

public class MyList {
    private int[] arr = new int[0];

    public void add(int value) {
        int[] tmp = new int[arr.length + 1];
        System.arraycopy(arr, 0, tmp, 0, arr.length);
        tmp[tmp.length - 1] = value;
        arr = tmp;
    }

    public int get(int index) {
        if (index >= arr.length) {
            return -1;
        }
        return arr[index - 1];
    }

    public void set(int index, int value) {
        arr[index-1] =value;
    }

    public void add(int index, int value) {
        int[] tmp = new int[arr.length + 1];
        System.arraycopy(arr, 0, tmp, 0, index - 1);
        tmp[index - 1] = value;
        System.arraycopy(arr, index - 1, tmp, index, tmp.length - index);
        arr = tmp;

    }

    public void remove(int index) {
        int[] tmp = new int[arr.length - 1];
        System.arraycopy(arr, 0, tmp, 0, arr.length - index);
        System.arraycopy(arr, index, tmp, index - 1, arr.length - index);
        arr = tmp;
    }

    public void removeByValue(int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                int[] tmp = new int[arr.length - 1];
                System.arraycopy(arr, 0, tmp, 0, i);
                System.arraycopy(arr, i + 1, tmp, i, tmp.length - i);
                arr = tmp;
                break;
            }
        }
    }

    public void sort() {
        for (int left = 0; left < arr.length; left++) {
            int value = arr[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < arr[i]) {
                    arr[i + 1] = arr[i];
                } else {
                    break;
                }
            }
            arr[i + 1] = value;
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }

}

