
package hotelregistry.controller;


public class Settings {
    private short passwordMinLength;
    private short passwordMaxLength;
    
    public Settings()
    {
        passwordMinLength = 4;
        passwordMaxLength = 20;
    }

    /**
     * @return the passwordMinLength
     */
    public short getPasswordMinLength() {
        return passwordMinLength;
    }

    /**
     * @param passwordMinLength the passwordMinLength to set
     */
    public void setPasswordMinLength(short passwordMinLength) {
        this.passwordMinLength = passwordMinLength;
    }

    /**
     * @return the passwordMaxLength
     */
    public short getPasswordMaxLength() {
        return passwordMaxLength;
    }

    /**
     * @param passwordMaxLength the passwordMaxLength to set
     */
    public void setPasswordMaxLength(short passwordMaxLength) {
        this.passwordMaxLength = passwordMaxLength;
    }
    
    
}
