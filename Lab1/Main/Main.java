package Lab2.Main;

import Lab2.Classes.Student;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.util.Scanner;

public class Main {
    private Student[] std;

    public static void main(String[] args){

        Main main = new Main();

        main.printAll();

        main.filterByFaculty();
        main.filterAfterYear();
        main.filterByGroup();
    }

    public Main(){
        std = new Student[3];

        std[0] = new Student("Іваненко", "Іван", "Іванович", LocalDate.of(2000,1,1), "Тернопіль, Бережанська, 11", "+380661234567", "ВТІМ", 4, "ОМР-400");
        std[1] = new Student("Степаненко", "Степан", "Степанович", LocalDate.of(1989,9,3), "Тернопіль, Бережанська, 11", "+380661234567", "ВТІМ", 4, "ОМР-400");
        std[2] = new Student();
    }

    public Main(int size){
        std = new Student[size];
        for (int i = 0; i < size; i++) {
            std[i] = new Student();
        }
    }

    public void printAll(){
        for (Student item: std) {
            System.out.println(item.toString());
        }
    }

    public void filterByFaculty(){
        System.out.println("Для фільтрування введіть назву факультету:");
        Scanner scanner = new Scanner(System.in);
        filterByFaculty(scanner.nextLine());
    }

    public void filterByFaculty(String faculty){
        for (Student item: std) {
            if (item.getFaculty().equalsIgnoreCase(faculty))
                System.out.println(item.toString());
        }
    }

    public void filterAfterYear(){
        System.out.println("Для фільтрування введіть рік:");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        scanner.nextLine();
        filterAfterYear(LocalDate.of(year-1,12,31));
    }

    public void filterAfterYear(LocalDate Year){
        for (Student item: std) {
            if (item.getDateOfBirth().isAfter(Year))
                System.out.println(item.toString());
        }
    }

    public void filterByGroup(){
        System.out.println("Для фільтрування введіть назву групи:");
        Scanner scanner = new Scanner(System.in);
        filterByGroup(scanner.nextLine());
    }

    public void filterByGroup(String group){
        for (Student item: std) {
            if (item.getGroup().equalsIgnoreCase(group))
                System.out.println(item.toString());
        }
    }

    private static class String {
    }

    private class System {
    }
}
