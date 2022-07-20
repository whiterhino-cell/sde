package akm;

public class Z_Extra771a_JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        int c=0;
        for (int i = 0; i < jewels.length(); i++) {
            for (int j = 0; j < stones.length(); j++) {
                if (jewels.charAt(i)==stones.charAt(j))
                    c++;
            }
        }

        return c;
    }

    public static void main(String[] args) {
        Z_Extra771a_JewelsAndStones stones=new Z_Extra771a_JewelsAndStones();
        System.out.println(stones.numJewelsInStones("aA","aAAbbbb"));;
    }
}
