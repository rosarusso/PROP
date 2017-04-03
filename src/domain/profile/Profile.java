package domain.profile;
/**
 * @version 1.0
 */
public class Profile {
    private String name;
    private String surname;
    private String secondSurname;
    private int dni;
    private String country;
    private String address;
    private int postcode;
    private String province;
    private String email;
    private int phoneNumber;
    /**
     * Default builder.
     */
    public Profile () {
        this.name = "";
        this.surname = "";
        this.secondSurname = "";
        this.dni = -1;
        this.country = "";
        this.address = "";
        this.postcode = -1;
        this.province = "";
        this.email = "";
        this.phoneNumber = -1;
    }

    /**
     * Complete builder.
     *
     * @param name Profile name.
     * @param surname Surname of the profile.
     * @param secondSurname Second surname of the profile.
     * @param dni Identity card profile.
     * @param country Country name of the profile.
     * @param address Profile address.
     * @param postcode Postal code of the profile.
     * @param province Profile province.
     * @param email Profile Email.
     * @param phoneNumber Profile phone number
     */

    public Profile(String name, String surname, String secondSurname, int dni, String country, String address, int postcode, String province, String email, int phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.secondSurname = secondSurname;
        this.dni = dni;
        this.country = country;
        this.address = address;
        this.postcode = postcode;
        this.province = province;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    /**
     * Name consultant.
     *
     * @return Profile name.
     */
    public String getName() {
        return name;
    }
    /**
     * Name modifier.
     *
     * @param name New name.
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Surname consultant.
     *
     * @return Surname of the profile.
     */
    public String getSurname() {
        return surname;
    }
    /**
     * Surname modifier.
     *
     * @param surname New surname.
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }
    /**
     * Second surname consultant.
     *
     * @return Second surname of the profile.
     */
    public String getSecondSurname() {
        return secondSurname;
    }
    /**
     * Second surname modifier.
     *
     * @param secondSurname New second surname.
     */
    public void setSecondSurname(String secondSurname) {
        this.secondSurname = secondSurname;
    }
    /**
     * Dni consultant.
     *
     * @return Identity card profile.
     */
    public int getDni (){
        return dni;
    }
    /**
     * Dni modifier.
     *
     * @param dni New identity card profile.
     */
    public void setDni(int dni) {
        this.dni = dni;
    }
    /**
     * Country consultant.
     *
     * @return Country name of the profile.
     */
    public String getCountry() {
        return country;
    }
    /**
     * Country modifier.
     *
     * @param country New country name of the profile.
     */
    public void setCountry(String country) {
        this.country = country;
    }
    /**
     * Address consultant.
     *
     * @return Profile address.
     */
    public String getAddress () {
        return address;
    }
    /**
     * Country modifier.
     *
     * @param address New profile address.
     */
    public void setAdress(String address) {
        this.address = address;
    }
    /**
     * Postal code consultant.
     *
     * @return Postal code of the profile.
     */
    public int getPostcode () {
        return postcode;
    }
    /**
     * Postal code modifier.
     *
     * @param postcode New postal code of the profile.
     */
    public void setPostcode (int postcode){
        this.postcode = postcode;
    }
    /**
     * Province consultant.
     *
     * @return Profile province.
     */
    public String getProvince () {
        return province;
    }
    /**
     * Province modifier.
     *
     * @param province New profile province.
     */
    public void setProvince (String province){
        this.province = province;
    }
    /**
     * Email consultant.
     *
     * @return Profile Email.
     */
    public String getEmail () {
        return email;
    }
    /**
     * Email modifier.
     *
     * @param email New profile email.
     */
    public void setEmail (String email) {
        this.email = email;
    }
    /**
     * Phone number consultant.
     *
     * @return Profile phone number
     */
    public int getPhoneNumber() {
        return phoneNumber;
    }
    /**
     * Phone number modifier.
     *
     * @param phoneNumber Profile phone number
     */
    public void setPhoneNumber (int phoneNumber){
        this.phoneNumber = phoneNumber;
    }
}
