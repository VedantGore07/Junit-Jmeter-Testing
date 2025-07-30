package com.infosys.DAO;

public interface ILoginDAO {

    public int authenticate(String username,String password);

    void addUser(String user, String role);
}
