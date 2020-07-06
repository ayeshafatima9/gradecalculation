import java.utill.Scanner;
public class Calculation {
public static void main(String[] args){
int marks[]=new int[7];// 7 rep 7 subjects
int i;
float total=0,avg;
Scanner scr=new Scanner(System.in);
for(int i=1;i<=6;i++)
{ 
System.out.println("Enter subject marks"+i);
marks[i]=scr.nextInt();
total=total+marks[i];
}
scr.close();
avg=total/7;
System.out.println("Grade is");
if(avg>=85)
{
System.out.print("A");
}
else if(avg>=75 && avg<85)
{
System.out.print("B");
}
else if(avg>=60 && avg<75)
{ 
System.out.print("C");
}
else if(avg>=50 && avg<60)
{
System.out.print("D");
}
else {
System.out.print("Fail!");

}
}
