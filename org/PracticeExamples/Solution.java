package com.org.PracticeExamples;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

/*
 * public class DuplicateLinkedHashSet { public static void main(String[] args)
 * { Scanner sc=new Scanner(System.in); System.out.println("Size:"); int
 * size=sc.nextInt(); System.out.println("Elements"); Integer arr[]=new
 * Integer[size]; for(int i=0;i<size;i++) { arr[i]=sc.nextInt(); }
 * LinkedHashSet<Integer> list=new LinkedHashSet<Integer>(Arrays.asList(arr));
 * System.out.println(list);
 * 
 * } }
 */
//import java.util.HashMap;
//import java.util.Map;
///*Given an array of integers nums and an integer target, 
//return indices of the two numbers such that they add up to target.
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Output: Because nums[0] + nums[1] == 9, we return [0, 1].
// */
public class Solution {
	public static int[] twoSum(int[] nums, int target) {
		for(int i = 0; i < nums.length; i++) {
			for(int j = i + 1; j < nums.length; j++) {
				if(nums[i] + nums[j] == target)
					return new int[]{i, j};
			}
		}
		return new int[] {0};
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size  :");
		int size=sc.nextInt();
		int[] nums = new int[size];
		System.out.println("Enter ur elements :");
		for(int i=0;i<nums.length;i++) {
			nums[i]=sc.nextInt();
		}
		System.out.println("Enter ur target number :");
		int target =sc.nextInt();
		int[] result = twoSum(nums, target);
		System.out.println(result[0] + " , " + result[1]);
		System.out.println();
		System.out.println("Enter starting range :");
		int startRange=sc.nextInt();
		System.out.println("Enter end range :");
		int endRange=sc.nextInt();
		for(int i=startRange;i<=endRange;i++) {
			if(i%10==7)
				System.out.print(" "+i);
		}
	}
}

/*import java.util.*;
import java.util.Map.Entry;
public class Solution {
    int count=25;
    Map<Integer,Integer> map=new LinkedHashMap<Integer,Integer>();
    ArrayList<Integer> list=new ArrayList<>(map.keySet());
    Solution()
    {
        for(int i=1;i<=15;i++)
        {
            map.put(i, toString(count));
        }
        System.out.println(map);
    }
    public int toString(int count) {
        return count;
    }
    void display()
    {
        System.out.println("...........APPLE-Rs.25/-...........");
        System.out.println("Total apples:"+map);
    }
    int calcul(Integer num)
    {
        if(map.containsKey(num))  {
            System.out.print("\nCost for "+num+" apples is: ");
            Set set=map.entrySet();
            Iterator itr=set.iterator();  
            while(itr.hasNext()){  
                Map.Entry<Integer,Integer> entry=(Map.Entry<Integer,Integer>)itr.next();
                if(entry.getKey()==num) {
                num=(entry.getKey()*(entry.getValue()));
                System.out.print(num);
                    }}
            System.out.println();
            return num;}
        else
        {
            System.out.println("Please enter the quantity based on the availability");
        }
        return 0;
    }
    void remove(int num) 
    {
        if(map.containsKey(num)) 
        {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) 
            {    
                Entry<Integer,Integer> item = (Entry) it.next();
                if(item.getKey()<=num) {
                Integer Key=item.getKey();
                 it.remove();
                }
            }
        }
           System.out.println(map);  
    }
}*/



