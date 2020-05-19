import java.io.*;
import java.util.*;

public class Solution {
    
    public void AbsDifference(int[] array,int noOfElements)
    {
        int minDifference=Math.abs(array[0]-array[1]);
        int count=0; 
        for(int i=0;i<noOfElements;i++)
        {
            for(int j=i+1;j<noOfElements;j++)
            {
                if(minDifference>= Math.abs(array[i]-array[j]))
                {
                    if(minDifference==Math.abs(array[i]-array[j]))
                       { count++;}
                    minDifference= Math.abs(array[i]-array[j]);
                    
                                      
                }
            }
        }
                       
        int[] pairNumber = new int[2*count];
        for(int i=0;i<noOfElements;i++)
        {
            for(int j=i+1;j<noOfElements;j++)
            {
                 while(Math.abs(array[i]-array[j])==minDifference)
                    {
                        int k=0;
                        pairNumber[k]=array[i];
                        pairNumber[k+1]=array[j];
                        k=k+2;
                    }
            }
            
        }
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int inputs=scanner.nextInt();
        int[] array=new int[inputs];
        for(int i=0;i<inputs;i++)
        {
            array[i]=scanner.nextInt();
        }
        Solution Difference=new Solution();
        Difference.AbsDifference(array,inputs);
    }
}