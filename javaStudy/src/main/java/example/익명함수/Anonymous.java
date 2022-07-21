package example.익명함수;

public class Anonymous extends Person  {
	//필드로
	WayToWork wayToWork_1 = new WayToWork() {
		@Override
		public void run() {
			System.out.println("달립니다.");

		}

		@Override
		public void car() {
			System.out.println("차를 탑니다.");

		}
	};
	//필드 초기값으로 대입
	Person field = new Person() {
		int fieldInt;

		void work() {
			System.out.println("학생들을 가르치는 교사입니다.");
		}
		@Override
		void wake() {
			fieldInt = 40;
			System.out.println("_first_ 6�ÿ� �Ͼ�ϴ�.");
			work();
		}

	};
	
	void method1() {
		//로컬 변수값으로 대입
		Person localVar = new Person() {
			void walk() {
				System.out.println("��å�մϴ�.");
			}
			@Override
			void wake() {
				System.out.println("늦잠자서 10시에 일어납니다!");
				walk();
			}
		};

		WayToWork wayToWork_1 = new WayToWork() {
			@Override
			public void run() {
				System.out.println("메소드 달립니다.");
			}

			@Override
			public void car() {
				System.out.println("메소드 차를 탑니다.");

			}
		};
		//롴컬 변수로 사용
		localVar.wake();
	}
	
	void method2(Person person) {
		person.wake();
	}

	void method3(int inputInt) {
		//매게변수 (인자값 혹은 전역변수의 라이프사이클에 따라 살아있다.)

		//지역변수 (메소드의 라이프 사이클에 따라 변수가 활용(살아있다))

		int output;
		//익명객체의 라이프 사이클 Start
		Person localVar = new Person() {
			void walk() {
				System.out.println("��å�մϴ�.");
			}
			@Override
			void wake() {
				System.out.println("늦잠자서 10시에 일어납니다!");
				walk();
			}
		};
	}

}










