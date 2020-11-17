import java.util.Scanner;

public class palindrome {

public static void main(String[] args) {
int r,sum=0,temp,n;
int num;
System.out.println("Enter the number: ");
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
System.out.println("The entered number is: "+num);
temp=num;
while(num>0)
{
r=num%10; //if i give 353 r=353%10 which is 3 so r value is 3,we got the last value 3
sum=(sum*10)+r; //(0*10)+3=3,sum=3
num=num/10; //num=353/10=35,num=35
/*so it again goes nd check num>0,35>0 which is true
* enters loop nd calcculate r=35%10=5,r=5
* sum=(3*10)+5=35
* num=35/10=3
* 3>0 true
* enters loop
* r=3%10=3
* sum=(35*10)+3=353
* num=3/10=0
* 0>0 false comes out of the loop and check if condition
*
*/
}
if(temp==sum)
{
System.out.println("given number "+sum+ " is a palindrome");
}
else
{
System.out.println("given number "+sum+ " is not a palindrome");
}
}



}
