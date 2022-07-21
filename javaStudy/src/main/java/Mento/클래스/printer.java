package Mento.클래스;

public class printer {
    int num;
    boolean bool;
    double doub;
    String string;
    public void println(int num){
        System.out.println(num);
    }
    public void println(boolean bool){
        System.out.println(bool);
    }

    public void println(double doub){
        System.out.println(doub);
    }
//    public void println(Object value){
//        System.out.println(value);
//    } //이거 한개로 모두 ㄷㅏ가능
    //int 등 자료형 인데 클래스가 아닌데 어떻게 가능한가?
    //int float  등등 Integer 라는 wrapper타입의 클래스로 변환했기 때문에

    public void println(String string){
        System.out.println(string);
    }

}

