package soyeon_Java.channelQ.ques3;

public class main {
    public static void main(String[] args){
        login aa = new login();
        user us = new user();
        channelChange cc = new channelChange();

        while (true) {
            aa.try_login();
            int answer = us.user();
            cc.channelChange(answer);
            aa.logout();
        }













    }
}
