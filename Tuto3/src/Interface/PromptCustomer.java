package Interface;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Backend.Customer;

public class PromptCustomer extends JFrame {

	private final PromptCustomer THIS = this;
	private Container c;
	private JPanel central;
	private JLabel question;
	private JTextField answer;
	private JButton confirm;
	private Customer customer;
	
	public PromptCustomer(Customer cust) {
		
		super("Selling Vehicle");

		customer = cust;
		c=this.getContentPane();
        this.setPreferredSize(new Dimension(300,150));
        c.setLayout(new GridLayout(3, 1));

		question = new JLabel("Who buys the Vehicle ?");
		this.add(question);
		answer = new JTextField();
		this.add(answer);
		confirm = new JButton("OK");
		confirm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a)
            {
            	if (answer.getText()!="" && answer.getText()!=null)
            		customer.setName(answer.getText());
                THIS.setVisible(false);
            	THIS.dispose();
            }

    });
		this.add(confirm);
		
		// Toujours à la fin !!!!!!!
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.pack();
        this.setVisible(true);
		
	}

}
