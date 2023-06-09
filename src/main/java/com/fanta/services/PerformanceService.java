package com.fanta.services;


import com.fanta.dao.PerformanceDao;
import com.fanta.entity.PerformanceEntity;
import com.fanta.factory.PerformanceDaoFactory;

import java.util.List;

public final class PerformanceService {
    private static PerformanceService performanceService = new PerformanceService();
    public static final PerformanceDao performanceDao = PerformanceDaoFactory.createPerformanceDao();
    private PerformanceService(){}

    public static PerformanceService getInstance() {
        return performanceService;
    }

    public void addNewPerformance(PerformanceEntity performanceEntity) {
        performanceDao.getInstance().saveNewEntity(performanceEntity);
    }

    public void updatePerformanceById(int id, PerformanceEntity performanceEntity){
        performanceDao.getInstance().updateEntityById(id, performanceEntity);
    }

    public void deletePerformanceById(int id){
        performanceDao.getInstance().deleteEntity(id);
    }

    public PerformanceEntity getPerformanceById(int id){
        return performanceDao.getInstance().findById(id);
    }

    public List<PerformanceEntity> getAllPerformances(){
        return performanceDao.getInstance().findAll();
    }
}
