package com.clean_architecture.tronnv.presentationlayer.model;

import com.clean_architecture.tronnv.domainlayer.businesslayer.base.BalladsMusicBusiness;
import com.clean_architecture.tronnv.domainlayer.businesslayer.impl.BalladsMusicBusinessImpl;
import com.clean_architecture.tronnv.domainlayer.businesslayer.base.PopsMusicBusiness;
import com.clean_architecture.tronnv.domainlayer.businesslayer.impl.PopsMusicBusinessImpl;
import com.clean_architecture.tronnv.models.BalladMusic;
import com.clean_architecture.tronnv.models.PopMusic;

public class MainUseCases {
    private PopsMusicBusiness popsMusicBusiness;
    private BalladsMusicBusiness balladsMusicBusiness;
    public MainUseCases(){
        this.popsMusicBusiness = new PopsMusicBusinessImpl();
        this.balladsMusicBusiness = new BalladsMusicBusinessImpl();
    }
    public PopMusic getPopMusic(){
        return this.popsMusicBusiness.getRandomPopMusic();
    }
    public BalladMusic getBalladMusic(){
        return this.balladsMusicBusiness.getRandomBalladMusic();
    }
}
