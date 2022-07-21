package example.API_hash_deepclone.exam02_hashcode;
//key라는 클래스(껍데기, 설계도) (heap메모리에 올라가있지 않음)
public class Key {

	public int number;
	public int enc=2300;
	
	public Key(int number) {
		//this(제일 가까운 객체인 Key라는 class를 가르킴)
		//this.number >> Key라느 클래스의 number라는 필드값
		//=number >> 매개변수 number가 this.number에 할당 됨
		this.number = number;

	}
	//JVM Key클래스에 있는 equals라는 메서드가 Ovject에서 상속받은 메서드가 아닌
	//재정의 된 메서드인 것으로 인식할 수 있도록 @어노테이션 Override라서 선언
	//모든 객체(메서드)는 입구(통로)는 매개변수이기 떄문에
	//Object로 "지동형변환"(Object obj) >> 하면 모든 클래스의 부모는 Object이기 때문에 가능
	//모든 클래스를 매개변수로 받을 수 있으므로 자바(객체)의 다형성을 표현한다.
	//heapa메모리에 있는 인스턴스가 바뀌는것이 아님.
	//어디까지나 타입의 형변환
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			//compareKey는 obj의 Key타입 형변환 내용을 대입받는다.
			Key compareKey = (Key) obj;
			if(this.number == compareKey.number) {
				return true;
			}
		} 
		return false;
	}



	//hashcode() 메서드는 equals 매서드랑 동일하게 Object클래스(최상위클래스)
	
//	@Override
//	public int hashCode() {
//
//		return number;
//	}
}

