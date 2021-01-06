package exam02.cv;

import java.util.ArrayList;
import java.util.List;

public class Cv {

    private String name;
    private List<Skill> skillList = new ArrayList<>();

    public Cv(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void addSkills(String... skills) {


    }

    public List<Skill> getSkills() {
        return skillList;
    }

    public int findSkillLevelByName(String skillName) {
        return 0;
    }
}
