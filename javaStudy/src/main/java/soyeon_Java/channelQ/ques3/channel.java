package soyeon_Java.channelQ.ques3;

import java.util.ArrayList;
import java.util.Scanner;

public interface channel {
    ArrayList<Integer> input_Channel = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    static ArrayList inputChannel() {
        while (true) {
            System.out.println("---채널을 입력하세요:   " + "0번 TV끄기---");
            int input = scan.nextInt();
            input_Channel.add(input);
            if (input == 0) {
                break;
            }
        }
        System.out.println(input_Channel);
        return input_Channel;
    }
}
