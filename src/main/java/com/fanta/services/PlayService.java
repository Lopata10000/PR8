package com.fanta.services;

import com.fanta.dao.PlayDao;
import com.fanta.entity.PlayEntity;
import com.fanta.factory.PlayDaoFactory;

import java.util.List;

public final class PlayService {
    private static PlayService playService = new PlayService();
    public static final PlayDao playDao = PlayDaoFactory.createPlayDao();


    private PlayService() {
    }

    public static PlayService getInstance() {
        return playService;
    }

    public void addNewPlay(PlayEntity playEntity) {
        playDao.getInstance().saveNewEntity(playEntity);
    }

    public void updatePlayById(int id, PlayEntity playEntity) {
        playDao.getInstance().updateEntityById(id, playEntity);
    }
    public void deletePlayById(int id){
        playDao.getInstance().deleteEntity(id);
    }

    public PlayEntity getPlayById(int id){
        return playDao.getInstance().findById(id);
    }

    public List<PlayEntity> getAllPlays(){
        return playDao.getInstance().findAll();
    }
}
