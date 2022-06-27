package akm;

import java.util.Arrays;

class D8Q2_MinimumPlatforms
{
    static int findPlatform(int arr[], int dep[], int n)
    {
        Arrays.sort(arr);
        Arrays.sort(dep);

        int plat_needed = 1, result = 1;
        int i = 1, j = 0;

        while (i < n && j < n) {
            if (arr[i] <= dep[j]) {
                plat_needed++;
                i++;
            }else if (arr[i] > dep[j]) {
                plat_needed--;
                j++;
            }
            if (plat_needed > result)
                result = plat_needed;
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 6 ;
        int arr[] = {900, 940, 950, 1100, 1500, 1800} ;
        int dep[] = {910, 1200, 1120, 1130, 1900, 2000};
        int ans=D8Q2_MinimumPlatforms.findPlatform(arr,dep,n);
        System.out.println(ans);
    }

}
