package soyeon_Java.AgainDriver;

public  class route implements Car{




    public void goTrip(String loca){
        if(loca.equals("고속도로")){
            System.out.println("운전자 변경");
            pp.info();
        }else{
            System.out.println("운전자 변경없음");
            bb.info();
        }
    }
}
