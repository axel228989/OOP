import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Lab0 {
    public static void main(String[] args) {
        method0();
    }
    private static void method0(){
        double a = 0.7, b= 0.05, x=0.5;
        double R = ((Math.pow(x,2) * (x + 1)) / b) - Math.pow(Math.sin(x + a),2);
        double s = Math.sqrt((x * b) / a) + Math.pow(Math.cos(Math.pow(x + b,3)),2);
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("s=" + s);
        System.out.println("R=" + R);
        method1();

    }
    private static void method1(){
        DateFormat dateFormat = new SimpleDateFormat("yy.MM.dd");
        String date = dateFormat.format(new Date());
        System.out.println(date);
        method2();
    }
    public static void method2(){
        Scanner num = new Scanner(System.in);
        double a,b, s, x = 0.5;
        System.out.print("vvedit a:");
        a = num.nextDouble();
        System.out.print("vvedit b:");
        b = num.nextDouble();
        System.out.print("vvedit s:");
        s = num.nextDouble();
        double R = ((Math.pow(x * (x + 1),2) / b)) - Math.pow(Math.sin(x + a), 2);
        s = Math.sqrt((x * b) / a) + Math.pow(Math.cos(Math.pow(x + b, 3)), 2);
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("y=" +s);
        System.out.println("R=" +R);
    }
    }
