package staticattrmeth.bank;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BankTransaction {

    private long trxValue;
    private static long MIN_TRX_VALUE = 1;
    private static long MAX_TRX_VALUE = 10_000_000;
    private static long currentMinValue = MIN_TRX_VALUE;
    private static long currentMaxValue = MAX_TRX_VALUE;
    private static int trxsCounter = 0;
    private static BigDecimal sumOfTrxs = new BigDecimal("0");

    public BankTransaction(long trxValue) {

        if (trxValue >= MIN_TRX_VALUE && trxValue >= MAX_TRX_VALUE) {
            throw new IllegalArgumentException("This transaction cannot be excepted! " + trxValue);
        }

        trxsCounter++;
        sumOfTrxs = sumOfTrxs.add(new BigDecimal((Long.toString(trxValue))));

        if (trxValue < currentMinValue) currentMinValue = trxValue;
        if (trxValue > currentMaxValue) currentMaxValue = trxValue;

        this.trxValue = trxValue;
    }

    public static BigDecimal getSumOfTrxs() {

        return sumOfTrxs;

    }

    public static void initTheDay() {

        currentMinValue = MAX_TRX_VALUE;
        currentMaxValue = MIN_TRX_VALUE;

        trxsCounter = 0;
        sumOfTrxs = new BigDecimal("0");
    }

    public long getTrxValue() {
        return trxValue;
    }

    public static long getCurrentMinValue() {
        return trxsCounter == 0 ? 0 : currentMinValue;
    }

    public static long getCurrentMaxValue() {
        return trxsCounter == 0 ? 0 : currentMaxValue;
    }

    public static BigDecimal averageOfTransaction() {
        return trxsCounter == 0 ? new BigDecimal("0") : sumOfTrxs.divide(new BigDecimal(Long.toString(trxsCounter)), 0, RoundingMode.HALF_UP);
    }
}
