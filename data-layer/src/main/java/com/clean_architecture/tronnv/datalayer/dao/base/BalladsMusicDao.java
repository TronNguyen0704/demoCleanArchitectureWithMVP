package com.clean_architecture.tronnv.datalayer.dao.base;

import com.clean_architecture.tronnv.models.BalladMusic;

public interface BalladsMusicDao {
    BalladMusic getBalladMusicById(int id);
}
