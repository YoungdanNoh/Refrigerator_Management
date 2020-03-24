/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author noyeongdan
 */
public class MoveUrl {
    public void ButtonOpenWebActionPerformed(java.awt.event.ActionEvent evt , String url) {                                         
        try { 
           java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
       }
       catch (java.io.IOException e) {
           System.out.println(e.getMessage());
       }
    }    
}
