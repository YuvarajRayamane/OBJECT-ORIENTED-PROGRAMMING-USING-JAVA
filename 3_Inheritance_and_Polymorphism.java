import java.util.Scanner; 
class Circle{ 
 private double radius; 
 private String color; 
 public Circle(){ 
 this.radius = 1.0; 
 this.color = "red"; 
 } 
 public Circle(double radius){ 
 this.radius = radius; 
 this.color = "red"; 
 } 
 public Circle(double radius, String color){ 
 this.radius = radius; 
 this.color = color; 
 } 
 public double getRadius(){ 
 return this.radius; 
 } 
 public String getColor(){ 
 return this.color; 
 } 
 public double getArea(){ 
 return(Math.PI*radius*radius); 
 } 
} 
class Cylinder extends Circle{ 
 private double height; 
 public Cylinder(){ 
 super(); 
 this.height = 1.0; 
 } 
 public Cylinder(double height, double radius){ 
 super(radius); 
 this.height = height; 
 } 
 public Cylinder(double height, double radius, String color){ 
 super(radius,color); 
 this.height = height; 
 } 
 public double getHeight(){ 
 return height; 
 } 
 public double getVolume(){ 
 return super.getArea()*height; 
 } 
 public double getArea(){ 
 
return((2*Math.PI*super.getRadius()*height)+(2*super.getArea())); 
 } 
} 
public class Main{ //TestCylinder
 public static void main(String[] args){ 
 Cylinder cy1 = new Cylinder(); 
 System.out.println("Cylinder 1:\nRadius is " +cy1.getRadius()); 
 System.out.println("Height is " +cy1.getHeight()); 
 System.out.println("Color is " +cy1.getColor()); 
 System.out.println("Base area is " +cy1.getArea()); 
 System.out.println("Volume is " +cy1.getVolume()); 
 System.out.println(""); 
 System.out.println("Enter height and radius:"); 
 Scanner s = new Scanner(System.in); 
 double ht = s.nextDouble(); 
 double r = s.nextDouble(); 
 Cylinder cy2 = new Cylinder(ht, r); 
 System.out.println("Cylinder 2:\nRadius is " +cy2.getRadius()); 
 System.out.println("Height is " +cy2.getHeight()); 
 System.out.println("Color is " +cy2.getColor()); 
 System.out.println("Base area is " +cy2.getArea()); 
 System.out.println("Volume is " +cy2.getVolume()); 
 System.out.println(""); 
 System.out.println("Enter height, radius and color:"); 
 ht = s.nextDouble(); 
 r = s.nextDouble(); 
 String c = s.next(); 
 Cylinder cy3 = new Cylinder(ht, r, c); 
 System.out.println("Cylinder3:\nRadius is " +cy3.getRadius()); 
 System.out.println("Height is " +cy3.getHeight()); 
 System.out.println("Color is " +cy3.getColor()); 
 System.out.println("Base area is " +cy3.getArea()); 
 System.out.println("Volume is " +cy3.getVolume()); 
 System.out.println(""); 
 if((cy1.getArea()==cy2.getArea()) && (cy1.getVolume()==cy2.getVolume()) && (cy1.getColor()==cy2.getColor())) 
 System.out.println("Cylinder c1 and c2 dimensions are same"); 
 else 
 System.out.println("Cylinder c1 and c2 dimensions are not same"); 
 if((cy3.getArea()==cy2.getArea()) && (cy3.getVolume()==cy2.getVolume()) && (cy3.getColor()==cy2.getColor())) 
 System.out.println("Cylinder c2 and c3 dimensions are same"); 
 else 
 System.out.println("Cylinder c2 and c3 dimensions are not same"); 
 } 
}

