package day13whileloopdowhileloop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        int a = 12;//Bu yapinin icinde sadece 1 tane data depolanabilir.
        //Ama biz code yazarken bir yapinin icinde coklu data depolama ihtiyacı hissederiz.
        // Bir yapinin icinde coklu data depolayabilme icin Java "Array" yapisini olusturmustur.

        //Array nasil olusturulur?
        //Array olusturmak icin Array elemanlarinin "data type" ı ve "eleman sayisi" mutlaka yazilmalidir.
        String stdNames[] = new String[5];

        //Array console'a nasil yazdirilir?
        //toString() method'unu kullanmadan sadece array ismi ile yazdirirsaniz Java o Array'in adresini yazdirir.
        System.out.println(Arrays.toString(stdNames));//[null, null, null, null, null]

        //Array e elemean ekleme nasil yapilir?
        stdNames[2]="Ajda";
        System.out.println(Arrays.toString(stdNames));//[null, null, Ajda, null, null]

        stdNames[0]="Cuneyt";
        stdNames[1]="Kemal";
        stdNames[2]="Ajda";
        stdNames[3]="Ezel";
        stdNames[4]="Besir";

        System.out.println(Arrays.toString(stdNames));

        //Array den spesific bir elemani almak
        System.out.println(stdNames[2]);


        //ex1: Array deki her elemani sonuna"!" koyarak ekrana yazdiriniz

        for (int i = 0; i <stdNames.length ; i++) {
            System.out.println(stdNames[i] + "!");

        }








    }
}
