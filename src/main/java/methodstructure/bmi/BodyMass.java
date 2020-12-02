package methodstructure.bmi;

public class BodyMass {

    private double weight;
    private double height;

    public BodyMass(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public double bodyMassIndex() {

        return getWeight() / (getHeight() * getHeight());
    }

    //// A BmiCategory metódusnak nincs paramétere. Én mindenáron akartam neki adni, de nem is tudom miért...
    //// Az előző bodyMassIndex-nél pl. nem volt ilyen gondolatom.
    /// A bodyMassIndex metódus
    //// az min fut le? Melyik objektum indexét számolja ki? A problémát számomra az okozza, hogy ilyen esetekben
    //// mindig meg akarom mondani, hogy
    //// a:) public BmiCategory body(valami paraméter, hogy ezen dolgozz) {};
    ////  vagy
    //// b:) a metódus törzsében  "valami.BodyMassIndex" - formákat akarok használni.
    //
    // Nem tudom felfogni, hogy itt eljárást készítek, ami olyan
    //// "valamin" jár el, ami nemtom, h hol van és kicsoda-micsoda...

    public BmiCategory body() {

        if (bodyMassIndex() < 18.5) {
            return BmiCategory.UNDERWEIGHT;
        } else if (bodyMassIndex() > 25) {
            return BmiCategory.OVERWEIGHT;
        }
        return BmiCategory.NORMAL;
    }


    public boolean isThinnerThan(BodyMass param) {

        return bodyMassIndex() < param.bodyMassIndex();
    }
}
