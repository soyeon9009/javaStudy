package soyeon_Java.jellt;

import java.util.Scanner;

public interface snack extends choice{
    String potatochips = "포카칩";
    String chips = "자가비";
    String potato = "포테이토칩";
    Scanner scan = new Scanner(System.in);

    default void pick() {
        System.out.println("1. 포카칩 , 2.자가비 3.포테이토칩");
        int input = scan.nextInt();
        switch (input) {
            case 1:
                System.out.println(potatochips + "를 선택하였습니다.");
                break;

            case 2:
                System.out.println(chips + "를 선택하였습니다");
                break;

            case 3:
                System.out.println(potato + "를 선택하였습니다");
                break;

            default:
                System.out.println("잘못입력하였습니다.");

        }
    }
}
