package week15d04;

import collectionsautoboxing.IntegerOperations;

public class CovidCases implements Comparable<CovidCases> {

    private int cases;
    private String week;
    private String country;

    public CovidCases(int cases, String week) {
        this.cases = cases;
        this.week = week;
        this.country = country;
    }

    public int getCases() {
        return cases;
    }

    public String getWeek() {
        return week;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "CovidCases{" +
                "cases=" + cases +
                ", week='" + week + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    @Override
    public int compareTo(CovidCases o) {
        return Integer.valueOf(this.cases).compareTo(o.cases);
    }
}
