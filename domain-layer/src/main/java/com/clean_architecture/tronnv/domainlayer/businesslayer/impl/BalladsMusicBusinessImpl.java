package com.clean_architecture.tronnv.domainlayer.businesslayer.impl;

import com.clean_architecture.tronnv.datalayer.dao.base.BalladsMusicDao;
import com.clean_architecture.tronnv.datalayer.dao.impl.BalladsMusicDaoImpl;
import com.clean_architecture.tronnv.domainlayer.businesslayer.base.BalladsMusicBusiness;
import com.clean_architecture.tronnv.models.BalladMusic;

import java.util.Random;

public class BalladsMusicBusinessImpl implements BalladsMusicBusiness {
    private BalladsMusicDao dao;
    public BalladsMusicBusinessImpl(){
        dao = new BalladsMusicDaoImpl();
    }

    @Override
    public BalladMusic getRandomBalladMusic() {
        int id = new Random().nextInt(14);
        return dao.getBalladMusicById(id);
    }
}
