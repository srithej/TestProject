

import java.util.Scanner;

public class Biggestnum3 {

public static void main(String[] args) {
int a,b,c;
System.out.println("Enter a,b and c value");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
//a=8 b=6 c=7
if(a>b && a>c) {
System.out.println(a+" is greater than "+b+" and "+c);
}
else if(b>a && b>c)
{
System.out.println(b+" is greater than "+a+" and "+c);
}
else
{
System.out.println(c+" is greater than "+a+" and "+b);
}
}

}