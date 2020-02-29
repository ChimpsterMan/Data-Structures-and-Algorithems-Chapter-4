public class SinglyLinkedList {
  private Node h;
  
  public SinglyLinkedList(){
     h = new Node();
     h.l = null;
     h.next = null;
  }
  
  public boolean insert(Listing listing){
    Node newNode = new Node();
    if (newNode == null){
      return false;
    } else {
      newNode.next = h.next;
      h.next = newNode;
      newNode.l = listing;
      return true;
    }
  }
  
  public Listing fetch(String targetKey){
    Node n = h.next;
    while(n != null && n.l.compareTo(targetKey) != 0){
      n = n.next;
    }
    if (n != null){
      return n.l.deepCopy();
    }
    
    return null;
  }
  
  public boolean delete(String targetKey){
    Node q = h;
    Node n = h.next;
    while(n != null && n.l.compareTo(targetKey) != 0){
      q = n;
      n = n.next;
    }
    if (n != null){
      q.next = n.next;
      return true;
    } else {
      return false;
    }
  }
  
  public boolean update(String targetKey, Listing listing){
    if (!delete(targetKey)){
      return false;
    } else if (!insert(listing)) {
      return false;
    } else {
      return true;
    }
  }
  
  public void showAll(){
    Node n = h.next;
    while (n != null){
      System.out.println(n.l.toString());
      n = n.next;
    }
  }
  
//the node class for the linked list that refrences a listing component
  class Node {
    private Listing l;
    private Node next;
    
    Node (){
      
    }
  }
}