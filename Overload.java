class Rectangle{
int length, breadth;
Rectangle(){
length=0;
breadth=0;
}
Rectangle(int x, int y){
length=x;
breadth=y;
}
int rectarea(){
return length*breadth;
}
int rectarea(int x, int y){
return x*y;
}
}
class Overload
{
public static void main(String args[])
{
Rectangle r = new Rectangle(30, 50);
System.out.println("Area of rectangle " + r.rectarea());
System.out.println("Area or rectangle " + r.rectarea(10,10));
}
}