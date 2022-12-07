public class Search
{
public static void main(String args[])
{
String s="India";
char c[]=new char[s.length()];
for(int i=0; i<c.length; i++)
{
c[i]=s.charAt(i);
}
char search='i';
for(int i=0; i<c.length; i++)
{
if(c[i]==search)
{
System.out.println(search + " is present");
}
}
}
}
