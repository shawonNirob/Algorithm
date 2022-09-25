package recursion;

public class PrintName {
    public int helper(int n){
        if(n == 0) return 0;
        if(n==1) return 1;



        return  helper(n-1)  + helper(n-2);
    }

    public static void main(String[] args) {
        PrintName cal = new PrintName();
        int sum = cal.helper(8);
        System.out.println(sum);
    }
}

//

