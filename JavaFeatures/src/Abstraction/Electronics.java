package Abstraction;

public abstract class  Electronics {
String color;
float price,weight;

void processor()
{
System.out.println("Electronic machine have a processor");	
}
void semiConductor()
{
System.out.println("electronic machine also have a semiConductor");
}
abstract void rating();
abstract void features();
abstract void electricityConsumption();
}
