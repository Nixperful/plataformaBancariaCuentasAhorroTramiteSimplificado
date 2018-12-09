package com.eci.cosw.springbootsecureapi.service;

import com.eci.cosw.springbootsecureapi.model.EncryptedEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import com.eci.cosw.springbootsecureapi.model.EncryptedEntity;
import com.eci.cosw.springbootsecureapi.service.EncryptedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

    @Service
    public class EncryptedServiceImpl implements EncryptedService {
        private List<EncryptedEntity> encryptedEntities = new ArrayList<>();


        @Autowired
        public EncryptedServiceImpl(){
        }



        @PostConstruct
        private void populateSampleData(){

            encryptedEntities.add( new EncryptedEntity( "Nicolas Osorio", 1019137777, "DSAHDAKJH566" ));
        }

        @Override
        public List<EncryptedEntity> getEntitiesList(){

            return encryptedEntities;
        }
        @Override
        public EncryptedEntity addEntity(EncryptedEntity encryptedEntity){
            encryptedEntities.add(encryptedEntity);
            return encryptedEntities.get( encryptedEntities.size()-1 );
        }
    }



