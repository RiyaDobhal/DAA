package week1;


import java.util.*;
class lsearch{
    public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    int t=sc.nextInt();int i,j,f=0;
    int c=0;int a[]=new int[20];
    for(i=0;i<t;i++)
    {
    int n =sc.nextInt();
    for(j=0;j<n;j++)
    {
        a[j]=sc.nextInt();
    }
    int k =sc.nextInt();
    c=0;
    for(i=0;i<n;i++)
    {
        c++;
        if(a[i]==k)
        {
            f=1;
            break;
        }
    }
    if(f==0)
    System.out.println(" Not Present "+c);
    else
    System.out.println("Present " +c);
}

}
}