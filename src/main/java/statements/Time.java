package statements;

public class Time {

    private int ora;
    private int perc;
    private int masodperc;

    public Time(int ora, int perc, int masodperc) {
        this.ora = ora;
        this.perc = perc;
        this.masodperc = masodperc;
    }

    public int getOra() {
        return ora;
    }

    public int getPerc() {
        return perc;
    }

       public int getMasodperc() {
        return masodperc;
    }


    public int getInMinutes () {
        return ora * 60 + perc;
    }

    public int getInSeconds () {
        return masodperc + (perc * 60) + (ora * 3600);
    }

public boolean earlierThan(Time other) {
        int elsoMp = this.getInSeconds();
        int masodikMp = other.getInSeconds();
        return elsoMp < masodikMp;
}

    public String toString () {
        return ora + ":" + perc + ":" + masodperc;
    }
}
