package Mento.참조타입;

public class 문제8번 {
    //합, 평균 구하기

    public static void main(String[] args){
        int[][] array = {
                {95,86},
                {83,92,96},
                {78,83,93,87,88}
        };

        double sum = 0;
        double avg = 0;
        int a = 0;
        int b = 0;


        for(int i = 0; i<array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
                a = array[i].length;
            }
                 b += a;
        }
            avg = sum / b;

//         int count = 0;
//        for(int[] arr : array){
//            for(int a : arr){
//                sum += a;
//                count++;
//            }
//        }
//        avg = (double) sum/count;
//
//




        System.out.println("sum : " + sum);
        System.out.println("avg : " + avg);
    }

}
