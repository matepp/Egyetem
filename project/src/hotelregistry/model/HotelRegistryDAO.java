package hotelregistry.model;

import hotelregistry.model.bean.User;

public interface HotelRegistryDAO {
	
	public User login(String email, String password);
	
	public void changePassword(int id, String oldPassword, String newPassword);
}
