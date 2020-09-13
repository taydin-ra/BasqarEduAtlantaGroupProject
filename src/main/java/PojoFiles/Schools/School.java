package PojoFiles.Schools;

import java.util.List;

public class School {

    private String id;
    private String name;
    private String shortName;
    private List<TranslateName> translateName;
    private Address address;
    private ContactInfo contactInfo;
    private boolean active;
    private MailServer mailServer;
    private SmsServer smsServer;
    private String timeZone;
    private String currency;
    private String phoneMask;
    private String language;
    private List<SalaryConstants> salaryConstants;
    private List<Constants> constants;
    private BbbServerSettings bbbServerSetting;
    private boolean isBBBServerEnabled;
    private String payPalSettings;
  //  private boolean bbbserverEnabled;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public List<TranslateName> getTranslateName() {
        return translateName;
    }

    public void setTranslateName(List<TranslateName> translateName) {
        this.translateName = translateName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public MailServer getMailServer() {
        return mailServer;
    }

    public void setMailServer(MailServer mailServer) {
        this.mailServer = mailServer;
    }

    public SmsServer getSmsServer() {
        return smsServer;
    }

    public void setSmsServer(SmsServer smsServer) {
        this.smsServer = smsServer;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getPhoneMask() {
        return phoneMask;
    }

    public void setPhoneMask(String phoneMask) {
        this.phoneMask = phoneMask;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public List<SalaryConstants> getSalaryConstants() {
        return salaryConstants;
    }

    public void setSalaryConstants(List<SalaryConstants> salaryConstants) {
        this.salaryConstants = salaryConstants;
    }

    public List<Constants> getConstants() {
        return constants;
    }

    public void setConstants(List<Constants> constants) {
        this.constants = constants;
    }

    public BbbServerSettings getBbbServerSetting() {
        return bbbServerSetting;
    }

    public void setBbbServerSetting(BbbServerSettings bbbServerSetting) {
        this.bbbServerSetting = bbbServerSetting;
    }

    public boolean getBBBServerEnabled() {
        return isBBBServerEnabled;
    }

    public void setBBBServerEnabled(boolean BBBServerEnabled) {
        isBBBServerEnabled = BBBServerEnabled;
    }

    public String getPayPalSettings() {
        return payPalSettings;
    }

    public void setPayPalSettings(String payPalSettings) {
        this.payPalSettings = payPalSettings;
    }

//    public boolean getBbbserverEnabled() {
//        return bbbserverEnabled;
//    }
//
//    public void setBbbserverEnabled(boolean bbbserverEnabled) {
//        this.bbbserverEnabled = bbbserverEnabled;
//    }

    @Override
    public String toString() {
        return "School{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", shortName='" + shortName + '\'' +
                ", translateName=" + translateName +
                ", address=" + address +
                ", contactInfo=" + contactInfo +
                ", active=" + active +
                ", mailServer=" + mailServer +
                ", smsServer=" + smsServer +
                ", timeZone='" + timeZone + '\'' +
                ", currency='" + currency + '\'' +
                ", phoneMask='" + phoneMask + '\'' +
                ", language='" + language + '\'' +
                ", salaryConstants=" + salaryConstants +
                ", constants=" + constants +
                ", bbbServerSetting=" + bbbServerSetting +
                ", isBBBServerEnabled=" + isBBBServerEnabled +
                ", payPalSettings='" + payPalSettings + '\'' +
//                ", bbbserverEnabled=" + bbbserverEnabled +
                '}';
    }
}
