/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author charly
 */
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

import Backend.*;

public class ShowroomFrame extends JFrame 
{	
        private JFrame THIS=this;
	private Container c;
	private JButton previous, next, sell;
	private JLabel manufacturer, model, vin, manufdate, cost, taxband, co2, sold, solddate, customer;
	private JPanel upper, downer;
        private Showroom sr;
	
	
	public ShowroomFrame(String titre, Showroom sr)
	{
		super(titre);
                
		if (sr!=null) {
                    this.sr=sr;
                    
                    c=this.getContentPane();

                    this.setPreferredSize(new Dimension(500,200));

                    c.setLayout(new BorderLayout());

                    downer = new JPanel();
                    downer.setPreferredSize(new Dimension(500,20));
                    downer.setLayout(new GridLayout(1,3));
                    this.add(downer, BorderLayout.SOUTH);

                    previous = new JButton();
                    previous.setText("< Previous");
                    previous.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent a)
                            {
                                    //blah
                                    THIS.repaint();
                            }

                    });
                    downer.add(previous, BorderLayout.WEST);

                    sell = new JButton();
                    sell.setText("Sell");
                    sell.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent a)
                            {
                                    //blah
                                    THIS.repaint();
                            }

                    });
                    downer.add(sell, BorderLayout.CENTER);

                    next = new JButton();
                    next.setText("Next >");
                    next.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent a)
                            {
                                    //blah
                                    THIS.repaint();
                            }

                    });
                    downer.add(next, BorderLayout.EAST);

                    upper = new JPanel();
                    upper.setPreferredSize(new Dimension(500,180));
                    upper.setLayout(new GridLayout(6,2));
                    this.add(upper, BorderLayout.NORTH);

                    manufacturer = new JLabel("Manufacturer:");
                    model = new JLabel("Model:");
                    vin = new JLabel("V.ID:");
                    manufdate = new JLabel("Manuf. Date:");
                    cost = new JLabel("Cost:");
                    taxband = new JLabel("Tax Band:");
                    co2 = new JLabel("CO2:");
                    sold = new JLabel("Sold:");
                    solddate = new JLabel("Sold Date:");
                    customer = new JLabel("Customer:");

                    upper.add(manufacturer);
                    upper.add(model);
                    upper.add(vin);
                    upper.add(manufdate);
                    upper.add(cost);
                    upper.add(taxband);
                    upper.add(co2);
                    upper.add(sold);
                    upper.add(solddate);
                    upper.add(customer);


                    // Toujours à la fin !!!!!!!
                    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    this.pack();
                    this.setVisible(true);
                } else {
                    System.err.println("ERREUR Showroom");
                    System.exit(1);
                }
	}
	
	public ShowroomFrame(Showroom sr)
	{
		this("Showroom", sr);
	}
	
}
