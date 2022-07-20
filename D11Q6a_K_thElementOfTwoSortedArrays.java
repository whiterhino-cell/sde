package akm;

public class D11Q6a_K_thElementOfTwoSortedArrays {
    public long kthElement(int arr1[], int arr2[], int m, int n, int k) {
        int p1 = 0, p2 = 0, counter = 0, answer = 0;

        while (p1 < m && p2 < n) {
            if (counter == k) break;
            else if (arr1[p1] < arr2[p2]) {
                answer = arr1[p1];
                ++p1;
            } else {
                answer = arr2[p2];
                ++p2;
            }
            ++counter;
        }
//        System.out.println(counter);
        if (counter != k) {
            if (p1 != m )
                answer = arr1[p1+(k - counter)-1];
            else
                answer = arr2[p2+(k - counter)-1];
        }
        return answer;
    }
    public static void main(String args[]) {
        D11Q6a_K_thElementOfTwoSortedArrays arrays=new D11Q6a_K_thElementOfTwoSortedArrays();
        int array1[] = {2,3,6,7,9};
        int array2[] = {1,4,8,10};

//        int array1[] = {2,3};
//        int array2[] = {1,4,5,6,7,8,10};
//        int array1[] = {24,50,92,95};
//        int array2[] = {1,2,6,6,8,8,11,11,12,12,13,13,14,15,16,16,17,17,17,19,21,21,22,22,24,24,25,27,29,32,33,34,35,35,35,36,38,40,41,43,44,45,46,46,47,48,50,50,50,54,54,54,54,54,57,58,60,60,61,62,67,68,69,73,73,74,75,76,78,78,79,80,81,82,82,83,83,85,86,87,87,88,88,90,91,91,92,92,92,93,95,95,95,96,97,97,98};
        int m = array1.length;
        int n = array2.length;
        int k = 5;
        System.out.println(arrays.kthElement(array1, array2, m, n, k));

    }
}
