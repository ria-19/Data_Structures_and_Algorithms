public class Oct_20 {
    public static void main(String[] args) {

    }

    public String intToRoman(int num) {
        int[] div ={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] roman = {"M","CM","D","CD","C","XC","L","XL",          "X","IX","V","IV","I"};

        StringBuilder res = new StringBuilder();
        for(int i = 0; i < div.length; i++){
            while(num >= div[i]){
                res.append(roman[i]);
                num -= div[i];
            }
        }

        return res.toString();
    }
}
