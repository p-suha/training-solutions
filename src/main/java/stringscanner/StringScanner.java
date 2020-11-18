package stringscanner;


import java.util.InputMismatchException;
import java.util.Scanner;

/*
public int readAndSumValues(String intString, String delimiter)
public int readAndSumValues(String intString)
public String filterLinesWithWordOccurrences(String text, String word)
 */

public class StringScanner {

    public int readAndSumValues(String intString, String delimiter) {
        try (Scanner scanner = new Scanner(intString)) {
            if (!isEmpty(delimiter)) {
                scanner.useDelimiter(delimiter);
            }
            return calculateWithScanner(scanner);
        }
    }

    public int readAndSumValues(String intString) {
        return readAndSumValues(intString, null);
    }

    public String filterLinesWithWordOccurrences(String text, String word) {
        if (word == null || word.equals("") || isEmpty(text)) {
            throw new IllegalArgumentException("Incorrect parameter string!");
        }
        try (Scanner scan = new Scanner(text)) {
            StringBuilder strbl = new StringBuilder();
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                if (line.contains(word)) {
                    strbl.append(line).append("\n");

                }
            }
            return strbl.toString().trim();
        }

    }

    private int calculateWithScanner(Scanner scan) {

        int sum = 0;

        try {

            while (scan.hasNext()) {
                sum += scan.nextInt();
            }

        } catch (InputMismatchException ex) {
            throw new IllegalArgumentException("Incorrect parameter string!", ex);
        }

        return sum;
    }


    private boolean isEmpty(String str) {
        return str == null || "".equals(str.trim());
    }


}

