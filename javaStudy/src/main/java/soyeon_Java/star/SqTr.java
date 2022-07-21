package soyeon_Java.star;

public class SqTr {
    
    public static void main(String[] args){
    
    String[][] arr =new String[30][60];
    for(int i=0; i<30; i++){
        for(int j=0; j<60; j++){
            arr[i][j] = "*";
        }
    }
    int k=0;
    for (int i = 10; i <20; i++) {
        for (int j = 15-k; j<i+6; j++) {
            arr[i][j]="@";
        } k++;
     } 

     int x=0;
     for (int i = 10; i <20; i++) {
         for (int j = 45-x; j<i+36; j++) {
             arr[i][j]="@";
         } x++;
      }

    int z=0;
    for (int i = 29; i >=21; i--) {
        for (int j=30-(2*z); j<=30+(2*z); j++) {
            arr[i][j]="#";
        } z++;
     } 

     for(int i=0; i<30; i++){
        for(int j=0; j<60; j++){
            System.out.print(arr[i][j]);
        }
        System.out.println();
     }

}

}
