package soyeon_Java.game;
import soyeon_Java.game.Slime;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("슬라임 만남");
        Slime redSlime = new Slime(10, 10, 5);
        Slime blueSlime = new Slime(10, 10, 5);
        Slime yellowSlime = new Slime(10, 10, 5);
        Slime greenslime = new Slime(10, 10, 5);

        System.out.println("슬라임을 선택하시오.");
        System.out.println("1.레드 2.블루 3.노랑 4.초록 5.나가기");
    }
}