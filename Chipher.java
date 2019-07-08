# ceaser-chipher-encrypt-and-decrypt
A java program to encrypt and decrypt-ceaser chipher.
 import java.util.*;
import java.io.*;
public class Chipher
{

public static void encrypt(String str,int shift)
{
int n,i;
n=str.length();
char arr[]=new char[n];
for(i=0;i<n;i++)
{
if(str.charAt(i)==' ')
{
//System.out.print(" ");
arr[i]=' ';
}
  else if(Character.isUpperCase(str.charAt(i)))
{
   //System.out.print((char)(((str.charAt(i)+shift-65)%26)+65));
arr[i]=(char)(((str.charAt(i)+shift-65)%26)+65);
}
else
{
//System.out.print((char)(((str.charAt(i)+shift-97)%26)+97));
arr[i]=(char)(((str.charAt(i)+shift-97)%26)+97);
}
}
//decrypt(str,26-shift);
for(i=0;i<n;i++)
{
System.out.print(arr[i]);
}
System.out.println(" ");
decrypt(arr,26-shift,n);
}



public static void decrypt(char[] str,int shift,int n)
{
int i;
//n=str.length();
char arr[]=new char[n];
//str.toCharArray();*/
for(i=0;i<n;i++)
{
if(str[i]==' ')
{
//System.out.print(" ");
arr[i]=' ';
}
 else if(Character.isUpperCase(str[i]))
{
   //System.out.print((char)(((str.charAt(i)+shift-65)%26)+65));
arr[i]=(char)((((str[i]+shift-65)%26)+65));
}
else
{
//System.out.print((char)(((str.charAt(i)+shift-97)%26)+97));
arr[i]=(char)((((str[i]+shift-97)%26)+97));
}
}
for(i=0;i<n;i++)
{
System.out.print(arr[i]);
}

}

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str;
int shift,i,j;
str=sc.nextLine();
shift=sc.nextInt();
encrypt(str,shift);

//decrypt(str,26-shift);
}
}

