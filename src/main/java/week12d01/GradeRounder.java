package week12d01;

public class GradeRounder {


    public int[] roundGrades(int[] grades) {
        for (int i = 0; i < grades.length; i++) {

            int divisor = grades[i] / 5;
            int next = (divisor + 1) * 5;
            if (next - grades[i] < 3) {
                grades[i] = next;
            }
        }
        return grades;
    }
}
