public class Space
{
public static void main(String args[])
{
String s = "India is my country";
char c[] = new char[s.length()];
for(int i=0; i<c.length; i++)
{
c[i] = s.charAt(i);
}
char search = ' ';
int counter = 0;
for(int i=0; i<c.length; i++)
{
if(c[i] == ' ')
{
counter = counter+1;
}
}
System.out.println("The no of spaces present are " + counter);
}
}
