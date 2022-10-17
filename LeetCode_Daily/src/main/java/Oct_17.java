import java.util.HashSet;

public class Oct_17 {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        boolean ap1 = approach1(sentence);
        System.out.println(ap1);

        boolean ap2 = approach2(sentence);
        System.out.println(ap2);


        boolean ap3 = approach3(sentence);
        System.out.println(ap3);
    }

    // TC : O(n) , SC : O(1)
    public static boolean approach1(String sentence) {
        int[] frequency = new int[26];

        for(char c: sentence.toCharArray()){
            frequency[c - 97]++;
        }

        for(int i: frequency){
            if (i < 1){
                return false;
            }
        }

        return true;
    }

    // TC : O(n) , SC : O(1)
    public static boolean approach2(String sentence) {
       HashSet<Character> seen = new HashSet<>(26);

       for(char c: sentence.toCharArray()){
           seen.add(c);
       }

       return seen.size() == 26;
    }


    // Interesting Approach -- Using Bit Manipulation
    public static boolean approach3(String sentence) {
        int seen = 0;

        for(char c: sentence.toCharArray()){
            int mappedIndex = c - 'a';
            int currBit = 1 << mappedIndex;
            seen |= currBit;
        }

        return (seen == (1 << 26) - 1);
    }

}
