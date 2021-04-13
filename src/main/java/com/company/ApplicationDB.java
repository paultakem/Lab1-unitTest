package com.company;

public class ApplicationDB {
    Database database = new Database();

    public void exec(){
        database.connect("http://somedbaddres.com", "admin", "admin123");
        database.disconnect();
        database.isConnected();
        database.getName(1);
    }
}
