//Enkapsulasi pada Java
 
class Laptop {
 
private int length;
private int width;
private int height;
 
 
public void setLength(int p)
{length = p;}
 
public void setWidth(int p)
{width = p;}
 
public void setHeight(int p)
{height = p;}
 
public int displayVolume()
{return (length*width*height);}
}
 
