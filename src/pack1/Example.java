package pack1;

import java.util.Scanner;


public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float length = 2.5f;
        double radius = 10024.5;
        int meanOfLife = 42;
        Object object = new String("Hello, world!");
        String s = "Once compiled, runs everywhere?";
        int[] b = new int[10];

        System.out.print("Введите string: ");
        s = sc.nextLine();

        System.out.print("Введите целое число: ");
        if (sc.hasNextInt()) { /* hasNextInt()возвращает истинну если с потока ввода
можно считать целое число*/

            int i = sc.nextInt();
            System.out.println(i * 2);
        } else {
            System.out.println("Вы ввели не целое число");
        }

        System.out.print("Введите string1 string2: ");
        String s1, s2;
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        System.out.println(s1 + s2);

//        Существует и метод hasNext(), проверяющий остались ли впотоке ввода
//        какие-то символы.



        System.out.print("Введите числа для массива: ");
        int[] c = new int[10];
        int u = 0;
        for (int i = 0; i < 10; i++) {
            if (sc.hasNextInt()) {
                u++;
                c[i] = sc.nextInt();
            }
        }


        System.out.print("сумма: ");
        int sum=0;
        for (int i = 0; i < u; i++) {
            sum+=c[i];
        }
        System.out.println(sum+sum/u);

        int i=0;
        int mx=-9999999;
        int mn=99999;
        do{
        i++;
        if(c[i]>mx){mx=c[i];}
        if(c[i]<mn){mn=c[i];}

        } while (i<u);
        System.out.println("max: "+mx+"; min: "+mn);


        System.out.println();

        System.out.println("гармонический ряд:");
        for (double e=1.;e<=10;e++){
            System.out.print(1./e+" ");
        }



        System.out.println();
        System.out.println("Factorial ряд: ");
        int[] q=new int[10];
        q[0]=1;
        for (int y=1;y<10;y++){
            q[y]=y*q[y-1];
            System.out.print(q[y]+" ");
        }
    }
}
