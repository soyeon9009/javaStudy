package Mento.참조타입;

import java.util.ArrayList;
import java.util.Scanner;

public class 문제9번{

        public static void main(String[] args){
            boolean run = true;
            int studentNum =0;
//        int score = null;
            ArrayList<Integer> score = new ArrayList();
            Scanner scanner = new Scanner(System.in);

            while(run){
                System.out.println("---------------------------------");
                System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4. 분석 | 5.종료");
                System.out.println("---------------------------------");
                System.out.print("선택>");

                int selectNo = scanner.nextInt();

                if(selectNo == 1 ){
                    System.out.print("학생수>");
                    studentNum = scanner.nextInt();

                } else if (selectNo ==2) {
                    System.out.println("점수 입력");
                    for(int i = 0; i<studentNum; i++){
                        score.add(i);
                        score.set(i, scanner.nextInt()); //score[i] = scanner.nextINt();

                    }

                } else if (selectNo == 3) {
                    for(int a : score){
                        System.out.println("시험 점수: " + a);
                    }
                } else if (selectNo==4) {
                    int sum = 0;
                    int avg = 0;
                    int max = 0;
                    for(int i=0; i< score.size(); i++){
                        if(score.get(i) > max){
                            max = score.get(i);
                        }
                        sum += score.get(i);
                    } avg = sum / score.size();
                    System.out.println("최고 점수 : " + max );
                    System.out.println("평균점수 : " + avg);

                } else if (selectNo==5) {
                    run = false;
                }
            }
            System.out.println("프로그램 종료");
        }
    }

