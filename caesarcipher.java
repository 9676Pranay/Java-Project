import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.regex.*; 

class Project extends JFrame
{
	JLabel j1,j2,j3,j4;
	JTextField jt1,jt2,jt3;
	JButton jb1,jb2,jb3;
	Project()
	{
		super("My First Swing");
		
		j1=new JLabel("~~ Hlooo user Welcome to Caesar Cipher ~~");
		j2=new JLabel("Enter the text here:");
		j3=new JLabel("Enter the shift key:");
		j4=new JLabel("Encrypted/Decrypted text:");
		

		jb1=new JButton("Encrypt");
		jb2=new JButton("Decrypt");
		jb3=new JButton("clear all");

		jt1=new JTextField();
		jt2=new JTextField();
		jt3=new JTextField();

		jb1.setBounds(400,100,100,50);
		jb2.setBounds(400,200,100,50);
		jb3.setBounds(400,280,100,50);

		jt1.setBounds(50,100,300,80);
		jt2.setBounds(50,200,100,50);
		jt3.setBounds(100,280,300,50);

		j1.setBounds(50,20,400,50);
		j2.setBounds(50,40,300,100);
		j3.setBounds(50,140,300,100);
		j4.setBounds(100,250,300,50);

		this.add(j1);
		this.add(j2);
		this.add(j3);
		this.add(j4);

		this.add(jt1);
		this.add(jt2);
		this.add(jt3);

		this.add(jb1);
		this.add(jb2);
		this.add(jb3);

		
		jb1.addActionListener(new ActionListener(){

				public void actionPerformed(ActionEvent ae)
				{
					
					String plaintext;

					plaintext=jt1.getText();					

					int shift=Integer.parseInt(jt2.getText());
        				String ciphertext = "";
        				char alphabet;
        				for(int i=0; i < plaintext.length();i++) 
       			 	{
             																
            				alphabet = plaintext.charAt(i);
            
            																
           					 if(alphabet >= 'a' && alphabet <= 'z') 
            				 {
             										
             					alphabet = (char) (alphabet + shift);
            										 
            					 if(alphabet > 'z') 
							 {
                										
                						alphabet = (char) (alphabet+'a'-'z'-1);
            					 }
             					ciphertext = ciphertext + alphabet;
            				 }
            
            										
           					 else if(alphabet >= 'A' && alphabet <= 'Z')
						 {
             												
             					alphabet = (char) (alphabet + shift);    
                
            										 
             					if(alphabet > 'Z') 
							{
                										 
                 						alphabet = (char) (alphabet+'A'-'Z'-1);
             					}
            					 ciphertext = ciphertext + alphabet;
           				  }
		
            				else 
						{
            					 ciphertext = ciphertext + alphabet;   
           				}
        
  					  }
    					
					jt3.setText(ciphertext);
				}

			});



		
		jb2.addActionListener(new ActionListener(){

				public void actionPerformed(ActionEvent ae)
				{
					String ciphertext1;

					ciphertext1=jt1.getText();					

					int shift1=Integer.parseInt(jt2.getText());
        				String decryptMessage = "";
        				//char alphabet1;

					for(int i=0; i < ciphertext1.length();i++)  
        				{
            													
            				char alphabet1 = ciphertext1.charAt(i);
            													 
            				if(alphabet1 >= 'a' && alphabet1 <= 'z')
            				{
                													
                					alphabet1 = (char) (alphabet1 - shift1);
            
                													
                					if(alphabet1 < 'a') 
							{
                    												
                   					 alphabet1 = (char) (alphabet1-'a'+'z'+1);
                					}		
                					decryptMessage = decryptMessage + alphabet1;
            				}    
               													 
           					else if(alphabet1 >= 'A' && alphabet1 <= 'Z')
            				{
             													
                					alphabet1 = (char) (alphabet1 - shift1);
                
                													
                					if (alphabet1 < 'A') 
							{
                    												
                   					 alphabet1 = (char) (alphabet1-'A'+'Z'+1);
               					}
                					decryptMessage = decryptMessage + alphabet1;            
            				}

            				else 
            				{
             					decryptMessage = decryptMessage + alphabet1;            
            				} 
        				}

					jt3.setText(decryptMessage);
				}
			});
			


		jb3.addActionListener(new ActionListener(){

				public void actionPerformed(ActionEvent ae)
				{	jt1.setText("");
					jt2.setText("");
					jt3.setText("");
				}
			});



		this.setSize(600,400);
		this.setLayout(null);
		//this.setBackgroundColor(blue);
		this.setVisible(true);
	}
	
public static void main(String args[])
	{
		new Project();
	}
}


