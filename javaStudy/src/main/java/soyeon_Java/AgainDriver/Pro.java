package soyeon_Java.AgainDriver;

public class Pro implements Driver {
    int speed = 100;
    String name = "전문가";

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
