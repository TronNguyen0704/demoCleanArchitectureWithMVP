package com.clean_architecture.tronnv.datalayer.database;


import com.clean_architecture.tronnv.models.BalladMusic;
import com.clean_architecture.tronnv.models.PopMusic;
import java.util.ArrayList;
import java.util.List;

/**
 * the data layer is just a dummy singleton implementation for a database
 * Using Singleton pattern
 */
public final class DatabaseImpl implements Database {

    private static DatabaseImpl INSTANCE;

    private List<PopMusic> pops;
    private List<BalladMusic> ballads;

    private DatabaseImpl() {
        initPops();
        initBallads();
    }

    private void initPops() {
        pops = new ArrayList<>();
        pops.add(new PopMusic("Friends"));
        pops.add(new PopMusic("Perfect"));
        pops.add(new PopMusic("Shape of You"));
        pops.add(new PopMusic("Havana"));
        pops.add(new PopMusic("New Rules"));
        pops.add(new PopMusic("Meant To Be"));
        pops.add(new PopMusic("How Long"));
        pops.add(new PopMusic("Sorry"));
        pops.add(new PopMusic("Closer"));
        pops.add(new PopMusic("Roar"));
        pops.add(new PopMusic("Thunder"));
        pops.add(new PopMusic("Listen"));
        pops.add(new PopMusic("Attention"));
        pops.add(new PopMusic("Finesse"));
        pops.add(new PopMusic("Say Something"));
    }

    public static DatabaseImpl getInstance() {
        if (DatabaseImpl.INSTANCE == null) {
            DatabaseImpl.INSTANCE = new DatabaseImpl();
        }
        return DatabaseImpl.INSTANCE;
    }

    private void initBallads() {
        ballads = new ArrayList<>();
        ballads.add(new BalladMusic("Marry Me"));
        ballads.add(new BalladMusic("Lies"));
        ballads.add(new BalladMusic("For You"));
        ballads.add(new BalladMusic("Cry Cry"));
        ballads.add(new BalladMusic("Just Teen Days"));
        ballads.add(new BalladMusic("Run"));
        ballads.add(new BalladMusic("The Any Thing I Can't Do"));
        ballads.add(new BalladMusic("One Last Memory"));
        ballads.add(new BalladMusic("Lam Cha"));
        ballads.add(new BalladMusic("At Close"));
        ballads.add(new BalladMusic("No More Us"));
        ballads.add(new BalladMusic("Paradise"));
        ballads.add(new BalladMusic("Beautiful"));
        ballads.add(new BalladMusic("One Love"));
        ballads.add(new BalladMusic("Cold Rain"));
    }

    public PopMusic getPopMusicById(int id) {
        return pops.get(id);
    }

    public BalladMusic getBalladMusicById(int id) {
        return ballads.get(id);
    }
}
