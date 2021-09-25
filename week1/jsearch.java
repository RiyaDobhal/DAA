package week1;

import java.util.Scanner;
import java.lang.Math;
class jsearch
{
  public static void main(String ar[])
  {
   Scanner sc= new Scanner(System.in); 
   int t=sc.nextInt();
   int p;
   int a[]=new int[30];
   int c=0;
   for(p=1;p<=t;p++){

  
   int n=sc.nextInt();
   
   c=0;
   for(int i=0;i<n;i++)
   {
     a[i]=sc.nextInt();
   }   
   int block=(int)(Math.sqrt(n));
   
   int x=sc.nextInt();
   if(x>a[n-1] || x<a[0])
   {
       c++;
     System.out.println("Not Present ");
      System.out.println(c);
     return;
   }
   int i=0;
   int j=block;
   while(a[j]<x && j<n)
   {
       c++;
    i=j;
    j=j+block; 
    if(j>n-1)
    {
     j=n-1;
    }
   
   }
   for(int k=i;k<=j;k++)
    {
      if(a[k]==x)
       {
           c++;
        System.out.println("Present "+(k+1));
        System.out.println(c);
         return;
       }
    }
   System.out.println("Not Present");
   System.out.println(c);

   
  }
}
}
