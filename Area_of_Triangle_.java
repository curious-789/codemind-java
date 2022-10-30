import java.util.*;
import java.lang.Math;
class main
{
    public static void main(String args[])
    {
       // double n,r,a;
        //n=3.14;
        int n,m,l;
        float s;
        double a,b;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
         m=sc.nextInt();
          l=sc.nextInt();
        //a=n*r*r;
        s=(float)(n+m+l)/2;
        b=s*(s-n)*(s-m)*(s-l);//(s-n);//(s-m)(s-l);
        a=Math.sqrt(b);
        
        System.out.format("%.2f",a);
    }
}