/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.josefdev.sistema.educa.dao;

import javax.persistence.EntityManager;

/**
 *
 * @author ty_jo
 */
public abstract class BaseDAO {
    protected EntityManager entityManager;

    public BaseDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

//    public void saveOrUpdate(Object entity) {
//        if (entity instanceof Persistable) {
//            entityManager.persist((Persistable) entity);
//        } else {
//            entityManager.merge(entity);
//        }
//    }

    public void delete(Object entity) {
        entityManager.remove(entity);
    }
    
}
