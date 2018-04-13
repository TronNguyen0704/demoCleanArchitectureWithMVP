package com.clean_architecture.tronnv.presentationlayer.model;

import com.clean_architecture.tronnv.domainlayer.businesslayer.impl.BalladsMusicBusinessImpl;
import com.clean_architecture.tronnv.domainlayer.businesslayer.impl.PopsMusicBusinessImpl;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class MainUseCasesTest {
    private PopsMusicBusinessImpl popsMusicBusiness;
    private BalladsMusicBusinessImpl balladsMusicBusiness;

    @Before
    public void setUp() {
        popsMusicBusiness = new PopsMusicBusinessImpl();
        balladsMusicBusiness = new BalladsMusicBusinessImpl();
    }

    @After
    public void tearDown() {
        popsMusicBusiness = null;
        balladsMusicBusiness = null;
    }

    @Test
    public void getPopMusic() {
        assertNotNull(popsMusicBusiness.getRandomPopMusic());
    }

    @Test
    public void getBalladMusic() {
        assertNotNull(balladsMusicBusiness.getRandomBalladMusic());
    }
}
