package com.clean_architecture.tronnv.presentationlayer.presenters.impl;

import android.os.AsyncTask;

import com.clean_architecture.tronnv.presentationlayer.common.Util;
import com.clean_architecture.tronnv.presentationlayer.model.MainUseCases;
import com.clean_architecture.tronnv.presentationlayer.presenters.MainPresenter;
import com.clean_architecture.tronnv.presentationlayer.ui.BaseView;
import com.clean_architecture.tronnv.models.BalladMusic;
import com.clean_architecture.tronnv.models.PopMusic;

import java.util.UUID;

public class MainPresenterImpl implements MainPresenter {

    private UUID uuid;
    private BaseView baseView;
    private MainUseCases model;


    public MainPresenterImpl(BaseView baseView){
        this.baseView = baseView;
        this.model = new MainUseCases();
        this.uuid = UUID.randomUUID();
    }
    @Override
    public void requestPopMusic() {
        new AsyncTask<Void, Void, PopMusic>(){

            @Override
            protected PopMusic doInBackground(Void... voids) {
                Util.simulateNetworkLatency(1000);
                return model.getPopMusic();
            }

            @Override
            protected void onPostExecute(PopMusic popMusic) {
                super.onPostExecute(popMusic);
                baseView.postPopMusic(popMusic.getName());
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    }

    @Override
    public void requestBalladMusic() {
        new AsyncTask<Void, Void, BalladMusic>(){

            @Override
            protected BalladMusic doInBackground(Void... voids) {
                Util.simulateNetworkLatency(2000);
                return model.getBalladMusic();
            }

            @Override
            protected void onPostExecute(BalladMusic balladMusic) {
                super.onPostExecute(balladMusic);
                baseView.postBalladMusic(balladMusic.getName());
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    }
}
