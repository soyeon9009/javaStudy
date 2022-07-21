package Mento.참조타입;

public class 문제7번 {
    public static void main(String[] args){
        int max = 0;
        int[] array = {1,5,3,8,2};

        for(int i=0; i< array.length; i++){
            if(array[i] > max){
                max = array[i];
            }

        }
        System.out.println(max);

    }
}

    //향상된 for문
// for (int j : array) {
//         if (j > max) {
//         max = j;
//         }


