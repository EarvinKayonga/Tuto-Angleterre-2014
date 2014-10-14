/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4.pkg3;

import com.sun.rowset.WebRowSetImpl;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.rowset.WebRowSet;

/**
 *
 * @author charly
 */
public class TP43 {

    public static void testWebRowSet() throws SQLException, IOException {
        FileReader fReader = null;
        FileWriter fWriter = null;
        String priceListFileName = "pricelist.xml";
        int[] keyCols = {1};
        WebRowSet priceList = new WebRowSetImpl();
        priceList.setUsername("username");
        priceList.setPassword("password");
        priceList.setUrl("jdbc:derby://localhost:1527/FOOP");
        priceList.setCommand("select * from item");
        priceList.setKeyColumns(keyCols);
        // Populate the WebRowSet
        priceList.execute();
        System.out.println("Size of the WebRowSet is: " + priceList.size());
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            TP43.testWebRowSet();
        } catch (SQLException ex) {
            Logger.getLogger(TP43.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TP43.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
