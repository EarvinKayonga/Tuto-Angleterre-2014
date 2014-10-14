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
        private final ShowroomFrame THIS=this;
	private Container c;
	private JButton previous, next, sell;
	private JLabel manufacturer, model, vin, manufdate, cost, taxband, co2, sold, solddate, customer;
	private JPanel upper, downer;
    private Showroom showroom;
        
    private static final String MANUFACTURER="Manufacturer:", MODEL="Model:", VIN ="V.ID:",
    		MANUFDATE = "Manuf. Date:", COST = "Cost:", TAXBAND = "Tax Band:", CO2 = "CO2:",
    		SOLD = "Sold:", SOLDDATE = "Sold Date:", CUSTOMER = "Customer:";
    private int index;
	
	
	public ShowroomFrame(String titre, Showroom sr)
	{
		super(titre);
                
		if (sr!=null) {
                    this.showroom=sr;
                    index=0;
                    
                    c=this.getContentPane();

                    this.setPreferredSize(new Dimension(500,200));

                    this.setLayout(new BorderLayout());

                    downer = new JPanel();
                    downer.setPreferredSize(new Dimension(500,20));
                    downer.setLayout(new GridLayout(1,3));
                    this.add(downer, BorderLayout.SOUTH);

                    previous = new JButton();
                    previous.setText("< Previous");
                    previous.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent a)
                            {
                            		decreaseIndex();
                                    displayIndex();
                                    THIS.validate();
                                    THIS.repaint();
                            }

                    });
                    downer.add(previous, BorderLayout.WEST);

                    sell = new JButton();
                    sell.setText("Sell");
                    sell.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent a)
                            {
                            	Customer cust = new Customer("" , "", "", "");
                            	PromptCustomer popup = new PromptCustomer(cust);
                            	showroom.buyVehicule(showroom.getAt(index), cust);
                            	THIS.validate();
                            	THIS.repaint();
                            }

                    });
                    downer.add(sell, BorderLayout.CENTER);

                    next = new JButton();
                    next.setText("Next >");
                    next.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent a)
                            {
                                    increaseIndex();
                                    displayIndex();
                                    THIS.validate();
                                    THIS.repaint();
                            }

                    });
                    downer.add(next, BorderLayout.EAST);

                    upper = new JPanel();
                    upper.setPreferredSize(new Dimension(500,180));
                    upper.setLayout(new GridLayout(6,2));
                    this.add(upper, BorderLayout.NORTH);

                    displayIndex();

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
                    this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    this.pack();
                    this.setVisible(true);
                } else {
                    System.err.println("ERREUR Showroom");
                    System.exit(1);
                }
	}
	
	private void increaseIndex() {
		index = (index+1)%showroom.getMaxVehicles(); 
	}
	
	private void decreaseIndex() {
		index = (index-1)%showroom.getMaxVehicles();
	}
	
	private void displayIndex() {
		Vehicle v = showroom.getAt(index);
		manufacturer = new JLabel(MANUFACTURER+" "+v.getManufacturer());
        model = new JLabel(MODEL+" "+v.getModel());
        vin = new JLabel(VIN+" "+v.getVid());
        manufdate = new JLabel(MANUFDATE+" "+v.getManufDate());
        cost = new JLabel(COST+" "+v.getCost());
        taxband = new JLabel(TAXBAND+" "+v.getTaxBand());
        co2 = new JLabel(CO2+" "+v.getBand());
        if (v.isSold()) {
        	sold = new JLabel(SOLD+" "+"Yes");
        	solddate = new JLabel(SOLDDATE+" "+v.getSellDate());
        	customer = new JLabel(CUSTOMER+" "+	v.getCustomer().getName());
        } else {
        	sold = new JLabel(SOLD+" "+"No");
        	solddate = new JLabel(SOLDDATE+" -");
        	customer = new JLabel(CUSTOMER+" -");
        }
	
	}
	
	public ShowroomFrame(Showroom sr)
	{
		this("Showroom", sr);
	}
	
}
