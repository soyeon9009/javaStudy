package soyeon_Java.channelQ.ques1;

public class SamrtTv implements Searchable {

    private int chNum;

    public void change(int chNum){
        if(chNum<Searchable.ch1 || chNum<15){
            this.chNum = Searchable.ch1;
        }else if(chNum>=15 || chNum<22){
            this.chNum = Searchable.ch2;
        }else if(chNum>=23 || chNum<=50){
            this.chNum = Searchable.ch3;
        }else{
            this.chNum = Searchable.ch4;
        }
        System.out.println("채널 번호 : " + this.chNum);

    }
}

    

