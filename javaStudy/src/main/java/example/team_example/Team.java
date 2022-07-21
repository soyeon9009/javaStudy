package example.team_example;

public class Team {

    public static void main(String[] args) {

        WorkPart frontend = new WorkPart("frontend", 2);
        WorkPart backend = new WorkPart("backend", 2);
        WorkPart db = new WorkPart("database", 1);
        WorkPart pm = new WorkPart("projectManager", 1);

        Member 조인국 = new Member("조인국", pm.getCategory());
        Member 김종기 = new Member("김종기", backend.getCategory());
        Member 정경섭 = new Member("정경섭", frontend.getCategory());
        Member 양호열 = new Member("양호열", db.getCategory());
        Member 김예진 = new Member("김예진", frontend.getCategory());

        조인국.apply(pm);
        김종기.apply(backend);
        정경섭.apply(frontend);
        양호열.apply(db);
        김예진.apply(frontend);

        System.out.println("-----------------------------------------");
        
        Member 김준석 = new Member("김준석", pm.getCategory());

        김준석.apply(frontend);
        김준석.apply(pm);

    }
}