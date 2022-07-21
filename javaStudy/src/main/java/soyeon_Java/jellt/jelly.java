package soyeon_Java.jellt;

import java.util.Scanner;

public interface jelly extends choice {

        static String mango = "mango";
        static String grape = "grape";
        static String strawberry = "strawberry";
        Scanner scan = new Scanner(System.in);


        default void pick() {
            System.out.println("1. 망고 , 2.포도 3.딸기" );
            int input = scan.nextInt();
            switch (input){
                case 1:
                    System.out.println(mango+"를 선택하였습니다.");
                    break;

                case 2:
                    System.out.println(grape+"를 선택하였습니다");
                    break;

                case 3:
                    System.out.println(strawberry + "를 선택하였습니다");
                    break;

                default:
                    System.out.println("잘못입력하였습니다.");

            }

        }
    }
