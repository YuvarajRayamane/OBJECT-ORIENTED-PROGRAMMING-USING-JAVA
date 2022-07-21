interface Animal { 
 void eat(); 
 void move(); 
 void communicate(); 
} 
 interface TiredAnimal{ 
 void sleep(); 
} 
 interface Speciality { 
 void special(); 
} 
class Lion implements TiredAnimal,Speciality{ 
 String name; 
 Lion(String name){ 
 this.name = name; 
 } 
 public void eat(){ 
 System.out.print("Hunt my prey"); 
 } 
 public void move(){ 
 System.out.print("Walk on land"); 
 } 
 public void communicate(){ 
 System.out.print("Roar!!"); 
 } 
 public void sleep(){ 
 System.out.print("take small naps."); 
 } 
 public void special(){ 
 System.out.print("claws"); 
 } 
 public void display(){ 
 System.out.print("Hi I am "+name+ "\nI "); 
 eat(); 
 System.out.print("\nI "); 
 move(); 
 System.out.print("\nI "); 
 communicate(); 
 System.out.print("\nand I "); 
 sleep(); 
 System.out.print("\nand I have dangerous "); 
 special(); 
 } 
} 
class Snake implements TiredAnimal,Speciality{ 
 String type; 
 Snake(String type){ 
 this.type = type; 
 } 
 public void eat(){ 
 System.out.print("Swallow...my prey"); 
 } 
 public void move(){ 
 System.out.print("Slither!!!"); 
 } 
 public void communicate(){ 
 System.out.print("Hisssss!!"); 
 } 
 public void sleep(){ 
 System.out.print("Hibernate"); 
 } 
 public void special(){ 
 System.out.print("Poisonous"); 
 } 
 public void display(){ 
 System.out.print("\n\nHi I am of type "+type+ "\nI "); 
 eat(); 
 System.out.print("\nI "); 
 move(); 
 System.out.print("\nI "); 
 communicate(); 
 System.out.print("\nand I "); 
 sleep(); 
 System.out.print("\nand I am "); 
 special(); 
 } 
} 
public class Main { //Forest
 public static void main(String[] args){ 
 Lion l = new Lion("Simba"); 
 Snake s = new Snake("Cobra"); 
 l.display(); 
 s.display(); 
 } 
} 
