public class Consonants
{
public static void main(String args[])
{
String s = "India is my country";
char c[] = new char[s.length()];
for(int i=0; i<c.length; i++)
{
c[i] = s.charAt(i);
}
for(int i=0; i<c.length; i++)
{
if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'||c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U'||c[i]==' ')
{

}
else
{
System.out.println("The consonant present in this sentence is " + c[i]);
}
}
}
}
