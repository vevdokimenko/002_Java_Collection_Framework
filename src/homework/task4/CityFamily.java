package homework.task4;

/*
* Задание 4
Программа определяет, какая семья (фамилия) живёт в городе:
Пример ввода:
•	Москва
•	Ивановы
•	Киев
•	Петровы
•	Лондон
•	Абрамовичи

•	Лондон
Пример вывода:
•	Абрамовичи
* */

import java.util.HashMap;
import java.util.Map;

public class CityFamily {
    public static void main(String[] args) {
        Map<String, String> cityFamily = new HashMap<>();
        cityFamily.put("Москва", "Ивановы");
        cityFamily.put("Киев", "Петровы");
        cityFamily.put("Лондон", "Абрамовичи");

        System.out.println(cityFamily.get("Лондон"));
    }
}
