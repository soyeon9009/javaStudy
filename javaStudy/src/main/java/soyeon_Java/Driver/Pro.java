package soyeon_Java.Driver;

public class Pro extends Master {

    public Pro() {
        super();

        name = "전문가";
        speed = 100;
    }

    @Override
    public void info() {
        System.out.println(name + "의 속도는 : " + speed + "km 입니다.");


    }


}