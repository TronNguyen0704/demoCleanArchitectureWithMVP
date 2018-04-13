package com.clean_architecture.tronnv.domainlayer.businesslayer.impl;

import com.clean_architecture.tronnv.datalayer.dao.base.PopsMusicDao;
import com.clean_architecture.tronnv.datalayer.dao.impl.PopsMusicDaoImpl;
import com.clean_architecture.tronnv.domainlayer.businesslayer.base.PopsMusicBusiness;
import com.clean_architecture.tronnv.models.PopMusic;

import java.util.Random;

public class PopsMusicBusinessImpl implements PopsMusicBusiness {
    private PopsMusicDao dao;
    public PopsMusicBusinessImpl(){
        dao = new PopsMusicDaoImpl();
    }
    @Override
    public PopMusic getRandomPopMusic() {
        int id = new Random().nextInt(14);
        return dao.getPopMusicById(id);
    }
}
