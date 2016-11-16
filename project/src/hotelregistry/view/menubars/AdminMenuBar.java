package hotelregistry.view.menubars;

import hotelregistry.view.HotelRegistryGUI;
import java.awt.GridLayout;
import javax.swing.JToolBar;

public class AdminMenuBar extends JToolBar {

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public AdminMenuBar(HotelRegistryGUI mainGUI) {
        add(mainGUI.createButton(mainGUI.getController().getLabel("StandardMenuBar.Accomodations")));
        add(mainGUI.createButton(mainGUI.getController().getLabel("StandardMenuBar.Programs")));
        add(mainGUI.createButton(mainGUI.getController().getLabel("StandardMenuBar.Meals")));
        add(mainGUI.createButton(mainGUI.getController().getLabel("StandardMenuBar.Wellness")));

        setLayout(new GridLayout(getComponentCount(), 1));
        setFloatable(false);
    }
}
