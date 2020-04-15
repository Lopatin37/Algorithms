package L5;

public class Recursion {
    public static void main(String[] args){
        System.out.println(recursion(-9,-3));

    }

    private static int recursion(int multiplier1, int multiplier2){
        if(multiplier1 == 0 || multiplier2 == 0) return 0;
        if(multiplier2 < 0) {
            if (multiplier2 == -1) return (-multiplier1);
            return recursion(multiplier1, multiplier2 + 1) - multiplier1;
        }else{
            if (multiplier2 == 1) return multiplier1;
            return recursion(multiplier1, multiplier2 - 1) + multiplier1;
        }
    }
}
