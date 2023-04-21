package Lab3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ціле число: ");
        int k = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введіть літеру: ");
        char symb = scanner.next().charAt(0);
        scanner.nextLine();
        System.out.println("Введіть рядок слів:");
        String outString = scanner.nextLine();
        MyStringChanger myList = new MyStringChanger(outString, k, symb);
        System.out.println("Опрацьована стрічка:\n" + myList.getOutString());
    }
}
