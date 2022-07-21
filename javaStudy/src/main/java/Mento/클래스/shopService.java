package Mento.클래스;

public class shopService {
    private static shopService singletone = new shopService();

    private shopService(){
    } // 마구잡이로 생성을 막기 위해서 싱글톤은 한개
    //private로 만들었기 때문에 메인에서 만들 수 없ㄱㅣ 때문에 static을 붙여야 한다.
    public static shopService getInstance(){
        return singletone;

    }

}
