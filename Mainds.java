import javax.swing.JOptionPane;
class Main{  
  public static void main(String args[]){
      String result;
   result=JOptionPane.showInputDialog("Please enter your name:");
   JOptionPane.showMessageDialog(null,"Hi "+ result + "!");
   System.exit(0);
    }  
}  