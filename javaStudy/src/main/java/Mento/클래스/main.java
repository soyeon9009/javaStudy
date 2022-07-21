package Mento.클래스;

import soyeon_Java.예외처리.A;

public class main {
    public static void main(String[] args) {
        Member m = new Member();
        m.login("hong", "12345");
        m.logout("hong");
        System.out.println("--------------------------------------------");
        m.login("qqq", "123");

        System.out.println("==============16번=================================");
        printer p = new printer();
        p.println(10);
        p.println(true);
        p.println(5.7);
        p.println("백소연");
        System.out.println("=============18번===================================");

        shopService a = shopService.getInstance();
        shopService b = shopService.getInstance();

        if(a==b){
            System.out.println("같은 객체");
        }else{
            System.out.println("다른 객체");
        }

        System.out.println("============19번===================================");
        Account acc = new Account();
        acc.setBalance(1000);
        System.out.println("현재 잔고: " + acc.getBalance());

        acc.setBalance(-100);
        System.out.println("현재 잔고: " +acc.getBalance());

        acc.setBalance(2000000);
        System.out.println("현재잔고: "+acc.getBalance());

        acc.setBalance(30000);
        System.out.println("현재잔고 : "+acc.getBalance());






    }
}