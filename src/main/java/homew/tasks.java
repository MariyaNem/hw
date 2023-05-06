package homew;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class tasks {
    public static void main(String[] args) {
        ex1();
//        ex2();
//        ex3();
    }


    //        1. Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа.
    //        Пройти по списку, найти и удалить целые числа.
    //        Пример: {"Яблоко", "11", "13", "Апельсин", "Дыня", "17"} -> {"Яблоко", "Апельсин", "Дыня"}
    private static void ex1() {

        String[] fr = {"Яблоко", "11", "13", "Апельсин", "Дыня", "17"};
        List<String> fruits = new ArrayList<>();
        for (int i = 0; i < fr.length; i++) {
            fruits.add(fr[i]);
        }
        System.out.println(fruits);

        for (int i = 0; i < fruits.size(); i++) {
            String num = fruits.get(i);
            try {
                Integer.parseInt(num);
                fruits.remove(num);
                i--;
            } catch (Exception ignore) {
            }
        }
        System.out.println(fruits);
    }


//    2. Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так,
//    что на 0-й позиции каждого внутреннего списка содержится название жанра, а на остальных позициях - названия книг.
//    Напишите метод для заполнения данной структуры(можно через консоль).
//    Пример: "Классика", "Преступление и наказание", "Война и мир", "Анна Каренина".
//            "Научная фантастика", "Солярис", "Ночной дозор", "Братья Стругацкие".
//            "Детектив", "Десять негритят".
//            "Фэнтези", "Хроники Нарнии", "Гарри Поттер и философский камень", "Грозовой перевал".
    private static void ex2(){
        List<ArrayList<String>> list = new ArrayList<>();

        Scanner scCount1 = new Scanner(System.in);
        System.out.println("Введите количество жанров: ");
        int count1 = scCount1.nextInt();


        for (int i = 0; i < count1; i++) {
            ArrayList<String> book = new ArrayList<>();

            Scanner scGenre = new Scanner(System.in);
            System.out.println("Введите жанр книги: ");
            String genreBook = scGenre.nextLine();
            book.add(genreBook);

            Scanner scCount2 = new Scanner(System.in);
            System.out.println("Введите количество книг этого жанра: ");
            int count2 = scCount2.nextInt();

            for (int j = 0; j < count2; j++) {
                Scanner scName = new Scanner(System.in);
                System.out.println("Введите название книги: ");
                String nameBook = scName.nextLine();
                book.add(nameBook);


            }
            list.add(book);
            for(ArrayList<String> item:list){
                System.out.println(item);
        }
        }
    }

//    3. Доделать задание 2.2 участникам семинара
    private static void ex3() {
        String[] planetsNamesStrArr = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Neptune", "Uranus", "Pluto"};
        List<String> randomSolarSystem = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            randomSolarSystem.add(planetsNamesStrArr[random.nextInt(planetsNamesStrArr.length)]);
        }
        System.out.println(randomSolarSystem);
    }
}