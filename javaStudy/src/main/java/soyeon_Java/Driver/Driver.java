package soyeon_Java.Driver;

public abstract class Driver {
    String name;
    int speed;

    public String getName(){
        return name;
    }
   public void setName(String name){
        this.name = name;
   }

   public int getSpeed(){
        return speed;
   }

   public void setSpeed(int speed){
        this.speed = speed;
   }
    void info(){
        System.out.println("사용자 정보 입력");
    }


}
