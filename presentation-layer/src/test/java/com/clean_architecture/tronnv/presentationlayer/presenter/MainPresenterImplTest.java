package com.clean_architecture.tronnv.presentationlayer.presenter;

import com.clean_architecture.tronnv.presentationlayer.presenters.impl.MainPresenterImpl;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;

public class MainPresenterImplTest {
    private MainPresenterImpl presenter;

    @Before
    public void setUp() {
        presenter = mock(MainPresenterImpl.class);
    }

    @After
    public void tearDown() {
        presenter = null;
    }

    @Test
    public void requestBalladMusic() {
        doNothing().when(presenter).requestBalladMusic();
        presenter.requestBalladMusic();
    }

    @Test
    public void requestPopMusic() {
        doNothing().when(presenter).requestPopMusic();
        presenter.requestPopMusic();
    }
}
