package com.company;

public class Contact {
    public String name;
    public String phone;
    public String email;

    public String getContactDetails(){
        return name + " " + phone + " " + email;
    }

    public void updateContactDetails(String contactDetail){
            this.email = contactDetail;
    }
}
