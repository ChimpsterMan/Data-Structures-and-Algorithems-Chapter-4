public class MainSinglyLinkedList{
  public static void main(String args[]){
    SinglyLinkedList<Listing> school = new SinglyLinkedList<Listing>();
    
    school.insert(new Listing("Jack", 0, 4.0));
    school.insert(new Listing("John", 1, 4.1));
    school.insert(new Listing("Jill", 2, 3.8));
    school.showAll();
    
    System.out.println("-----------");
    System.out.println(school.fetch("Jack").toString());
    
    System.out.println("-----------");
    school.delete("Jack");
    school.showAll();
    
    System.out.println("-----------");
    school.update("John", new Listing("Julie", 5, 4.3));
    school.showAll();
  }
}