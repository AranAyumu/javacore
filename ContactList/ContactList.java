package ContactList;

import java.util.Arrays;

public class ContactList {
    Contact[] list1 = new Contact[0];
    static int size;

    public ContactList(){}

    public void add(Contact singleOne){
        list1 = Arrays.copyOf(list1, size+1);
        list1[size] = singleOne;
        size++;
    }
    public void displayList(){
        for(int i = 0; i < list1.length; i++){
            list1[i].display();
        }
    }
    public void editName(int index, String newName){
        list1[index].setPhoneName(newName);
    }
    public void editNumber(int index, String newNumber){
        list1[index].setPhoneNumber(newNumber);
    }
    public void deleteContactByName(String name){
        for(int i = 0; i < list1.length; i++){
            if(list1[i].getPhoneName().equals(name)){
                Contact temp = new Contact();
                temp = list1[list1.length - 1];
                list1[list1.length - 1] = list1[i];
                list1[i] = temp;
                list1 = Arrays.copyOf(list1, size -1);
                size = size -1;

            }

        }
    }
    public void deleteContactByPNumber(String pNumber){
        for(int i = 0; i < list1.length; i++){
            if(list1[i].getPhoneNumber().equals(pNumber)){
                Contact temp = new Contact();
                temp = list1[list1.length - 1];
                list1[list1.length - 1] = list1[i];
                list1[i] = temp;
                list1 = Arrays.copyOf(list1, size -1);
                size = size -1;

            }

        }
    }
    public Contact searchById(int id){
        int i = 0;
        while(i<0){
            if(list1[i].getId() == id){
                break;
            }
            else{
                i++;
            }
        }
        return list1[i];
    }
}
