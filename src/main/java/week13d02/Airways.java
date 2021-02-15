package week13d02;

import java.time.LocalTime;

public class Airways {

    private String jaratId;
    private String irany;
    private String varos;
    private LocalTime time;


    public Airways(String jaratId, String irany, String varos, LocalTime time) {
        this.jaratId = jaratId;
        this.irany = irany;
        this.varos = varos;
        this.time = time;
    }

    public String getJaratId() {
        return jaratId;
    }
    public String getIrany() {
        return irany;
    }

    public String getVaros() {
        return varos;
    }

    public LocalTime getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Airways{" +
                "jaratId='" + jaratId + '\'' +
                ", irany='" + irany + '\'' +
                ", varos='" + varos + '\'' +
                ", time=" + time +
                '}';
    }
}
