package day08nestedif;

public class C02_NestedIf {

    /*
    Passwordun ilk harfi buyuk harf ise
    'A' olursa gecerli password yazdirin degilse
    gecersiz password yazdirin
    Passwordun ilk harfi kucuk harf ise
    'z' olursa gecerli passworde yazdirin degilse gecersiz passwordu yazdirirn

     */


    public static void main(String[] args) {


        String pwd = "Kxy12!";

        char ilkHarf = pwd.charAt(0);

        if (ilkHarf >= 'A' && ilkHarf <= 'Z') {

            if (ilkHarf == 'A') {
                System.out.println("Gecerli Password");
            } else {
                System.out.println("Gecersiz Password");
            }

        } else if (ilkHarf >= 'a' && ilkHarf <= 'z') {
            if (ilkHarf == 'z') {
                System.out.println("Gecerli Password");
            } else {
                System.out.println("Gecersiz Password");
            }

        } else {
            System.out.println("Ilk Karakter Harf Olmali");
        }


    }


}
