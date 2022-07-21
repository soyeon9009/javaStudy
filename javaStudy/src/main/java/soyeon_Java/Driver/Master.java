package soyeon_Java.Driver;

public class Master extends Beginner {

    Master() {
       name = "숙련자";
       speed = 60;
    }

    public void setName(String name){
        this.name = name;
    }
       @Override
    public void info(){
        System.out.println(name +"의 속도는 : "+ speed +"km 입니다.");

    }
}
