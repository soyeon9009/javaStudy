package soyeon_Java.game;

public class Slime {
    public int hp;
    public int mp;
    public int att;
    
    public Slime(){}
    
    public Slime(int hp ,int mp, int att){
        this.hp=hp;
        this.mp=mp;
        this.att = att;
        
    }
    
    public void slimeInfo(){
        System.out.println("-------슬라임Info----------");
        System.out.println("HP: " + hp);
        System.out.println("MP: " +mp);
        System.out.println("공격력: " +att);
        System.out.println("--------------------------");
    }
    public void slimebirth(){
        System.out.println("슬라임 생성");
    }

    public void slimeatt(){
        System.out.println("슬라임"+att + "공격한다");
    }
    

    


}
