package soyeon_Java.AgainDriver;

public interface Driver{

  void driver();
  default void speed(){
    System.out.println("speed");
  }


}
