/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdynamicpanel;

import V.Main;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Rumesh Dananjaya
 */
public class JDynamicPanel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         try {
            // TODO code application logic here
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new Main().setVisible(true);
           
        } catch (ClassNotFoundException ex) {
         
        } catch (InstantiationException ex) {
            
        } catch (IllegalAccessException ex) {
            
        } catch (UnsupportedLookAndFeelException ex) {
            
        }
    }
    
}
