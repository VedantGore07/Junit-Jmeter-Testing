package com.infosys.entity;

import com.infosys.DAO.ILoginDAO;
import com.infosys.service.ILoginMgmtService;

public class LoginMgmtServiceImpl implements ILoginMgmtService {

    private ILoginDAO LoginDAO;

    public LoginMgmtServiceImpl(ILoginDAO LoginDAO)
    {
        this.LoginDAO = LoginDAO;
    }

    @Override
    public boolean login(String username, String password) {
        if((username.equals("")) || (password.equals("")))
            throw new IllegalArgumentException("empty credentials");

        int count = LoginDAO.authenticate(username, password);

        if(count == 0)
        return false;
        else
            return true;
    }

    @Override
    public int addUser(String user, String role) {
        return 0;
    }

    @Override
    public String registerUser(String user, String role) {
        if((role.equalsIgnoreCase("")) && (!role.equalsIgnoreCase("visitor")))
        {
            LoginDAO.addUser(user, role);
            return "UserAddded";
        }
        else{
            return "User not added";
        }
       
    }

}
