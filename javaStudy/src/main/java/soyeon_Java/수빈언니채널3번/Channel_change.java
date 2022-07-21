package soyeon_Java.수빈언니채널3번;

public interface Channel_change extends Favorite_ch {
    static void initial_ch(soyeon_Java.수빈언니채널3번.User_proto a) {
        System.out.println("기본 채널을 틉니다");
        a.current_channel = default_channel;
        System.out.println("현재 채널 : " + a.current_channel);
    }
    static void ch_change(soyeon_Java.수빈언니채널3번.User_proto a) {
        a.current_channel = Favorite_ch.ch_check(a);
        System.out.println("현재 채널 : " + a.current_channel);
    }
}
