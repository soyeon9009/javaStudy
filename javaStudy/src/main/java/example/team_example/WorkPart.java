package example.team_example;

public class WorkPart implements Apply {

    private String category;
    private String[] names;
    private int pointer;

    public WorkPart(String category, int maxSize) {
        this.category = category;
        this.names = new String[maxSize];
    }

    public String getCategory() {
        return this.category;
    }

    @Override
    public void apply(String workPart, String name) throws NotMainSkillException {
        if(!this.category.equals(workPart)) throw new NotMainSkillException(workPart);
        else this.names[this.pointer++] = name;
    };
}
