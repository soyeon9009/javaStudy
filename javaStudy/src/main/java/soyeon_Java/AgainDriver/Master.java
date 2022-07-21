package soyeon_Java.AgainDriver;

public class Master implements Driver {
    int speed = 60;
    String name = "숙련자";

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
