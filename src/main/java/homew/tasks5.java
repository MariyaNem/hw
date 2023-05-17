package homew;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.*;

public class tasks5 {
    public static void main(String[] args) {
//        ex1();
        ex2();
    }



// 1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

    private static void ex1() {

        Person p1 = new Person("Иван Иванов", "89163557743", "89123304299", "-");
        Person p2 = new Person("Петр Чернышов", "89163500657", "-", "-");
        Person p3 = new Person("Мария Федорова", "89183422100", "89183744949", "89104847140");
        Person p4 = new Person("Петр Лыков", "89138485903", "-", "-");

        List<Person> list = new ArrayList<Person>(Arrays.asList(p1,p2,p3,p4));
        HashMap<String, List<String>> hm = new HashMap<String, List<String>>();

        for(Person p : list) {
            if (hm.containsKey(p.fio)) {
                hm.get(p.fio).add(p.tel1+", "+p.tel2+", "+p.tel3);
            } else {
                hm.put(p.fio, new ArrayList<String>());
                hm.get(p.fio).add(p.tel1+", "+p.tel2+", "+p.tel3);
            }
        }
        System.out.println(hm);
    }


    private static void ex2() {
        List<String> persons = Arrays.asList("Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина",
                "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова",
                "Марина Светлова", "Мария Савина", "Мария Рыкова", "Марина Лугова", "Анна Владимирова",
                "Иван Мечников", "Петр Петин", "Иван Ежов");

        Map<String, Integer> nameCounts = new HashMap<>();
        for (String person : persons) {
            String name = person.split(" ")[0];
            nameCounts.put(name, nameCounts.getOrDefault(name, 0) + 1);
        }

        List<Map.Entry<String, Integer>> sortedNameCounts = new ArrayList<>(nameCounts.entrySet());
        Collections.sort(sortedNameCounts, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
                return b.getValue().compareTo(a.getValue());
            }
        });

        for (Map.Entry<String, Integer> entry : sortedNameCounts) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey()+" = "+entry.getValue());
            }
        }

    }
}
