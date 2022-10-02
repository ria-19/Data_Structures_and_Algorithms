public class Basic {
    static int count = 0;
    public static void main(String[] args) {
        f();
    }

    public static void f(){
        // Base Condition
        if (count == 3){
            return;
        }
        System.out.println(count);
        count++;
        f();
    }
}
