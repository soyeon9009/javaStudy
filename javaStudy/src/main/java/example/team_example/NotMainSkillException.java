package example.team_example;

public class NotMainSkillException extends Exception {

    public NotMainSkillException() { 
		System.out.println("주종목이 아닙니다.");
	}
    
	public NotMainSkillException(String message) {
		super(message + "는 주종목이 아닙니다.");
	}
}
