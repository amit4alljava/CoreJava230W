class SwitchCaseDemo
{
public static void main(String args[]){
// switch allowed char , int , byte 
// From Java 7 String is allowed in switch case
/*
final int SUNDAY = 1;  // Constants
final int MONDAY = 2;
final int TUESDAY = 3;
int days = SUNDAY; */
String days = "Sunday";
switch(days)
{
default:
System.out.println("Wrong Day....");
break;
case "Sunday":
System.out.println("This is Funny Day ....");
break;
case "Monday": 
System.out.println("This is Such a Boring Day Lot of Work ....");
break;
case "Tuesday":
System.out.println("This is Little Bit Boring...");

}
}

}