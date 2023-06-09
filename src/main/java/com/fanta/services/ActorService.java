package com.fanta.services;

import com.fanta.dao.ActorDao;
import com.fanta.entity.ActorEntity;
import com.fanta.factory.ActorDaoFactory;

import java.util.List;

public final class ActorService {
    private static ActorService actorService = new ActorService();
    public static final ActorDao actorDao = ActorDaoFactory.createActorDao();

    private ActorService(){}

    public static ActorService getInstance() {
        return actorService;
    }

    public void addNewActor(ActorEntity actorEntity) {
        actorDao.getInstance().saveNewEntity(actorEntity);
    }

    public void updateActorById(int id, ActorEntity actorEntity){
        actorDao.getInstance().updateEntityById(id, actorEntity);
    }

    public void deleteActorById(int id){
        actorDao.getInstance().deleteEntity(id);
    }

    public ActorEntity getActorById(int id){
        return actorDao.getInstance().findById(id);
    }

    public List<ActorEntity> getAllActors(){
        return actorDao.getInstance().findAll();
    }
}
