package pack1;

import java.util.Scanner;
import java.util.ArrayList;

public class HowMany {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int g=0;
        while(true){
            String inp = sc.nextLine();
            if (inp.isEmpty()) {
                break;
            }
            g++;

        }
        System.out.println(g);
    sc.close();
    }
}
