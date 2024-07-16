import java.util.Scanner;

public class Cashreturn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Money: ");
        int money = sc.nextInt();

            if (money >= 1000) {
                int no_T = money / 1000;
                money = money - (no_T * 1000);
                System.out.println("1000 : " + no_T);
            }
            if (money >= 500){
                int no_f = money / 500;
                money = money - (no_f * 500);
                System.out.println("500 : " + no_f);
            }
            if (money >= 100){
                int no_h = money / 100;
                money = money - ( 100 * no_h);
                System.out.println("100 : " + no_h);
            }
            if (money >= 50){
                int no_e = money / 50;
                money = money - ( 50 * no_e);
                System.out.println("50 : " + no_e);
            }
            if(money >= 20){
                int no_i = money / 20;
                money = money - ( 20 * no_i);
                System.out.println("20 : " + no_i);
            }
            if (money >= 10){
                int no_g = money / 10;
                money = money - (no_g * 10);
                System.out.println("10 : " + no_g);
            }
            if (money >= 5) {
                int no_s = money / 5;
                money = money - (no_s * 5);
                System.out.println("5 : " + no_s);
            }
        sc.close();
    }
}
