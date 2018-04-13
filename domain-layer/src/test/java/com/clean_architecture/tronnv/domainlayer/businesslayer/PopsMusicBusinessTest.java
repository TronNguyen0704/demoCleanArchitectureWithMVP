package com.clean_architecture.tronnv.domainlayer.businesslayer;

import com.clean_architecture.tronnv.domainlayer.businesslayer.impl.PopsMusicBusinessImpl;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class PopsMusicBusinessTest {
    private PopsMusicBusinessImpl popBusiness;
    @Before
    public void setUp(){
        popBusiness = new PopsMusicBusinessImpl();
    }
    @After
    public void tearDown(){
        popBusiness = null;
    }
    @Test
    public void getPop(){
        assertNotNull(popBusiness.getRandomPopMusic());
    }
}
