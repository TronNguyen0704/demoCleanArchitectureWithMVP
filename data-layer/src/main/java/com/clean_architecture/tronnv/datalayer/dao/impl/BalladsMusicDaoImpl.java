package com.clean_architecture.tronnv.datalayer.dao.impl;

import com.clean_architecture.tronnv.datalayer.dao.base.BalladsMusicDao;
import com.clean_architecture.tronnv.datalayer.database.Database;
import com.clean_architecture.tronnv.datalayer.database.DatabaseImpl;
import com.clean_architecture.tronnv.models.BalladMusic;

public class BalladsMusicDaoImpl implements BalladsMusicDao {
    private Database database = DatabaseImpl.getInstance();

    @Override
    public BalladMusic getBalladMusicById(int id) {
        return database.getBalladMusicById(id);
    }
}
