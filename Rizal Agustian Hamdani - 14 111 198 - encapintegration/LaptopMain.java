class LaptopMain {
public static void main (String args[]) {
 
Laptop ob1 = new Laptop();
 
double vol;
 
ob1.setLength(50);
ob1.setWidth(30);
ob1.setHeight(90);
 
vol = ob1.displayVolume();
System.out.println("Volume Laptop is : " + vol);
}
}