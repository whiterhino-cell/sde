package akm;

import java.util.Arrays;
import java.util.Comparator;

public class D8Q4_FractionalKnapsackProblem {
    double fractionalKnapsack(int W, Item itemArr[], int n) {
        Arrays.sort(itemArr, new itemComparator());
        int curWeight = 0;
        double ans = 0.0;
        for (int i = 0; i < n; i++) {
            if (curWeight + itemArr[i].weight <= W) {
                curWeight += itemArr[i].weight;
                ans += itemArr[i].value;
            } else {
                int remain = W - curWeight;
                ans += ((double) itemArr[i].value / (double) itemArr[i].weight) * (double) remain;
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        D8Q4_FractionalKnapsackProblem problem=new D8Q4_FractionalKnapsackProblem();
        int n = 3, w = 50;
        int values[] = {60,100,120};
        int weight[] = {10,20,30};
        Item []items=new Item[n];
        for (int i = 0; i < n; i++) {
            items[i]=new Item(values[i],weight[i]);
        }
        double ans=problem.fractionalKnapsack(w,items,n);
        System.out.println(ans);
    }

    class itemComparator implements Comparator<Item> {
        @Override
        public int compare(Item a, Item b) {
            double r1 = (double) (a.value) / (double) (a.weight);
            double r2 = (double) (b.value) / (double) (b.weight);
            if (r1 < r2) return 1;
            else if (r1 > r2) return -1;
            else return 0;
        }
    }

    static class Item {
        int value, weight;

        public Item(int value, int weight) {
            this.value = value;
            this.weight = weight;
        }
    }
}

