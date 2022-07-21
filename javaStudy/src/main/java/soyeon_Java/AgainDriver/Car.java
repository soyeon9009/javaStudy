package soyeon_Java.AgainDriver;

public interface Car {

    Beginner bb = new Beginner();
    Master ma = new Master();
    Pro pp = new Pro();


    static void changeSpeed(Driver driver){
        if(driver instanceof Beginner){
            bb.info();
        }else if (driver instanceof Master){
            ma.info();
        } else if (driver instanceof Pro) {
            pp.info();
        }
    }







}
