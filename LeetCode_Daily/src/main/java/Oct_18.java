
public class Oct_18 {
    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }

    public static String countAndSay(int n) {
        if (n == 1){
            return "1";
        }

        return say(countAndSay(n - 1));

    }

    public static String say(String s){
        StringBuilder ans = new StringBuilder();

        int count = 1;
        char c = s.charAt(0);

        for(int i = 1; i < s.length(); i++){
            if (s.charAt(i) == c){
                count++;
            }
            else{
                ans.append(count);
                ans.append(c);
                c = s.charAt(i);
                count = 1;
            }
        }

        ans.append(count);
        ans.append(c);

        return ans.toString();
    }
}
