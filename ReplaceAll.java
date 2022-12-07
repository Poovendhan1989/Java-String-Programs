public class ReplaceAll
{
public static void main(String args[])
{
String s = "India is my country";
char c[] = new char[s.length()];
for(int i=0; i<c.length; i++)
{
c[i] = s.charAt(i);
}
char search = 'i';
char replace = '@';
for(int i=0; i<c.length; i++)
{
if(c[i] == search)
{
c[i] = replace;
}
}
System.out.println(c);
}
}
