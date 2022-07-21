package soyeon_Java.channelQ.ques3;



public class channelChange extends user {
    int channel_now =3;

    public void channelChange(int input) {
        System.out.println("현재 채널은 : " + channel_now + "번 입니다.");

        if(channel_now == input){
            System.out.println("선호채널 입니다.");
        }else if(channel_now != input){
            System.out.println("선호채널로 이동합니다");
            this.channel_now = input;
        }
        System.out.println("현재 채널은:" + channel_now + "입니다");


    }
}
