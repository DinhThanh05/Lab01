import javax.swing.JOptionPane;
class Main{  
  public static void main(String args[]){
      String strNum1,strNum2;
      String strNotification="You've just entered: ";
      strNum1=JOptionPane.showInputDialog(null,"Please input the first number: ","Input ther first number",JOptionPane.INFORMATION_MESSAGE);
      strNum2=JOptionPane.showInputDialog(null,"Please input the second number: ","Input ther second number",JOptionPane.INFORMATION_MESSAGE);
   strNotification+=strNum2;
   JOptionPane.showMessageDialog(null,strNotification,"Show two numbers",JOptionPane.INFORMATION_MESSAGE);
   System.exit(0);
    }  
}  