package intelliJava;

enum Mobile {

    apple, samsung, htc;

}

public class EnumPractice {
public static void main(String[] args) {

Mobile m = Mobile.htc;

    switch (m){

        case apple:
            System.out.println("Apple is best");

            break;

        case samsung:

            System.out.println("Samsung is first");
            break;

        case htc:
            System.out.println("htc is expensive");
    }

    }
}
