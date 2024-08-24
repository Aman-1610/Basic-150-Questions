/* 4. Median of Two Sorted Arrays
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).
Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5. */

public class Median 
{
    public void findMedian(int[] nums1,int[] nums2) 
    {
        int x=nums1.length;
        int y=nums2.length;
        int sum=x+y; 
        int[] arr = new int[sum];
        for(int i=0;i<x;i++)
        {
           arr[i]=nums1[i];//arr=[1,0,0,0,0]
        }
        for(int i=0;i<y;i++)
        {
            arr[i+x]=nums2[i];//arr=[1,2,5,3,1]
        }
        for(int i=0;i<sum;i++)
        {
            for(int j=i+1;j<sum;j++)
            {
                if(arr[j]<arr[i])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int j=0;j<sum;j++)
        {
            System.out.print(arr[j]+" ");
        }
        if(sum%2==0)
        {
            int k=(sum/2);
            double f=(double)(arr[k]+arr[k-1])/2;
            System.out.println("Median is "+f);
        }
        else{
            double f=(double)arr[sum/2];
            System.out.println("Median is "+f);
        }
    }

   
        public static void main(String args[])
        {
            Median m = new Median();
            int[] nums1 = {1};
            int[] nums2 = {2,5,3,1};
            m.findMedian(nums1, nums2);
           // System.out.println(m.findMedian(nums1,nums2));
        }
}
