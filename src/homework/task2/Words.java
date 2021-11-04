package homework.task2;

/*
* Задание 2
Используя коллекцию удвойте слово:
1.	Введите с клавиатуры 5 слов в список строк.
2.	Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
3.	Используя цикл for выведите результат на экран, каждое значение с новой строки.
* */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Words {
    public List<String> doubleValues(List<String> words) {
        List<String> newList = new ArrayList<>();
        for (String word : words) {
            char[] letters = word.toCharArray();
            word = "";
            for (char letter : letters) {
                word += letter;
                word += letter;
            }
            newList.add(word);
        }
        return newList;
    }

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            words.add(new Scanner(System.in).nextLine());
        }

        List<String> doubleWords = new Words().doubleValues(words);

        for (String item : doubleWords) {
            System.out.println(item);
        }
    }
}
