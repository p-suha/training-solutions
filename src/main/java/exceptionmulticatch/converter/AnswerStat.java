package exceptionmulticatch.converter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static java.lang.Math.round;

public class AnswerStat {

    private static final Logger LOGGER = LoggerFactory.getLogger(AnswerStat.class);

    private BinaryStringConverter converter;

    public AnswerStat(BinaryStringConverter converter) {
        this.converter = converter;
    }

    public int answerTruePercent(String answers) {

        boolean[] booleans = convert(answers);

        int trues = 0;
        for (int i = 0; i < booleans.length; i++) {
            if (booleans[i]) {
                trues++;
            }
        }
        return (int) Math.round((double) trues / booleans.length * 100);
    }

    public boolean[] convert(String checkboxes) {
        try {
            return converter.binaryStringToBooleanArray(checkboxes);
        } catch (NullPointerException | IllegalArgumentException ex) {
            LOGGER.error(ex.getMessage(), ex);
            throw new InvalidBinaryStringException(ex);
        }

    }

}
