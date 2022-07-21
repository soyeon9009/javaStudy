package example.team_example;

public class Member {
    
    private String name;
    private String mainSkill;
    
    public Member(String name, String mainSkill) {
        this.name = name;
        this.mainSkill = mainSkill;
    }

    public String getName() {
        return this.name;
    }

    public String getMainSkill() {
        return this.mainSkill;
    }

    public void apply(Apply workPart) {

        final String category = ((WorkPart) workPart).getCategory();

        try {
            workPart.apply(this.mainSkill, this.name);
            System.out.println(this.name + "님, " + category + " 지원에 성공했습니다.");
        } catch (NotMainSkillException e) {
            System.out.println(this.name + "님의 주종목은 " + category + "가 아닙니다.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(this.name + "님, " + category + " 종목에 남은 자리가 없습니다.");
        }
    }
}
