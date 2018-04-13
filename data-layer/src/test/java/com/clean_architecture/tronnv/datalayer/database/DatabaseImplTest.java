package com.clean_architecture.tronnv.datalayer.database;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertNotNull;

public class DatabaseImplTest {

    private DatabaseImpl database;
    private int id;

    @Before
    public void setUp() {
        database = DatabaseImpl.getInstance();
    }

    @After
    public void tearDown() {
        id = new Random().nextInt(14);
    }

    @Test
    public void whenCorrectIdGetPopMusicFromDatabase() {
        assertNotNull(database.getPopMusicById(id));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void whenWrongIdForPopThrowExpectedException() {
        database.getPopMusicById(16);
    }

    @Test
    public void whenCorrectIdGetBalladMusicFromDatabase() {
        assertNotNull(database.getBalladMusicById(id));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void whenWrongIdForBalladThrowExpectedException() {
        database.getBalladMusicById(-1);
    }
}
