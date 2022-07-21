package cse; 
public class Thirdsem { 
 public void Welcomemsg() { 
 System.out.println("Welcome to OOPs Lab"); 
 } 
 private void Welcomemsg_private() { 
 System.out.println("Welcome to OOPs Lab (Private)"); 
 } 
 void Welcomemsg_default() { 
 System.out.println("Welcome to OOPs Lab (Default)"); 
 } 
 protected void Welcomemsg_protected() { 
 System.out.println("Welcome to OOPs Lab (Protected)"); 
 } 
}


package rvce; 
import cse.Thirdsem; 
class Csedept extends Thirdsem{ 
 public void Welcomemsg() { 
 System.out.println("Welcome to CSE dept"); 
 } 
 private void Welcomemsg_private() { 
 System.out.println("Welcome to OOPs Lab (Private)"); 
 } 
 void Welcomemsg_default() { 
 System.out.println("Welcome to OOPs Lab (Default)"); 
 } 
 protected void Welcomemsg_protected() { 
 System.out.println("Welcome to OOPs Lab (Protected)"); 
 } 
 public void display(){ 
 System.out.println("Inside display method"); 
 } 
} 
public class Test{ 
 public static void main(String[] args){ 
 Csedept dept = new Csedept(); 
 Thirdsem sem = new Thirdsem(); 
 dept.display(); 
 System.out.println("Public method overriding"); 
 dept.Welcomemsg(); 
 sem.Welcomemsg(); 
 System.out.println("Private method overriding"); 
 //dept.Welcomemsg_private(); 
 //sem.Welcomemsg_private(); 
 System.out.println("Default method overriding"); 
 dept.Welcomemsg_default(); 
 //sem.Welcomemsg_default(); 
 System.out.println("Protected method overriding"); 
 dept.Welcomemsg_protected(); 
 //sem.Welcomemsg_protected(); 
 } 
}
