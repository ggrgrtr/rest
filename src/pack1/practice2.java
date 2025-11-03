package pack1;
import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        Class_ u=new Class_("Egor","KOKO@mail.ru",'m');
        System.out.println(u.toString());
        System.out.println();
        ball c=new ball(2.,3.);
        c.move(3.,4.);
        System.out.println(c.toString());
    }
}


