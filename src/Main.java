//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    float num1 = 10;
    float num2 = 20;
    float num3 = 30;

    if (num1 > num2 && num1 > num3) {
        System.out.println("The greatest number is " + num1);
    }
    else if (num2 > num1 && num2 > num3)
    {
        System.out.println("The greatest number is " + num2);
    }
    else
    {
        System.out.println("The greatest number is " + num3);
    }

    }
}