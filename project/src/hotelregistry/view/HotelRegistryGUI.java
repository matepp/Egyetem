package hotelregistry.view;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;

import javax.swing.JButton;
import javax.swing.JFrame;

import hotelregistry.controller.HotelRegistryController;
import hotelregistry.model.bean.User;
import hotelregistry.view.panels.HotelRegistryLogin;

public class HotelRegistryGUI {

    private final HotelRegistryController controller;
    private JFrame window;
    private Container currentContainer;
    private User currentUser;
    private final int WIDTH;
    private final int HEIGHT;

    public HotelRegistryGUI(HotelRegistryController controller) {
        this.controller = controller;
        WIDTH = 800;
        HEIGHT = 600;
    }

    public void startGUI() {
        javax.swing.SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private void createAndShowGUI() {

        //TODO VIEW: Kozepre kellene helyezni megnyilaskor, mert alapertelmezetten
        //a bal felso sarokban nyilik meg.
        window = new JFrame(controller.getLabel("mainWindowTitle"));
        window.setSize(WIDTH, HEIGHT);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        centreWindow(window);
        
        setActualContent(new HotelRegistryLogin(this));

    }

    public void setActualContent(Container container) {
        if (currentContainer != null) {
            window.remove(currentContainer);
        }
        window.add(container);
        currentContainer = container;

        window.setVisible(true);
    }

    public JFrame getWindow() {
        return window;
    }

    public HotelRegistryController getController() {
        return controller;
    }

    public JButton createButton(String title) {
        JButton b = new JButton(title);
        b.setBackground(new java.awt.Color(204, 204, 204));
        b.setForeground(new java.awt.Color(102, 102, 102));

        return b;
    }

    public void centreWindow(Container window) {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - window.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - window.getHeight()) / 2);
        window.setLocation(x, y);
    }

    public void setCurrentUser(User user) {
        this.currentUser = user;
    }

    public User getCurrentUser() {
        return this.currentUser;
    }
}
