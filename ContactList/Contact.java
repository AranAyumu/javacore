package ContactList;

public class Contact {
    private String phoneNumber;
    private String phoneName;
    private int id;
    static int autoPlusId;

    public int getId() {
        return id;
    }


    public Contact(String phoneNumber, String phoneName){
        this.phoneNumber = phoneNumber;
        this.phoneName = phoneName;
        id = ++autoPlusId;
    }
    public Contact(String phoneNumber){
        this.phoneNumber = phoneNumber;
        this.phoneName = phoneNumber;
        id = ++autoPlusId;
    }
    public Contact(){
        id = ++autoPlusId;
    }


    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void display(){
        System.out.println("ID: "+ id + " ||Phone name: " + phoneName + " || Phone number: " + phoneNumber);
    }
}
