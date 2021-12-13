package f_regex;

import java.util.List;

public class RegularExpression {

    public static void main(String[] args) {
        List <String> words = List.of("Tjena", "hur", "står", "det", "till?");
        for (String word : words) {
            int wordStorage = word.replaceAll("(?i:[aeiouåäö])","").length();
            if (wordStorage > word.length() -2) {
                System.out.println(word);
            }
        }
    }
}
