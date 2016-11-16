package hotelregistry.view.menubars;

import hotelregistry.view.HotelRegistryGUI;
import hotelregistry.view.panels.HotelRegistryLogin;
import hotelregistry.view.panels.UserDetails;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class StatusBar extends JMenuBar {

    @SuppressWarnings("OverridableMethodCallInConstructor")
    private final JMenu logout;
    private final JMenu userName;
    private final HotelRegistryGUI mainGUI;

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public StatusBar(HotelRegistryGUI mainGUI, String username) {
        this.mainGUI = mainGUI;
        add(Box.createHorizontalGlue());
        add(new JLabel(mainGUI.getController().getLabel("StatusBar.LoggedIn") + " "));
        userName=new JMenu(username);
        userName.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userNameClicked(evt);
            }
        });
        add(userName);

        logout = new JMenu();
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/door.png")));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutClicked(evt);
            }
        });
        add(logout);
        

    }

    private void userNameClicked(java.awt.event.MouseEvent evt) {
        mainGUI.setActualContent(new UserDetails(mainGUI));
    }
    private void logoutClicked(java.awt.event.MouseEvent evt) {
        mainGUI.getWindow().setJMenuBar(null);
        mainGUI.getWindow().getContentPane().removeAll();
        mainGUI.setActualContent(new HotelRegistryLogin(mainGUI));
        mainGUI.setCurrentUser(null);
    }

}
