public class Computer
{
public static void main(String args[])
{
String s = "Computer";
char c[] = new char[s.length()];
for(int i=c.length-1; i>=0; i--)
{
for(int j=0; j<=i; j++)
{
c[i]=s.charAt(j);
System.out.print(c[i]);
}
System.out.println();
}
}
}
