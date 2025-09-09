package MIS;
import java.util.Scanner;

class JSPM {
    String studentName;
    long prn;   
    String div;
    long fees;  
}

class FST extends JSPM { // Faculty of Science and Technology
    Scanner sc = new Scanner(System.in);

    void StuName() {
        System.out.print("Enter student name: ");
        this.studentName = sc.nextLine();
    }

    void stuPRN() {
        System.out.print("Enter PRN: ");
        this.prn = sc.nextLong();
        sc.nextLine(); // consume leftover newline
    }

    void StuDiv() {
        System.out.print("Enter division: ");
        this.div = sc.nextLine();
    }

    void StuFees() {
        System.out.print("Enter fees: ");
        this.fees = sc.nextLong();
    }

    void display() {
        System.out.println("\n---- Science & Technology Student ----");
        System.out.println("Name: " + studentName);
        System.out.println("PRN: " + prn);
        System.out.println("Division: " + div);
        System.out.println("Fees: " + fees);
    }
}

class FOH extends JSPM { // Faculty of Humanities
    Scanner sc = new Scanner(System.in);

    void StuName() {
        System.out.print("Enter student name: ");
        this.studentName = sc.nextLine();
    }

    void stuPRN() {
        System.out.print("Enter PRN: ");
        this.prn = sc.nextLong();
        sc.nextLine();
    }

    void StuDiv() {
        System.out.print("Enter division: ");
        this.div = sc.nextLine();
    }

    void StuFees() {
        System.out.print("Enter fees: ");
        this.fees = sc.nextLong();
    }

    void display() {
        System.out.println("\n---- Humanities Student ----");
        System.out.println("Name: " + studentName);
        System.out.println("PRN: " + prn);
        System.out.println("Division: " + div);
        System.out.println("Fees: " + fees);
    }
}

class FOM extends JSPM { // Faculty of Medical
    Scanner sc = new Scanner(System.in);

    void StuName() {
        System.out.print("Enter student name: ");
        this.studentName = sc.nextLine();
    }

    void stuPRN() {
        System.out.print("Enter PRN: ");
        this.prn = sc.nextLong();
        sc.nextLine();
    }

    void StuDiv() {
        System.out.print("Enter division: ");
        this.div = sc.nextLine();
    }

    void StuFees() {
        System.out.print("Enter fees: ");
        this.fees = sc.nextLong();
    }

    void display() {
        System.out.println("\n---- Medical Student ----");
        System.out.println("Name: " + studentName);
        System.out.println("PRN: " + prn);
        System.out.println("Division: " + div);
        System.out.println("Fees: " + fees);
    }
}

class FOBM extends JSPM { // Faculty of Business Management
    Scanner sc = new Scanner(System.in);

    void StuName() {
        System.out.print("Enter student name: ");
        this.studentName = sc.nextLine();
    }

    void stuPRN() {
        System.out.print("Enter PRN: ");
        this.prn = sc.nextLong();
        sc.nextLine();
    }

    void StuDiv() {
        System.out.print("Enter division: ");
        this.div = sc.nextLine();
    }

    void StuFees() {
        System.out.print("Enter fees: ");
        this.fees = sc.nextLong();
    }

    void display() {
        System.out.println("\n---- Business & Management Student ----");
        System.out.println("Name: " + studentName);
        System.out.println("PRN: " + prn);
        System.out.println("Division: " + div);
        System.out.println("Fees: " + fees);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Faculty of Science and Technology");
        System.out.println("2. Faculty of Humanities");
        System.out.println("3. Faculty of Medical");
        System.out.println("4. Faculty of Business and Management");
        System.out.print("Please enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: System.out.print("Enter the number of students:");
            		int n1 = sc.nextInt();
            		System.out.println();
            		
                FST[] fstStud = new FST[n1];
                for(int i = 0; i<n1; i++) {
                	System.out.println("Enter the details of student of FST:");
                	fstStud[i] = new FST();
                	fstStud[i].StuName();
                    fstStud[i].stuPRN();
                    fstStud[i].StuDiv();
                    fstStud[i].StuFees();
                }
                
                System.out.println("Display the given input:");
                for(int i = 0 ; i < n1 ; i++) {
                	fstStud[i].display();
                }
                break;

            case 2:
            	System.out.print("Enter the number of students:");
        		int n2 = sc.nextInt();
        		
            FOH[] fohStud = new FOH[n2];
            for(int i = 0; i<n2; i++) {
            	System.out.println("Enter the details of student of FST:");
            	fohStud[i] = new FOH();
            	fohStud[i].StuName();
                fohStud[i].stuPRN();
                fohStud[i].StuDiv();
                fohStud[i].StuFees();
            }
            
            System.out.println("Display the given input:");
            for(int i = 0 ; i < n2 ; i++) {
            	fohStud[i].display();
            }                break;

            case 3:
            	System.out.print("Enter the number of students:");
        		int n3 = sc.nextInt();
        		
            FOM[] fomStud = new FOM[n3];
            for(int i = 0; i<n3; i++) {
            	System.out.println("Enter the details of student of FST:");
            	fomStud[i] = new FOM();
            	fomStud[i].StuName();
                fomStud[i].stuPRN();
                fomStud[i].StuDiv();
                fomStud[i].StuFees();
            }
            
            System.out.println("Display the given input:");
            for(int i = 0 ; i < n3 ; i++) {
            	fomStud[i].display();
            }
                break;

            case 4:
            	System.out.print("Enter the number of students:");
        		int n4 = sc.nextInt();
        		
            FOBM[] fobmStud = new FOBM[n4];
            for(int i = 0; i<n4; i++) {
            	System.out.println("Enter the details of student of FST:");
            	fobmStud[i] = new FOBM();
            	fobmStud[i].StuName();
                fobmStud[i].stuPRN();
                fobmStud[i].StuDiv();
                fobmStud[i].StuFees();
            }
            
            System.out.println("Display the given input:");
            for(int i = 0 ; i < n4 ; i++) {
            	fobmStud[i].display();
            }
                break;

            default:
                System.out.println("Invalid choice!!");
        }
    }
}
