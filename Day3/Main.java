import java.util.*;
class Main{
 public static void main(String[] args)
{
Deluxe d = new Deluxe();
DeluxeSeaViewroom s = new DeluxeSeaViewroom();
Suiteroom r=new Suiteroom();
Scanner sc=new Scanner(System.in);

System.out.println("Hotel Traiff Calculator");
System.out.println("1.Deluxe Room");
System.out.println("2.Deluxe AC Room");
System.out.println("3.Suite Ac Room");
System.out.println("Select Room Type which you want:");
int n=sc.nextInt();

switch(n)
{

case 1:
{
System.out.println("Hotel Name: ");

d.setHotelName(sc.next());

System.out.println("Room Square Feet per Area");

d.setNumberOfSqFeet(sc.nextInt());

System.out.println("This Room has Tv");

d.setHasTV(sc.nextBoolean());

System.out.println("This Room has Wifi");

boolean b1=sc.nextBoolean();

d.setHasWifi(b1);

int m1=0;
if(b1==true)
{
int m=1;
//d.setHasWifi();
System.out.println("This Room has Wifi");
//b1 = d.setHasWifi;
m1=d.display1(m);

System.out.println(m1);
}
d.display(m1);
break;
}
case 2:
{
System.out.println("Hotel Name is: ");

s.setHotelName(sc.next());

System.out.println("Room Square Feet per Area is");

s.setNumberOfSqFeet(sc.nextInt());

System.out.println("This Room has Tv");

s.setHasTV(sc.nextBoolean());

System.out.println("This Room has Wifi");

boolean b1=sc.nextBoolean();

s.setHasWifi(b1);

int m1=0;
if(b1==true)
{
int m=1;

m1=s.display11(m);
}
s.display(m1);
break;

}
case 3:
{
System.out.println("Hotel Name: ");

r.setHotelName(sc.next());

System.out.println("Room Square Feet per Area");

r.setNumberOfSqFeet(sc.nextInt());

System.out.println("this Room has Tv");

r.setHasTV(sc.nextBoolean());

System.out.println("this Room has Wifi");

boolean b1=sc.nextBoolean();

r.setHasWifi(b1);

int m1=0;
if(b1==true)
{
int m=1;


m1=r.display123(m);

}
r.display(m1);
break;
}
}
}
}