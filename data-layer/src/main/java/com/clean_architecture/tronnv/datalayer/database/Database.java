package com.clean_architecture.tronnv.datalayer.database;

import com.clean_architecture.tronnv.models.BalladMusic;
import com.clean_architecture.tronnv.models.PopMusic;

public interface Database {
    PopMusic getPopMusicById(int id);
    BalladMusic getBalladMusicById(int id);
}
