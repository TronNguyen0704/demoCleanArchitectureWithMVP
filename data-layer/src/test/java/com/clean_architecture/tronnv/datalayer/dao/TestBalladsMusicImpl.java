package com.clean_architecture.tronnv.datalayer.dao;

import com.clean_architecture.tronnv.datalayer.dao.base.BalladsMusicDao;
import com.clean_architecture.tronnv.datalayer.dao.impl.BalladsMusicDaoImpl;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertNotNull;

public class TestBalladsMusicImpl {
    private BalladsMusicDao dao;
    private int id;

    @Before
    public void setUp() {
        dao = new BalladsMusicDaoImpl();
        id = new Random().nextInt(14);
    }

    @After
    public void tearDown() {
        dao = null;
    }
    @Test
    public void whenIdCorrectGetBalladMusicById() {
        assertNotNull(dao.getBalladMusicById(id));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void whenIdWrongThrowException() {
        dao.getBalladMusicById(-1);
    }
}
