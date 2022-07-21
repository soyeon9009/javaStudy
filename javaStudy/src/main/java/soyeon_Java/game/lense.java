package soyeon_Java.game;

public class lense extends Fist {
    public String att ="던지기";
    
    public lense(){
        this.name = "창";
        this.AttRange = 1;
        this.ChangeTime = 5;
        this.attack = 20;
    }

    @Override
    public void attAction(){
        System.out.println(name +"장착");
        System.out.println(att + "공격력 :" + attack);
        System.out.println(AttRange+"마리 공격");
        System.out.println("무기 교체턴:"+ChangeTime);
    }
    
    public static void Change(){
        System.out.println("무기 변경");
        
    }

}
