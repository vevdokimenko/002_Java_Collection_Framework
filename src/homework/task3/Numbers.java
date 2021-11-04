package homework.task3;

/*
* Задание 3
Минимальное из N чисел(использовать LinkedList):
1.	Ввести с клавиатуры число N.
2.	Считать N целых чисел и заполнить ими список - метод getIntegerList.
3.	Найти минимальное число среди элементов списка - метод getMinimum.
* */

import java.util.*;

public class Numbers {
    public LinkedList<Integer> getIntegerList(int count) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < count; i++) {
            try {
                System.out.printf("Enter %d number:\n", i + 1);
                list.add(new Scanner(System.in).nextInt());
            } catch (InputMismatchException e) {
                System.err.println("Enter a number please.");
            }
        }
        return list;
    }

    public int getMinimum(LinkedList<Integer> list) {
        int min = list.getFirst();

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int temp = iterator.next();
            if (temp < min) min = temp;
        }

        return min;
    }

    public static void main(String[] args) {
        LinkedList<Integer> integers;
        Numbers numbers = new Numbers();
        int count;

        while (true) {
            try {
                System.out.println("Enter a number:");
                count = new Scanner(System.in).nextInt();
                break;
            } catch (InputMismatchException e) {
                System.err.println("Enter a number please.");
            }
        }

        integers = numbers.getIntegerList(count);
        System.out.println(numbers.getMinimum(integers));
    }
}
