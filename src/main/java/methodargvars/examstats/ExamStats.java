package methodargvars.examstats;

public class ExamStats {

    private int maxPoints;

    public ExamStats(int maxPoints) {
        this.maxPoints = maxPoints;
    }

    public int getNumberOfTopGrades(int limitInPercent, int... results) {
        if (results == null || results.length == 0) {
            throw new IllegalArgumentException("Number of results must not be empty!");
        }
        int count = 0;
        for (int res : results) {

            if (res > maxPoints * (limitInPercent / 100.0)) {
                count++;
            }
        }
        return count;
    }

    public boolean hasAnyFailed(int limitInPercent, int... results) {

        if (results == null || results.length == 0) {
            throw new IllegalArgumentException("Number of results must not be empty!");
        }

        for (int res : results) {

            if (res <= maxPoints * (limitInPercent / 100.0)) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        ExamStats exst = new ExamStats(100);

        System.out.println(exst.getNumberOfTopGrades(50, 100, 76, 51, 10, 50, 30, 10));
        System.out.println(exst.hasAnyFailed(50, 100, 76, 51, 50));
    }


}
