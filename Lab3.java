import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/*
C3 = 0 - StringBuilder
C17 = 7 - Відсортувати слова заданого тексту, що починаються з голосних літер, за другою літерою.
 */
public class Lab3 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("How can music manipulate our lives?\n" +
                "People listen to music every day. You do not have to use earphones or go to a concert, " +
                "you can hear it wherever. Have you ever considered the effects of listening to music? Is music able " +
                "to change your opinion?\nTo start with, if someone listens to sad or cheerful music, they will " +
                "believe that other people will be upset or happy. For example, I am sure that you have imagined yourself " +
                "in a music video playing a role and everything around comes across as elements of decoration. So firstly, " +
                "music affects our mood and creativity.\nAdditionally, music is a marketing tool. Successfully matched music " +
                "in an advertisement increases the probability of the consumer choosing the product. The main purpose of " +
                "music in the sales hall is to create a comfortable atmosphere, mood, and maximum positioning for the " +
                "product. For instance, Nike uses sounds similar to different kinds of sports in different parts of the store.\n" +
                "To sum up, music like other feelings can control your mind. Is it okay or not? I do not have an answer. " +
                "Everybody should use music to achieve their own goals.");
        String[] words = str.toString().split("\\W+");
        String vowels = "aAoOiIeEuUyY";
        char[] vowelsArray = vowels.toCharArray();
        ArrayList<String> vowelWords = new ArrayList<String>();
        for (int i = 0; i < words.length; i++){
            char[] letters = words[i].toCharArray();
            for (int j = 0; j < vowelsArray.length; j++){
                if (letters[0] == vowelsArray[j]){
                    if (letters.length == 1){
                        vowelWords.add(words[i]+" ");
                        break;
                    }
                    vowelWords.add(words[i]);
                }
            }
        }
        Collections.sort(vowelWords, new Sortby2el());
        String stringResult = String.join(", ", vowelWords);
        StringBuilder result = new StringBuilder(stringResult);
        System.out.println(result);

    }
}

class Sortby2el implements Comparator<String>
{
    public int compare(String a, String b)
    {
       return  Character.compare(a.charAt(1), b.charAt(1));
    }
}