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

    public void addSkills(String... skill) {

        int level;
        for (String sk : skill) {
            name = sk.substring(0, sk.lastIndexOf(" "));
            level = Integer.parseInt(sk.substring(sk.lastIndexOf("(") + 1, sk.indexOf(")")));
            skillList.add(new Skill(name, level));
        }
    }

    public List<Skill> getSkills() {
        return skillList;
    }

    public int findSkillLevelByName(String skillName) {
        for (Skill skill : skillList) {
            if (skillName.equals(skill.getName())) {
                return skill.getLevel();
            }
        }
        return 333;
    }

    public static void main(String[] args) {
        Cv cv = new Cv("John Doe");
        cv.addSkills("programming (5)", "oo design (2)", "english (4)");

        System.out.println(cv.findSkillLevelByName("oo design"));
    }
}
