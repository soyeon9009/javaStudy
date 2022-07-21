//문제1번
// 학생이름과 조 번호를 갖고 있는 class(student)



package soyeon_Java.APIEx;

import java.util.Objects;

public class Student {
    //필드
    //public : 모두 다 접근 가능
    //private : 접근제한자 : 같은 클래스 내에서만 접근 가능
    //default: 같은 패키지 내에서 접근 가능
    //protected : 같은 패키지 + 상속 내에서 접근 가능
    private String name;
    private int groupNum;

    //오버로딩(클래스의 스타일) : 생성자의 매개변수를 통해 다양한 타입으로 생성
    //기본적으로 생성자(매개변수 없는) 1개는 있다.(안보일때에도 생성되어있음)
    public Student(String i_name, int i_groupNum) {
        //this : 제일 가까운 객체를 지칭 > Student라는 클래스

        this.name = i_name;
        this.groupNum = i_groupNum;
    }

    //    getter, setter 쓰는 이유: 객체의 캡슐화, 데이터 입력이라는 기능의 메서드를 잘 쓰기 위해서.
    //외부에서 필드값을 바로 조회 또는 수정을 막기 위해서! 객체는 딱 닫혀야 한다.
    //public- 빠르게 필드값을 조회하기 위해 사용하고. 그 외에는 보통 private를 사용하여 getter, setter를 사용한다.
    public String getName() {
        return name;
    }

    public int getGroupNum() {
        return groupNum;
    }

    public void setName(String i_name) {
        this.name = i_name;
    }

    public void setGroupNum(int i_groupNum) {
        this.groupNum = i_groupNum;
    }
    //Student 인스턴스 타입으로 아래 equals라는 메서드의 매개변수로 들어감 (단, Objectfh "타입" 형변환)

    @Override
    public boolean equals(Object obj) {
        //instanceod : 메모리 heap에 있는 인스턴스끼리 비교하는 것
        //상속받았다면 부모클래스도 동일하다가 true가 나온다.
        if (obj instanceof Student) {
            Student student = (Student) obj;
            if (groupNum == student.getGroupNum()) {
                System.out.println("조: " +getGroupNum() +" 조원 이름: " + student.getName() +", "+ this.name);
            }else if(Objects.equals(name, student.getName())) {

                System.out.println("조 다른 사람");
                System.out.println("조: " + this.groupNum+ " 이름: " + name );
                System.out.println("조: " + student.getGroupNum() + " 이름: " + student.getName() );

            }

        }

        return false;
    }
}
