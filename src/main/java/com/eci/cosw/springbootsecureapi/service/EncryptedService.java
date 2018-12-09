package com.eci.cosw.springbootsecureapi.service;

import com.eci.cosw.springbootsecureapi.model.EncryptedEntity;
import java.util.List;


public interface EncryptedService {
    List<EncryptedEntity> getEntitiesList();
    EncryptedEntity addEntity( EncryptedEntity encryptedEntity );
}
