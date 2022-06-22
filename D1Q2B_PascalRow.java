package akm;

public class D1Q2B_PascalRow {
    public void pt(int r){
        int p=1;
//        for (int i = 0; i <= r-1; i++) {
//            if(i==0) p=1;
//            else
//                p=(p*(r-i))/i;
//            System.out.print(p+" ");
//        }
        for (int i = 0; i <= r-1; i++) {
            if(i==0) p=1;
            else
                p=(p*(r-i))/i;
            System.out.print(p+" ");
        }
    }
    public static void main(String[] args) {
        int r=4;
        System.out.println(r+"th row in pascal triangle is : ");
        D1Q2B_PascalRow row=new D1Q2B_PascalRow();
        row.pt(r);
    }
}