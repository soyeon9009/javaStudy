package soyeon_Java.AgainDriver;

public class Carmain {
    public static void main(String args[]){
        route a = new route();
        String[] loca = {"천안","천안 톨게이트","고속도로","서울 톨게이트","서울"};

        aa(a,loca);




    }

    private static void aa(route a, String[] loca){
        for(String index : loca){
            System.out.println("현재 위치 : " + index );
            a.goTrip(index);
            System.out.println("----------------------------");
        }
    }
}
