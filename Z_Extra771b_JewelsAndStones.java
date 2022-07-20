package akm;

public class Z_Extra771b_JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        int c=0;
        for (int i = 0; i < stones.length(); i++) {
            char ch=stones.charAt(i);
            if (jewels.indexOf(ch)!=-1)
                c++;
        }

        return c;
    }

    public static void main(String[] args) {
        Z_Extra771a_JewelsAndStones stones=new Z_Extra771a_JewelsAndStones();
        System.out.println(stones.numJewelsInStones("aA","aAAbbbb"));
    }
}
