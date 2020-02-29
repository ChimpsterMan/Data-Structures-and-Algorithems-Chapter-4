//by Erik Nilsson
import java.util.Scanner;

//basic driver program
public class Driver {
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Input the length of the initial data set.");
    int initialLength = scan.nextInt();
    
    SinglyLinkedList school = new SinglyLinkedList();
    
    //prompt the user for all the info of initial nodes
    for (int i = 1; i <= initialLength; i++){
      System.out.println("Please enter the Name then the ID and finally the GPA");
      scan.nextLine();
      school.insert(new Listing(scan.nextLine(), scan.nextInt(), scan.nextDouble()));
    }
    
    int input = 5;
    
    //the main operation loop
    while (input < 6 && input > 0){
      if (input == 1){
          System.out.println("Please enter the Name then the ID and finally the GPA of the listing");
          
          scan.nextLine();
          if (school.insert(new Listing(scan.nextLine(), scan.nextInt(), scan.nextDouble()))){
            System.out.println("operation completed");
          } else {
            System.out.println("ran out of memory");
          }
      }
      if (input == 2){
          System.out.println("Enter the name of the student to fetch");
          scan.nextLine();
          Listing l = school.fetch(scan.nextLine());
          if (l != null){
            System.out.println(l.toString());
            System.out.println("operation completed");
          } else {
            System.out.println("Student not in list");
          }
      }
      if (input == 3){
          System.out.println("Enter the name of the student to delete");
          scan.reset();
          scan.nextLine();
          boolean bool = school.delete(scan.nextLine());
          if (bool == false){
            System.out.println("Student not in list");
          } else {
            System.out.println("operation completed");
          }
      }
      if (input == 4){
          System.out.println("Enter the name of the student to update");
          scan.nextLine();
          String name = scan.nextLine();
          Listing ls = school.fetch(name);
          if (ls != null){
            System.out.println("Please enter the components of the new listing");
            //scan.nextLine();
            if (school.update(name, new Listing(scan.nextLine(), scan.nextInt(), scan.nextDouble()))){
              System.out.println("operation completed");
            } else {
              System.out.println("ran out of memory");
            }
          } else {
            System.out.println("Student not in list");
          }
      }
      if (input == 5){
          school.showAll();
      }
      
      System.out.println("1 to insert, 2 to fetch, 3 to delete, 4 to update, 5 to output, 6 to exit");
      input = scan.nextInt();
    }
    
  }
}