strictfp class DataType
{
strictfp void calc(){
}
public static void main(String args[])
{
boolean g = true;  // 1 byte , 2 byte , 4 byte
float p =90.20f;  //4 byte
double z = 90.23; // 8 byte
int q = 130;
byte a  = (byte)q;  // 1 byte
System.out.println("A is "+a);
char b ='A';   // 2 bytes 
int x = 100;   // Value Type or Primivite Type (4 Bytes)
long y = 200L; // 8 bytes
}
}