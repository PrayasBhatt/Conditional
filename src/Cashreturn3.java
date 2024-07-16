import java.util.Scanner;

public class Cashreturn3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Money: ");
        int money = sc.nextInt();

        if (money >= 1000){
            int no_a = money / 1000;
            money = money - (no_a * 1000);
            System.out.println("1000 : " + no_a);
        }
        if (money >= 500){
            int no_b = money / 500;
            money = money - (no_b * 500);
            System.out.println("500 : " + no_b);
        }
        if (money >= 100){
            int no_c = money / 100;
            money = money - (no_c * 100);
            System.out.println("100 : " + no_c);
        }
        if (money >= 50){
            int no_d = money / 50;
            money = money - (no_d * 50);
            System.out.println("50 : " + no_d);
        }
        if (money >= 20){
            int no_e = money / 20;
            money = money - (no_e * 20);
            System.out.println("20 : " + no_e);
        }
        if (money >= 10){
            int no_f = money / 10;
            money = money - (no_f * 10);
            System.out.println("10 : " + no_f);
        }
        if (money >= 5){
            int no_g = money / 5;
            money = money - (no_g * 5);
            System.out.println("5 : " + no_g);
        }
    }
}
