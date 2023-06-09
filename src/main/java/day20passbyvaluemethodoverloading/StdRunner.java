package day20passbyvaluemethodoverloading;

import java.util.Arrays;
import java.util.List;

public class StdRunner {

    public static void main(String[] args) {
// stdName static oldugundan, ona ulasmak icin object olusturmadim.
        //Sadece class ismini kullanmak yeterlidir.
        System.out.println(Student.stdName);//Tom Hanks
// age non-static oldugundan ona ulasmak icin object olusturmak zorundayiz.

        Student std1 = new Student();
        System.out.println(std1.age);//13

        String initials = Student.getInitials("Tom Cruise");
        System.out.println(initials);//TC

        int vowels = std1.countVowels("Tom Cruise");
        System.out.println(vowels);//4


        // static olanlari objeyle cagirmak tavsiye edilmez.
        String s = std1.getInitials("Ali Can");
        System.out.println(s);

        // List olusturmada yeni bir isilti
        List<String> names=  List.of("Ali", "Veli", "Can");














    }
}