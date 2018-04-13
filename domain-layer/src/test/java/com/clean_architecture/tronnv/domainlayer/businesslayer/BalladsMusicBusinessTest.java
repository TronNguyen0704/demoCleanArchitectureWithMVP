package com.clean_architecture.tronnv.domainlayer.businesslayer;

import com.clean_architecture.tronnv.domainlayer.businesslayer.impl.BalladsMusicBusinessImpl;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class BalladsMusicBusinessTest {
    private BalladsMusicBusinessImpl balladBusiness;
    @Before
    public void setUp(){
        balladBusiness = new BalladsMusicBusinessImpl();
    }
    @After
    public void tearDown(){
        balladBusiness = null;
    }
    @Test
    public void getBallad(){
        assertNotNull(balladBusiness.getRandomBalladMusic());
    }
}
