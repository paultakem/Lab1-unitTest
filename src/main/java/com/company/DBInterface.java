package com.company;

public interface DBInterface {
    public boolean connect(String address, String userName, String password);
    public void disconnect();
    public boolean isConnected();
    public String getName(int id);
}
