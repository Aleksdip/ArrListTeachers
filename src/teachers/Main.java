package teachers;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> teacher = new ArrayList<>();
        teacher.add("Lanina Nikolaevna");
        teacher.add("Veronika Andreevna");
        teacher.add("Olga Anatolievna");
        teacher.add("Tamara Nikolaevna");
        teacher.add("Nelya Alekseevna");

        System.out.println("The best teacher index = " + teacher.indexOf("Olga Anatolievna"));
        System.out.println("The worst teacher index = " + teacher.indexOf("Nelya Alekseevna"));
        System.out.println();

        for (String a : teacher) {
            System.out.println(a);
        }
    }
}