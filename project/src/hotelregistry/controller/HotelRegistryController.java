package hotelregistry.controller;


import hotelregistry.model.HotelRegistryDAO;
import hotelregistry.model.HotelRegistryDAOImpl;
import hotelregistry.model.bean.User;
import hotelregistry.view.HotelRegistryGUI;
import java.util.Locale;
import java.util.ResourceBundle;

public class HotelRegistryController {
    private final HotelRegistryDAO dao ;
    private Locale currentLanguage;
    private ResourceBundle labels;
    
    private Settings settings;

    public HotelRegistryController() {
        currentLanguage = new Locale("hu", "HU");
        labels = ResourceBundle.getBundle("Labels", currentLanguage);
        dao = new HotelRegistryDAOImpl(this);
        settings = new Settings();
        
    }
    
    public void startDesktop() {
        HotelRegistryGUI vc = new HotelRegistryGUI(this);
        vc.startGUI();
    }
    
    public String getLabel(String string){
        return labels.getString(string);
    }
    
    public User login(String email, String password)
    {
        return dao.login(email, password);
    }
    
    public void changePassword(int id, String oldPassword, String newPassword)
    {
        dao.changePassword(id, oldPassword, newPassword);
    }
    
    public Settings getSettings(){
        return settings;
    }
}
