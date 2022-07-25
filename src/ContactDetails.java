import java.io.Serializable;

public class ContactDetails implements Serializable {
    private String houseNumber;
    private String localityName;
    private String cityName;
    private String countryName;
    private long pinCode;
    private long mobileNumber;

    private String emailId;

    public ContactDetails() {
    }

    public ContactDetails(String houseNumber, String localityName, String cityName, String countryName, long pinCode, long mobileNumber) {
        this.houseNumber = houseNumber;
        this.localityName = localityName;
        this.cityName = cityName;
        this.countryName = countryName;
        this.pinCode = pinCode;
        this.mobileNumber = mobileNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getLocalityName() {
        return localityName;
    }

    public void setLocalityName(String localityName) {
        this.localityName = localityName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public long getPinCode() {
        return pinCode;
    }

    public void setPinCode(long pinCode) {
        this.pinCode = pinCode;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}
