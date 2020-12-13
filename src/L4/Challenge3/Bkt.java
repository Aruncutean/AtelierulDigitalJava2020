package L4.Challenge3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Bkt {

    private String word;
    private List<String> words;
    private int[] sol;

    public Bkt(String word) {
        this.word = word;
        if (sol == null) {
            sol = new int[word.length()];
        }
        if (words == null) {
            words = new ArrayList<>();
        }
        bkt(0);
    }


    private void bkt(int poz) {

        if (poz == word.length()) {
            String wordG = new String();
            for (int i = 0; i < sol.length; i++) {
                wordG += word.charAt(sol[i]);
            }

            words.add(wordG);

        } else {
            for (int i = 0; i < word.length(); i++) {
                sol[poz] = i;
                if (isTrue(poz, i)) {
                    bkt(poz + 1);
                }
            }
        }

    }

    private boolean isTrue(int poz, int k) {
        for (int i = 0; i < poz; i++) {
            if (sol[i] == k) {
                return false;
            }
        }
        return true;
    }


    public List<String> getWords() {
        return words;
    }
}
