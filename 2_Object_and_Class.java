import java.util.Scanner;
class Address{
    int street_num;
    String city,state,country;
    Address(int street_num, String city, String state, String country){
        this.street_num = street_num;
        this.city = city;
        this.state = state;
        this.country = country;
    }
}

class Student{
    String USN, name;
    Address addr;
    Student(String USN, String name, Address addr){
        this.USN = USN;
        this.name = name;
        this.addr = addr;
    }
}

class College{
    String name;
    Address addr;
    College(String name, Address addr){
        this.name = name;
        this.addr = addr;
    }
}

class Employee{
    String EmpID, name;
    Address addr;
    Employee(String EmpID, String name, Address addr){
        this.EmpID = EmpID;
        this.name = name;
        this.addr = addr;
    }
}

class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);//s is user defined variable to scan the input
        int ch, n = 0, i; //ch=choice
        String name, usn, EmpID;
        Address[] addr = new Address[20];
        Student[] std = new Student[20];
        College[] clg = new College[20];
        Employee[] emp = new Employee[20];
        while(true){
            System.out.println("1. Enter student details\n2. Enter college details\n3. Enter employee details");
            System.out.println("4. Display student details\n5. Display college details\n6. Display employee details");
            System.out.println("Enter your choice");
            ch = s.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Enter no. of students: ");
                    n = s.nextInt();
                    for(i=1; i<=n; i++){
                        System.out.println("Enter Student "+i+" details:");
                        System.out.print("Name : ");
                        name = s.next();
                        System.out.print("USN : ");
                        usn = s.next();
                        System.out.println("Street:\nCity:\nState:\nCountry:");
                        addr[i] = new Address(s.nextInt(),s.next(),s.next(),s.next());
                        std[i] = new Student(usn,name,addr[i]);
                    }
                    break;
                case 2:
                    System.out.println("Enter no. of colleges: ");
                    n = s.nextInt();
                    for(i=1; i<=n; i++){
                        System.out.print("Enter details of college "+i+"\nCollege Name: ");
                        name = s.next();
                        System.out.println("Street:\nCity:\nState:\nCountry:");
                        addr[i] = new Address(s.nextInt(),s.next(),s.next(),s.next());
                        clg[i] = new College(name, addr[i]);
                    }
                    break;
                case 3:
                    System.out.println("Enter no. of employees: ");
                    n = s.nextInt();
                    for(i=1; i<=n; i++){
                        System.out.println("Enter details of Employee "+i);
                        System.out.print("EmployeeID : ");
                        EmpID = s.next();
                        System.out.print("Name: ");
                        name = s.next();
                        System.out.println("Street:\nCity:\nState:\nCountry:");
                        addr[i] = new Address(s.nextInt(),s.next(),s.next(),s.next());
                        emp[i] = new Employee(EmpID, name, addr[i]);
                    }
                    break;
                case 4:
                    System.out.println("+-------------------------------STUDENT DETAILS---------------------------------+");
                    System.out.format("|%-12s|%-15s|%-50s|\n","USN","Name","Address");
                    System.out.println("+-------------------------------------------------------------------------------+");
                    for(i=1; i<=n; i++){
                        System.out.format("|%-12s|%-15s|%-50s|\n",std[i].USN,std[i].name,"Street no."+std[i].addr.street_num+","+std[i].addr.city+","+std[i].addr.state+","+std[i].addr.country);
                    }
                    System.out.println("+-------------------------------------------------------------------------------+");
                    break;
                case 5:
                    System.out.println("+-------------------------------COLLEGE DETAILS---------------------------------+");
                    System.out.format("|%-28s|%-50s|\n","College Name","Address");
                    System.out.println("+-------------------------------------------------------------------------------+");
                    for(i=1; i<=n; i++){
                        System.out.format("|%-28s|%-50s|\n",clg[i].name ," Street no. "+clg[i].addr.street_num+","+clg[i].addr.city+","+clg[i].addr.state+","+clg[i].addr.country);
                    }
                    System.out.println("+-------------------------------------------------------------------------------+");
                    break;
                case 6:
                    System.out.println("+------------------------------EMPLOYEE DETAILS---------------------------------+");
                    System.out.format("|%-12s|%-15s|%-50s|\n","EmployeeID","Name","Address");
                    System.out.println("+-------------------------------------------------------------------------------+");
                    for(i=1; i<=n; i++){
                        System.out.format("|%-12s|%-15s|%-50s|\n",emp[i].EmpID,emp[i].name,"Street no. "+emp[i].addr.street_num+","+emp[i].addr.city+","+emp[i].addr.state+","+emp[i].addr.country);
                    }
                    System.out.println("+-------------------------------------------------------------------------------+");
                    break;
                default: return;
            }
        }

    }
}
