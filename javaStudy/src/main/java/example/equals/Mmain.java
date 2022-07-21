package example.equals;

public class Mmain {
    //main 클래스는 프로그램이 시작할 때 처음 동작하는 메서드(객체 안에 무조건 메서드가 있고, 실행시킨다)
    //String[] 배열은 OS(위도우)에서 초기에 데이터를 받는 요구
    //public :  접근제한자로써 모두 다 접근 가능
    //static : 프로그램에서 딱 1개로 인스턴스로 못 만듦
    //void : return 값이 없어서 메서드가 실행되고 바로 끝
    public static void main(String[] args){

        //인스턴스 생성
        //선언부분 :(선언) Member 타입으로 obj1 변수명으로 선언
        //= : 대입연산자 (우측에 있는 인스턴스를 좌측에 있는 선언부분에 할당(연결))
        //new : 인스턴스 부분으로 실제로 메모리에 할당되는 값,
        // (실제)Member차입으로 실제로 구현(인자rkqt, string넣기)
        Member obj1 = new Member("blue");
        Member obj2 = new Member("blue");
        Member obj3 = new Member("red");
        //메모리에 obj라는 객체가 3개 할당(주소값)

        //재정의 된 equals 사용
        //equals 는 주소비교 객체비교
        if(obj1.equals(obj2)){  //o1, o2 객체를 비교 (단, 참조타입 ->equals메서드를 사용)
                                    //기본타입입 비교 == 사용
           System.out.println("o1,o2 같음");
        }else{
            System.out.println("o1, o2 다름");
        }
        if(obj1.equals(obj3)) {
            System.out.println("o1, o3 같음");
        }else {
            System.out.println("o1, o3 다름");
        }

        //obj3 라는 변수명(선언부분)에 obj의 실제값을 대임(주소 연결)
        //기준, obj3에 할당된 인슨턴스 대신에 obj2의 인스턴스가 연결 되어
        //원래 있던 obj3에 할당된 인스턴스는 연결 끊어짐 (가비지 컬렉터가 찾아서 회수)
        obj3 = obj2;
        if(obj2.equals(obj3)){  //같은 긴스턴스 주소를 가르키기 떄문에
                                // 인스턴스가 같다고 보고, if문의 True 값이 나옴옴
           System.out.println("o2, o3 같음");
        }else {
            System.out.println("o2, o3 다름");
        }

        System.out.println(obj2.id);
        System.out.println(obj3.id);

        System.out.println("프로그램이 정상적으로 실행됩니다");
    }
}
