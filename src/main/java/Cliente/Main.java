/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;
import Cliente.ClientManager;
import Cliente.LoginFrame;
/**
 *
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        ClientManager clientManager=new ClientManager();
        LoginFrame loginFrame=new LoginFrame(clientManager);
        loginFrame.setLocation(400,100);
        loginFrame.setVisible(true);
        // TODO code application logic here
    }

}
