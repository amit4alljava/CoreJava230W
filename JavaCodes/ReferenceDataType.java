class ReferenceDataType
{
public static void main(String args[]){
String x = new String("Hello");
String y = new String("Hello");
int a= 100;
int b = 100;
if(x.equals(y)){
System.out.println("Same Value of X and Y ");
}
else
{
System.out.println("Not Same Value of X and Y ");
}
if(a==b)
{
System.out.println("Same Value");
}
else
{
System.out.println("Not Same Value");
}
if(x==y){
System.out.println("Same Ref");
}
else
{
System.out.println("Not Same Ref");
}






}
}