package soyeon_Java.channelQ.ques3;

import java.util.ArrayList;

public  interface prefer extends channel {


         static int setChannel(ArrayList<Integer> input) {
             int answer =0;
             int[] index = new int[input.size()+1];
             int max = Integer.MIN_VALUE;

             for(int i : index){
                 index[input.get(i)]++;
             }
             for (int i=0; i<index.length; i++){
                 if(index[i]>max){
                     max =index[i];
                     answer=i;
                 }
            }
            System.out.println("---선호채널: " + answer+"번 ---");

             return answer;

        }


}
