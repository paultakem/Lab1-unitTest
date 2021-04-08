package com.company;

public class Database implements DBInterface{
    @Override
    public boolean connect(String address, String userName, String password) {
        System.out.println("Connect method is called");
        return false;
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnect method is called");
    }

    @Override
    public boolean isConnected() {
        System.out.println("isConnected method is called");
        return false;
    }

    @Override
    public String getName(int id) {
        System.out.println("getName method is called");
        return "some name returned";
    }
}
