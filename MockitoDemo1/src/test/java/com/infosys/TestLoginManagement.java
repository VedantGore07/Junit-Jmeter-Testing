package com.infosys;

import com.infosys.DAO.ILoginDAO;
import com.infosys.entity.LoginMgmtServiceImpl;
import com.infosys.service.ILoginMgmtService;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestLoginManagement {

    private static ILoginMgmtService loginService;
    private static ILoginDAO loginDAOMock;

    @BeforeAll
    public static void setUpOnce()
    {
        loginDAOMock = Mockito.mock(ILoginDAO.class);
        loginService = new LoginMgmtServiceImpl(loginDAOMock);
    }

    @AfterAll
    public static void clearOnce()
    {
        loginDAOMock = null;
        loginService = null;
    }

    @Test
    public void testloginWithValidCredentials()
    {
        Mockito.when(loginDAOMock.authenticate("user1","root"))
                .thenReturn(1);
        Assertions.assertTrue(loginService.login("user1", "root"));
    }

    @Test
    public void testloginWithInValidCredentials()
    {
        Mockito.when(loginDAOMock.authenticate("user1","root1"))
                .thenReturn(0);
        Assertions.assertFalse(loginService.login("user1", "root1"));
    }

    @Test
    public void testloginWithNonCredentials()
    {
        assertThrows(IllegalArgumentException.class,
                ()->{ loginService.login("","");}
        );
    }

    public void testRegisterWithSpy()
    {
        ILoginDAO loginDAOSpy = Mockito.spy(ILoginDAO.class);

        ILoginMgmtService loginService = new LoginMgmtServiceImpl(loginDAOSpy);

        loginService.registerUser("Raj", "Admin");
        loginService.registerUser("Aditya", "Visitor");
        loginService.registerUser("Abhi", "");

        Mockito.verify(loginDAOSpy, Mockito.times(1)).addUser("Raj", "Admin");
        Mockito.verify(loginDAOSpy, Mockito.times(0)).addUser("Aditya", "Visitor");
        Mockito.verify(loginDAOSpy, Mockito.never()).addUser("Abhi", "");


    }
}
