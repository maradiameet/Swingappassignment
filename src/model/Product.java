/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


public class Product {
    private String fName, lName;
    private String TeleNumber, Email; 
    private String age;
    private String Major;
    private String SendPath;
    private String City, Country;
    private String Address;

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getSendPath() {
        return SendPath;
    }

    public void setSendPath(String SendPath) {
        this.SendPath = SendPath;
    }
    private String BrowsedImgPath;

    public String getBrowsedImgPath() {
        return BrowsedImgPath;
    }

    public void setBrowsedImgPath(String BrowsedImgPath) {
        this.BrowsedImgPath = BrowsedImgPath;
    }
    
    public String img_path;

    
    public String getMajor() {
        return Major;
    }

    public void setMajor(String Major) {
        this.Major = Major;
    }


    public String getTeleNumber() {
        return TeleNumber;
    }

    public void setTeleNumber(String TeleNumber) {
        this.TeleNumber = TeleNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

   
    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }
   
    

  

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

   
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    
}
