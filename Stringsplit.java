public class Stringsplit
{
public static void main(String args[])
{
String s = "I am learning java";
String x[] = s.split(" ");
for(int i=x.length-1; i>=0; i--)
{
System.out.println(x[i]);
}
}
}
