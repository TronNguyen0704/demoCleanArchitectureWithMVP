package com.clean_architecture.tronnv.datalayer.dao.base;

import com.clean_architecture.tronnv.models.PopMusic;

public interface PopsMusicDao {
        PopMusic getPopMusicById(int id);
}
