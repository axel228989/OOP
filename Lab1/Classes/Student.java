package Lab2.Classes;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Student<String> {
    private static int nextID = 0;
    private int id;
    private java.lang.String lastName;
    private java.lang.String firstname;
    private String patronymic;
    private LocalDate dateOfBirth;
    private String address;
    private String phone;
    private String faculty;
    private int course;
    private String group;

    public Student(){
        id = getNextID();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть наступні дані студента: \nпрізвище: ");
        lastName = scanner.nextLine();
        System.out.print("ім'я: ");
        firstname = scanner.nextLine();
        System.out.print("по батькові: ");
        patronymic = scanner.nextLine();
        System.out.print("дата народження (дд.мм.рік): ");
        dateOfBirth = Student.inputDate();
        System.out.print("адреса: ");
        address = scanner.nextLine();
        System.out.print("номер телефону: ");
        phone = scanner.nextLine();
        System.out.print("факультет: ");
        faculty = scanner.nextLine();
        System.out.print("курс: ");
        course = scanner.nextInt();
        scanner.nextLine();
        System.out.print("група: ");
        group = scanner.nextLine();
    }

    public Student(int a){
        id = getNextID();
        lastName = "Петренко";
        firstname = "Петро";
        patronymic = "Петрович";
        dateOfBirth = LocalDate.of(1999,7,10);
        address = "Тернопіль, вул. Живова, 7";
        phone = "+380971234567";
        faculty = "ВЕА";
        course = 4;
        group = "ОПК-421";
    }

    public Student(String lastName, String firstname, String patronymic, LocalDate dateOfBirth, String address, String phone, String faculty, int course, String group) {
        this.lastName = lastName;
        this.firstname = firstname;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phone = phone;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public static int getNextID() {
        return nextID++;
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    private static LocalDate inputDate() {
        LocalDate ld;
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.uuuu" );
        try {
        String text = scanner.nextLine();
        ld = LocalDate.parse(text, format);
        }catch (Exception e){
            System.out.print("Дату введено невірно! Правильний формат: дд.мм.рррр:");
            String text = scanner.nextLine();
            ld = LocalDate.parse(text, format);
        }
        return ld;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstname='" + firstname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", dateOfBirth='" + dateOfBirth.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", faculty='" + faculty + '\'' +
                ", course=" + course +
                ", group='" + group + '\'' +
                '}';
    }

}
