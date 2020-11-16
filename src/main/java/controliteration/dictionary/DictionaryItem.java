package controliteration.dictionary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DictionaryItem {

    private String word;

    private List<String> translations = new ArrayList<>();

    //konstruktor

    public DictionaryItem(String word, List<String> translations) {
        this.word = word;
        addTranslations(translations);
    }

    public List<String> addTranslations(List<String> translationWords) {

        for(String trword:translationWords) {

            if(!translations.contains(trword)) {
                translations.add(trword);
            }
        }
        return translationWords;
    }

    public String getWord() {
        return word;
    }

    public List<String> getTranslations() {
        return translations;
    }


}
