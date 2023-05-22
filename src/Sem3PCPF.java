import java.awt.*;
import java.awt.event.*;
import javax.swing.*;   
import javax.swing.JFrame; 
import javax.swing.JScrollPane; 
import javax.swing.JTable;  
public class Sem3PCPF extends JFrame implements ActionListener {    
    JTable j; 
	JLabel lb;
	JButton bt;	
    Sem3PCPF() 
    {   
	    lb =new JLabel(" ");
	    lb.setBounds(50,400, 100,30);
		
		
		bt=new JButton("Back");  
	    bt.setBounds(650,400, 100,30);
	
	
        setTitle("Paradigms and Computer Programming Fundamentals"); 
        
        String[] columnNames = {"Sr. NO", "Author", "Publication", "Price" }; 
        
        String[][] data = { {"   1 ", "   Scott M L ", "   Morgan Kaufmann Publishers ", "   Rs 2500 " },
        	    {"   2 ", "   Ravi Sethi", "   Pearson Education Asia ", "   Rs 699 " }
        };
        
        j = new JTable(data, columnNames); 
        j.setBounds(30, 40, 200, 300);  
        
        JScrollPane sp = new JScrollPane(j); 
		sp.setBounds(0, 0, 1366,55);
		
        add(sp);
		add(lb);
	    lb.add(bt);
		bt.addActionListener(this);
        
        setSize(1366, 768); 
        setVisible(true); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
    } 
	
public void actionPerformed(ActionEvent e)
{
	if(e.getSource()==bt)
{
	 setVisible(false);
     ITsem3 obj8 = new ITsem3();
     obj8.setVisible(true); 
}
}	
	
    public static void main(String[] args) 
    { 
        new Sem3PCPF(); 
    } 
}