package hotelregistry;

import hotelregistry.controller.HotelRegistryController;

public class Main {

	public static void main(String[] args) {
        startApp();
    }

    private static void startApp() {
        HotelRegistryController controller = new HotelRegistryController();
        controller.startDesktop();

        //Teszt arra, hogy sikerul-e kapcsolodni a DB-hez. Helyes mukodes eseten John Kennedy user adatait irjuk a konzolra.
        //System.out.println(controller.Login("fonok@business.com", "BBE21CZR0FY").toString());
    }
    
}
