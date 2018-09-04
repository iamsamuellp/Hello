import java.util.*;

public class Java {
    public static void main(String[] args) {

        String strA = "first a short string";
        String strB = "Friends, Romans, countrymen, lend me your ears; I come to bury Caesar, not to praise him;";
        String strC = "this that and the other this does not make sense that does not either does this";

        int z = strA.compareTo(strB);
        System.out.println("z = " + z);
        if (strA.compareTo(strB) > 0) {
            System.out.println(strA);
        } else {
            System.out.println(strB);
        }
        if (strA.compareToIgnoreCase(strB) > 0) {
            System.out.println(strA);
        } else {
            System.out.println(strB);
        }
        System.out.println("find ears at position " + strB.indexOf("ears"));

        String[] words = strC.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);


        }
        Set<String> treeSet = new TreeSet<>();
        Set<String> hashSet = new LinkedHashSet<>();
        ArrayList<String> list = new ArrayList<>();
        for (String word : words){
            System.out.println(word);
            treeSet.add(word);
            hashSet.add(word);
            list.add(word);
        }
        System.out.println("treeSet =" + treeSet);
        System.out.println("hashSet ="+ hashSet);
        System.out.println("list = " + list);

        words = strB.split("");
        String maxWord = words [0];
        String shortWord = words[0];
        for (String word : words) {
            if (word.length() > maxWord.length()) {
                maxWord = word;
            }
            if ( word.length () <shortWord.length()) {
                shortWord = word;
            }



        }
    }
}
