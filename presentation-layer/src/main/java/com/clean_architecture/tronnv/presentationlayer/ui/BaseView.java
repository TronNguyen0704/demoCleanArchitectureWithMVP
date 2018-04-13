package com.clean_architecture.tronnv.presentationlayer.ui;

import com.clean_architecture.tronnv.presentationlayer.presenters.base.Presenter;

public interface BaseView extends Presenter{
    //For PopMusic
    void requestPopMusic();
    void postPopMusic(String popMusic);
    void enableUiPopMusic(boolean enable);

    //For BalladMusic
    void requestBalladMusic();
    void postBalladMusic(String balladMusic);
    void enableUiBalladMusic(boolean enable);
}
