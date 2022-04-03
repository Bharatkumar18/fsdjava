import java.util.*;
class A
{
public static void main(String args[])
{
int i,j,k;
Scanner o=new Scanner(System.in);
while(true){
System.out.println("Enter the values");
i=o.nextInt();
j=o.nextInt();
char a=o.next().charAt(0);
if(a=='+')
System.out.println("Addition of "+i+" and "+j+" is "+(i+j));

else if(a=='-')
System.out.println("sub of "+i+" and "+j+" is "+(i-j));

else if(a=='*')
System.out.println("mul of "+i+" and "+j+" is "+(i*j));

else if(a=='/')
System.out.println("div of "+i+" and "+j+" is "+(i/j));

System.out.println("do you want to continue(Y/N)");
char b=o.next().charAt(0);
if(b=='N')
break;
}
}
}