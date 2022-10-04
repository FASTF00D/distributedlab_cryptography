import java.util.Scanner;

public class Dispatcher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int equation;
        System.out.println("Введіть номер завдання для подальших інструкцій" + "\n" + "1. Розвязати рівняння виду a mod m = x" + "\n" + "2. Розвязати рівняння виду a^b mod m = x" + "\n" + "3. Розвязати рівняння виду a*x === b mod m" + "\n" + "4. Згенерувати просте число в діапазоні від А до B");
        equation = sc.nextInt();

        if(equation == 1){
            System.out.println("Задайте значення а та m: ");
            System.out.println(firstEquation(sc.nextInt(), sc.nextInt()));
        }
        else if(equation == 2){
            System.out.println("Задайте значення а, b, m: ");
            System.out.println(secondEquation(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }
        else if(equation == 3){
            System.out.println("Задайте значення a, x, щоб дізнатися b та m: ");
            System.out.println(thirdEquation(sc.nextInt(), sc.nextInt()));
        }
        else if(equation == 4){
            System.out.println("Задайте значення min та max: ");
            System.out.println(fourthEquation(sc.nextInt(), sc.nextInt()));
        }
        else{
            System.out.println("Невірний номер завдання :( ");
        }



        //   System.out.println("Задайте значення а та m: ");
     //   System.out.println(firstEquation(sc.nextInt(), sc.nextInt()));

     //   System.out.println("Задайте значення а, b, m: ");
     //   System.out.println(secondEquation(sc.nextInt(), sc.nextInt(), sc.nextInt()));

        //   System.out.println("Задайте значення а, b, m: ");
        //System.out.println(fourthEquation(sc.nextInt(), sc.nextInt()));
    }

    public static int firstEquation(int a, int m){
        int result = a%m;
        System.out.print("X = ");
        return result;
    }


    public static int secondEquation(int a, int b, int m) {
        return (int) (Math.pow(a,b)%m);
    }


    public static String thirdEquation(int a, int x){
        int leftSide = a*x;
        int b = 1;
        int m = 1;
            while((b%m) != leftSide){
                b=b+2;
                m=m+1;
            }
        return (a) + "*" + (x) + " = " + (b) + " mod " + (m);
    }


    public static int fourthEquation(int a, int b){
        return (int) ((Math.random() * (b-a)) + a);
    }

}

