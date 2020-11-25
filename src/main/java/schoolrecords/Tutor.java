package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Tutor {

    private String name;
    private List<Subject> taughtSubjects = new ArrayList<>();

    public Tutor(String name, List<Subject> taughtSubjects) {
        this.name = name;
        this.taughtSubjects = taughtSubjects;
    }

    public String getName() {
        return name;
    }

    public boolean tutorTeachingSubject(Subject tantargyTanitjaE) {
        boolean is = false;

        for (Subject item : taughtSubjects) {

            if (item.getSubjectName().equals(tantargyTanitjaE.getSubjectName())) {
                is = true;
            }

        }
        return is;
    }
}
