package example.API_hash_deepclone.exam02_hashcode;

import java.util.HashMap;

public class KEYEXAM {
    public static void main(String[] args) {
        //Key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap 객체 생성
        //HashMap이라는 타입으로 선언하되 안에 값은 Key라는 객체와 string문자열을 넣는다.
        //= new HashMap<Key, String> :heap 메모리 인스턴스 만들기
        //HashMap<String,String> key위치는 String, Value위치는 string
        //key(String)으로 검색해서 Value(String)을 받는다.(HashMap의 구조)
        //HashMap 특징 : Key값은 중복 안됨
        //Key값을 "김준석" , Value "오전수업"
        //Key값을 "김준석", Value "오후수업"
        //"김준석"을 검색하면 "오후수업"이 뜬다.
        HashMap<Key, String> hashMap = new HashMap<Key, String>();
        //Key라는 객체타입으로 testKey라는 변수명으로 타입 선언
        //= new Key(23); = heap메모리에 Key라는 인스턴스를 생성 (단, 인자값 23 넣음)
        //생성자(매개변수 23인) 실행
        Key testKey = new Key(23);
        Key testKey_2= new Key(23);
        Key testKey_3 = new Key(23);


        hashMap.put(testKey, "백소연");
        System.out.println(testKey.hashCode());
        System.out.println(hashMap.get(testKey));
        System.out.println(hashMap.get(testKey).hashCode());
        System.out.println(hashMap.hashCode());
        hashMap.put(testKey_2, "문정은");
        System.out.println(hashMap.get(testKey_2));
        System.out.println("_______________________________________");
        System.out.println(testKey_2.hashCode());
        System.out.println(testKey_3.hashCode());
        System.out.println("===============================================================");

        //HashMap에는 put(): HashMap레 데이터 넣기
        //String[] a; a[0] = "김준석"
        //a[0] = key
        //"김준석"="오준석"
        //key값은 중복 되지 않음
        hashMap.put(new Key(1), "홍길동");
        hashMap.put(testKey, "김준석");
        hashMap.put(testKey, "오준석");


        //식별키 "new Key(1)" 로 "홍길동"을 읽어옴
//		HashMap.get(): 인자값(Key)를 넣엇 key와 함꼐 넣은 value를 반환(출력)
        //HashMap.get(): 메서드의 비교방식
        //new Key(1)이라고 get()에 매개변수를 넣으면 새로운 인스턴스가 만들어진다.
        //홍길동의 heap값과 다르다고 인식(인스턴스가 다르고, 주소가 다르고, hashcode()도 다르기 때문에)
        //홍길동의 key와 다르다고 인식(hashcode()기반으로 구분 = HashMap의 자료저장 구조)
        String value = hashMap.get(new Key(1));
        String value1 = hashMap.get(testKey);
        System.out.println(value1);
        System.out.println(value);
        //"오준석"이라는 문자열의 부모 해시코드 메서드
        System.out.println(hashMap.get(testKey).hashCode());


        Object obj = new Object();
        Object obj_1 = new Object();
        System.out.println("========================================");
        System.out.println(obj);
        System.out.println(obj.hashCode());
        System.out.println(obj_1);
        System.out.println(obj_1.hashCode());

    }
}
