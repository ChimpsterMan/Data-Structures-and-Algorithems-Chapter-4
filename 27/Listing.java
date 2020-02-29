import javax.swing.JOptionPane;

public class Listing {
 private String name;
 private int id;
 private double gpa;
 
 public Listing(String name, int id, double gpa){
   this.name = name;
   this.id = id;
   this.gpa = gpa;
 }
 
 public String toString(){
   return "Name: " + name + ", ID: " + id + ", GPA: " + gpa;
 }
 
 public Listing deepCopy(){
   Listing clone = new Listing(name, id, gpa);
   return clone;
 }
 
 public int compareTo(String targetKey){
   return name.compareTo(targetKey);
 }
 
 public void setName(String name){
   this.name = name;
 }
 
 public void input(){
   name = JOptionPane.showInputDialog("Enter a name");
   id = Integer.parseInt(JOptionPane.showInputDialog("Enter an id"));
   gpa = Double.parseDouble(JOptionPane.showInputDialog("Enter a gpa"));
 }
}