package com.clean_architecture.tronnv.presentationlayer.presenters;

import com.clean_architecture.tronnv.presentationlayer.presenters.base.Presenter;

public interface MainPresenter extends Presenter {
    void requestPopMusic();
    void requestBalladMusic();
}
