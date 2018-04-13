package com.clean_architecture.tronnv.datalayer.dao.impl;

import com.clean_architecture.tronnv.datalayer.dao.base.PopsMusicDao;
import com.clean_architecture.tronnv.datalayer.database.Database;
import com.clean_architecture.tronnv.datalayer.database.DatabaseImpl;
import com.clean_architecture.tronnv.models.PopMusic;

public class PopsMusicDaoImpl implements PopsMusicDao {
    private Database database = DatabaseImpl.getInstance();


    @Override
    public PopMusic getPopMusicById(int id) {
        return database.getPopMusicById(id);
    }
}
