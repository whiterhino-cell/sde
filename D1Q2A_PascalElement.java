package akm;

public class D1Q2A_PascalElement {
    public static int Pascal(int r,int c){
        int ans=1;
        for (int i = 1; i <= c - 1; i++) {
            ans=(ans*(r-i))/i;
        }
        return ans;
    }
    public static void main(String[] args) {

        int r=6;
        int c=4;

//        int r=1;
//        int c=1;

//        int r=4;
//        int c=8;

//        int r=3;
//       int c=5;

//        int r=2;
//        int c=5;
        System.out.println("element at "+"( "+r+","+c+" )"+" is : "+ Pascal(r,c));

    }
}