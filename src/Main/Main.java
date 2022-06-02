package Main;

public class Main {
    public static void main(String[] args) {

        int amountInCoints = 10000; // стоимость билета
        int PercentInСoints = 20; // сколько рублей за 1 милю
        int bonus = amountInCoints / PercentInСoints; // кол-во миль за билет

        System.out.println("Alexandr, Hello! Thank you for choosing our airline for your flight.");
        System.out.println("Your bonus is:" + bonus + " miles");

    }
}