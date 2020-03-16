import java.util.ArrayList;
import java.util.List;

public class SentenceProcessor {
    public String removeDuplicatedWords(String sentence) {

        String[] words = sentence.split(":");
        String processedSentence = "";

        List<String> tempWords = new ArrayList<>();

        for (int i = 0; i <= words.length - 1; i++) {
            if (tempWords.contains(words[i])) {
                continue;
            } else {
                tempWords.add(words[i]);
            }
        }

        for (int i = 0; i <= tempWords.size() - 1; i++) {
            if (i == 0) {
                processedSentence += tempWords.get(i);
            } else {
                processedSentence += " " + tempWords.get(i);
            }
        }
        return processedSentence;
    }
}
