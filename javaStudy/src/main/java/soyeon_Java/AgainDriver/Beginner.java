package soyeon_Java.AgainDriver;

public class Beginner implements Driver {
    int speed = 30;
    String name = "초보자";




    public void info(){
        driver();
        speed();
    }
    public void driver(){
        System.out.println("운전자: " + this.name);

    }
    @Override
    public void speed() {
        System.out.println("속도 : " + this.speed );
    }

}
