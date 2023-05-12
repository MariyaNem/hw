package homew;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Collections;

public class task4 {
    public static void main(String[] args) {
//        ex1();
        ex2();
    }

    //    1. Реализовать консольное приложение, которое:
//    Принимает от пользователя и “запоминает” строки.
//    Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//    Если введено revert, удаляет предыдущую введенную строку из памяти.
    private static void ex1() {
        LinkedList<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Доступные команды: print - если хотите вывести список наоборт или revert если хотите удалить предыдущую строку");

        while (true) {

            System.out.println("Введите строку или команду: ");
            String input = scanner.nextLine();

            if (input.equals("print")) {
                System.out.println("Строки в обратном порядке: ");
                while (!list.isEmpty()) {
                    System.out.println(list.removeLast());
                }
            } else if (input.equals("revert")) {
                if (!list.isEmpty()) {
                    list.removeLast();
                    System.out.println("Последняя строка удалена.");
                }
            }
        }
    }
    private static void ex2() {
        LinkedList<String> list = new LinkedList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        LinkedList<String> reversedList = reverseLinkedList(list);
        System.out.println(reversedList); //
    }

    public static LinkedList reverseLinkedList(LinkedList list) {
        Collections.reverse(list);
        return list;
    }

}
