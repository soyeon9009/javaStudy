package soyeon_Java.jellt;

import java.util.Scanner;

public class people implements jelly,snack,choice{

    private String name = "사람";
    Scanner scan = new Scanner(System.in);



    public void choose() {
        System.out.println("선택 : 1.과자 2.젤리");
        int input = scan.nextInt();
        switch (input){
            case 1:
                System.out.println("과자를 선택하였습니다");
                pick();
                break;

            case 2:
                System.out.println("젤리를 선택하였습니다");
                pick();
                break;

            default:
                System.out.println("잘못입력하였습니다");
        }
    }


    public void eat() {
        System.out.println(this.name+"은 먹는다");
    }

    @Override
    public void pick() {
        jelly.super.pick();
    }
}
