package hotelregistry.model;

import hotelregistry.controller.HotelRegistryController;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import hotelregistry.model.bean.User;

public class HotelRegistryDAOImpl implements HotelRegistryDAO {

    private HotelRegistryController controller;

    private static final String DBSTRING = "jdbc:oracle:thin:HOTELDB/123456@localhost:1521:XE";
    private static final String SQL_LOGIN = "SELECT * FROM FELHASZNALO WHERE EMAIL = ? AND PASSWORD = ?";
    private static final String CHANGE_PASSWORD = "UPDATE FELHASZNALO SET PASSWORD = ? WHERE ID = ?";

    public HotelRegistryDAOImpl(HotelRegistryController controller) {
        this.controller = controller;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException ex) {
            System.out.println(controller.getLabel("SQLERROR.unavailableDriver"));
        }
    }

    @Override
    public User login(String email, String password) {
        // Ha letezik a megadott mail-pass paros, akkor visszaadja a User
        // objektumot amely tartalmazza a szemelyes adatait.
        // Ha nem letezik, null-t ad vissza.
        Connection conn = null;
        PreparedStatement loginQuery = null;
        User login = null;
        //User login = new User();

        try {
            conn = DriverManager.getConnection(DBSTRING);
            loginQuery = conn.prepareStatement(SQL_LOGIN);
            loginQuery.setString(1, email);
            loginQuery.setString(2, password);

            ResultSet rs = loginQuery.executeQuery();

            if (rs.next()) {
            	
            	login = new User();
            	//System.out.println("Van eredmï¿½ny...");

                login.setName(rs.getString("NEV"));
                login.setPassword(password);
                login.setEmail(email);
                login.setAddress(rs.getString("CIM"));
                login.setAccessLevel(rs.getInt("ACCESS_LEVEL"));
                login.setId(rs.getInt("ID"));
                login.setBirthDate(rs.getDate("SZUL_DATUM"));

            } else {
                return null;

            }

        } catch (SQLException e) {
            System.out.println(controller.getLabel("SQLERROR.failedToExecSQLAction"));
        } finally {
            try {
                if (loginQuery != null) {
                    loginQuery.close();
                }
            } catch (SQLException e) {
                System.out.println(controller.getLabel("SQLERROR.failedToCloseStatement"));
            }

            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                System.out.println(controller.getLabel("SQLERROR.failedToCloseConnection"));
            }

        }

        return login;
    }

    public void changePassword(int id, String oldPassword, String newPassword) {
    	//TODO Model - Visszatérési érték lehetne boolean? True ha sikeres volt a mûvelet, false egyébként.
    	//TODO Model - oldPassword paraméter nincs használva a metódus törzsében - törölhetõ?
    	//TODO View - Reguláris kifejezéssel ellenõrizni hogy elfogadható karaktereket kaptunk, mielõtt meghívod egy Form-ból ezt a metódust! (Jelszónak aZ09 karaketerek elfogadhatóak, email trükkösebb lesz. Írj, ha kell segítség - Aurel). 
        Connection conn = null;
        PreparedStatement changePasswordQuery = null;

        try {
            conn = DriverManager.getConnection(DBSTRING);
            changePasswordQuery = conn.prepareStatement(CHANGE_PASSWORD);
            changePasswordQuery.setString(1, newPassword);
            changePasswordQuery.setInt(2, id);

            changePasswordQuery.executeUpdate();

        } catch (SQLException e) {
            System.out.println(controller.getLabel("SQLERROR.failedToExecSQLAction"));
        } finally {
            try {
                if (changePasswordQuery != null) {
                    changePasswordQuery.close();
                }
            } catch (SQLException e) {
                System.out.println(controller.getLabel("SQLERROR.failedToCloseStatement"));
            }

            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                System.out.println(controller.getLabel("SQLERROR.failedToCloseConnection"));
            }

        }
    }
}
