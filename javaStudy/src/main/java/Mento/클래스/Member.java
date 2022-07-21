package Mento.클래스;

import java.util.Objects;

public class Member {
    String name;
    String id ;
    String pswd;
    int age ;

    public Member(){}
    public Member(String name , String id){
        this.name = name;
        this.id = id;
    }

    public boolean login(String id, String pswd){
        System.out.println("아이디를 입력하세요 : " +id);
        System.out.println("비밀번호를 입력하세요 : " + pswd);

        if(Objects.equals(id, "hong") && Objects.equals(pswd, "12345")){
            System.out.println("로그인 되었습니다.");
            return true;
        }
        else {
            System.out.println("id또는 password가 올바르지 않습니다.");
            return false;
        }
    }

    public void logout(String id){
        System.out.println(id+ "님이 로그아웃 되었습니다.");
    }
}
