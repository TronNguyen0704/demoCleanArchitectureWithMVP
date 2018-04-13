package com.clean_architecture.tronnv.presentationlayer.ui.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.clean_architecture.tronnv.presentationlayer.R;
import com.clean_architecture.tronnv.presentationlayer.presenters.MainPresenter;
import com.clean_architecture.tronnv.presentationlayer.presenters.impl.MainPresenterImpl;
import com.clean_architecture.tronnv.presentationlayer.ui.BaseView;

public class MainActivity extends AppCompatActivity implements BaseView {

    private ProgressBar progressBarPopMusic;
    private ProgressBar progressBarBalladMusic;
    private EditText editTextPopMusic;
    private EditText editTextBalladMusic;
    private Button buttonGetPopMusic;
    private Button buttonGetBalladMusic;

    private MainPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindView();
        progressBarPopMusic.setVisibility(View.INVISIBLE);
        progressBarBalladMusic.setVisibility(View.INVISIBLE);
        presenter = new MainPresenterImpl(this);
        buttonGetPopMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                requestPopMusic();
            }
        });
        buttonGetBalladMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                requestBalladMusic();
            }
        });
    }
    void bindView(){
        progressBarBalladMusic = findViewById(R.id.progressBarBalladMusic);
        progressBarPopMusic = findViewById(R.id.progressBarPopMusic);
        editTextBalladMusic = findViewById(R.id.edit_txt_ballad_music);
        editTextPopMusic = findViewById(R.id.edit_txt_pop_music);
        buttonGetBalladMusic = findViewById(R.id.btn_get_balladMusic);
        buttonGetPopMusic = findViewById(R.id.btn_get_popMusic);
    }

    @Override
    public void requestPopMusic() {
        enableUiPopMusic(false);
        presenter.requestPopMusic();

    }

    @Override
    public void postPopMusic(String popMusic) {
        enableUiPopMusic(true);
        editTextPopMusic.setText(popMusic);
    }

    @Override
    public void enableUiPopMusic(boolean enable) {
        if (enable) {
            progressBarPopMusic.setVisibility(View.INVISIBLE);
        } else {
            progressBarPopMusic.setVisibility(View.VISIBLE);
        }
        editTextPopMusic.setEnabled(enable);
        buttonGetPopMusic.setEnabled(enable);
    }
    @Override
    public void requestBalladMusic() {
        buttonGetBalladMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enableUiBalladMusic(false);
                presenter.requestBalladMusic();
            }
        });
    }

    @Override
    public void postBalladMusic(String balladMusic) {
        enableUiBalladMusic(true);
        editTextBalladMusic.setText(balladMusic);
    }

    @Override
    public void enableUiBalladMusic(boolean enable) {
        if (enable) {
            progressBarBalladMusic.setVisibility(View.INVISIBLE);
        } else {
            progressBarBalladMusic.setVisibility(View.VISIBLE);
        }
        editTextBalladMusic.setEnabled(enable);
        buttonGetBalladMusic.setEnabled(enable);
    }
}
