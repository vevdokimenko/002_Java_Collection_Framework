package extra;

/*
* Вводить с клавиатуры строки, пока пользователь не введёт строку 'end':
* 1.	Создать список строк.
* 2.	Ввести строки с клавиатуры и добавить их в список.
* 3.	Вводить с клавиатуры строки, пока пользователь не введёт строку "end". "end" не учитывать.
* 4.	Вывести строки на экран, каждую с новой строки.
* */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        String str;
        List<String> words = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);

        while (true) {
            str = keyboard.nextLine();
            if (str.equals("end")) break;
            words.add(str);
        }

        for (String word : words) {
            System.out.println(word);
        }
    }
}
