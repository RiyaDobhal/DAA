import java.util.*;
class LinearSearch{
    public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the Size of the array : ");
    int n =sc.nextInt();
    int i,f=0;
    int a[]=new int[n];
    System.out.println("Enter the elements in the array : ");
    for(i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
    System.out.println("Enter the Key element to be searched : ");
    int k =sc.nextInt();
    for(i=0;i<n;i++)
    {
        if(a[i]==k)
        {
            f=1;
            break;
        }
    }
    if(f==0)
    System.out.println("Not Found");
    else
    System.out.println("Found");

}
}
