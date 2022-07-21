package soyeon_Java.game;

public class Fist {
    public String name = "주먹";
    public int AttRange = 1;
    public int ChangeTime = 3;
    public int attack;

    public Fist (){
        this.attack = 10;
      
    }

    public void attAction(){
        System.out.println(name +"장착");
        System.out.println("공격력 : " + attack);
        System.out.println(AttRange+"마리 공격");
        System.out.println("무기 교체턴:"+ChangeTime);
    }

    public void attweapon(){

    }
    
    public static void Change(){
        System.out.println("무기 변경");
    }


    
    
}
