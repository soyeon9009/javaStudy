package example.익명함수;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		//1.필드값으로 익명객체 사용
		anony.field.wake();
		anony.wayToWork_1.run();

		//2.메소드(지역변수)로 익먕객체 사용
		System.out.println("----anony.method1();----");
		anony.method1();
		//매개변수로 익명객체 시용
		System.out.println("----anony.method1();----");
		anony.method2(
			new Person() {
				void study() {
					System.out.println("공부합니다");
				}
				@Override
				void wake() {
					System.out.println("11시에 일어났습니다.");
					study();
				}
			}
		);
	}
}



//익명객체
//메서드실행에 필요한 데이터