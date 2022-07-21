package soyeon_Java.channelQ.ques3;

import java.util.Scanner;

public class login  {

    public String[] ID = {"박준석", "김준석", "이준석"};

  public void try_login() {
        Scanner scan = new Scanner(System.in);


        while(true){
            System.out.println("아이디와 비밀번호를 입력해주세요");
            String id = scan.next();
            int pwd = scan.nextInt();

            if(id.equals(ID[0]) && pwd ==(1234) ){
            System.out.println("---박준석님 로그인 되었습니다---");
            break;
            }else if (id.equals(ID[1]) && pwd ==(12345) ) {
            System.out.println("---김준석님 로그인 되었습니다---");
            break;
            } else if (id.equals(ID[2]) && pwd ==(123456)) {
            System.out.println("---이준석님 로그인 되었습니다.---");
            break;
            } else{
            System.out.println("---다시 입력해주세요.---");
            }
        }



    }
        public void logout(){
            System.out.println("로그아웃 하였습니다.");
        }


}
