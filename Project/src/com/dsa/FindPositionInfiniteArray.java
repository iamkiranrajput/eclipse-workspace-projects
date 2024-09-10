package com.dsa;


public class FindPositionInfiniteArray {




    static int size(int arr[], int target){
        int start=0;
        int end=1;

        while(target>arr[end]){

            int temp=end+1;
            end=end+(end-start+1)*2;
            start=temp;
            

        }
        System.out.println(start+" "+end);
        int ans=binarySearch(arr,target,start,end);
     

        return ans;


        }
        static int binarySearch(int[] arr,int target,int start,int end){
        	
            while(start<=end){
                int mid=start+(end-start)/2;
//                System.out.println(mid);
                if(target>arr[mid])
                    start=mid+1;
                else if(target<arr[mid])
                    end=mid-1;
                else if(target==arr[mid])
                    return mid;
//                System.out.println(mid);
            }

        return -1;
        }



    public static void main(String[] args) {
        int arr[]={1,3,4,5,6,7,8,9,12,12,13,14,15,16,17,19,23,24,26,34,45,56,67,78,89};
       System.out.println(size(arr,3));
    }
    }



