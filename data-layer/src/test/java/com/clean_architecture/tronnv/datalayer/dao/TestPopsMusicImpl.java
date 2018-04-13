package com.clean_architecture.tronnv.datalayer.dao;

import com.clean_architecture.tronnv.datalayer.dao.base.PopsMusicDao;
import com.clean_architecture.tronnv.datalayer.dao.impl.PopsMusicDaoImpl;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertNotNull;

public class TestPopsMusicImpl {
    private PopsMusicDao dao;
    private int id;

    @Before
    public void setUp() {
        dao = new PopsMusicDaoImpl();
        id = new Random().nextInt(14);
    }

    @After
    public void tearDown() {
        dao = null;
    }

    @Test
    public void whenIdCorrectGetPopMusicById() {
        assertNotNull(dao.getPopMusicById(id));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void whenIdWrongThrowException() {
        dao.getPopMusicById(-1);
    }
}
