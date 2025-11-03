package pack1;

import java.util.Scanner;
import java.util.*;

public class Poker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите количество игроков: ");
        int n = sc.nextInt();

        if (n < 1 || n > 10) {
            System.out.println("Некорректное количество игроков (1-10)");
            return;
        }

        String[] suits = {"Пик", "Червей", "Бубен", "Треф"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};

        List<String> deck = new ArrayList<>();
        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + " " + suit);
            }
        }

        Collections.shuffle(deck);

        for (int i = 0; i < n; i++) {
            System.out.println("\n\nИгрок " + (i + 1) + ":");
            for (int j = 0; j < 5; j++) {
                System.out.println(deck.get(i * 5 + j));
            }
            System.out.println();
        }
    }
}
