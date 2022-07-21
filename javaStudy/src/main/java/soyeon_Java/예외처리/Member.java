package soyeon_Java.예외처리;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Member {
    Map<String,String> member = new HashMap<>();{
        member.put("A", "프론트");
        member.put("B", "프론트");
        member.put("c", "백엔드");
        member.put("d", "백엔드");
        member.put("e", "데이터베이스");
        member.put("f", "프로젝트매니저");
    }

    String[] front = new String[2];
    String[] backend = new String[2];
    String[] data = new String[1];
    String[] project = new String[1];

    Random random = new Random();





}
