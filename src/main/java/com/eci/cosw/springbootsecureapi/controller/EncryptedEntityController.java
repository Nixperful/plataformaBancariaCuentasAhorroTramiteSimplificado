package com.eci.cosw.springbootsecureapi.controller;
import com.eci.cosw.springbootsecureapi.model.EncryptedEntity;
import com.eci.cosw.springbootsecureapi.service.EncryptedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.servlet.ServletException;
import javax.swing.text.html.parser.Entity;
import java.util.List;


@RestController
@RequestMapping( "api" )
public class EncryptedEntityController {

    @Autowired
    private EncryptedService encryptedService;

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping( value = "/colmoney", method = RequestMethod.POST )
    public EncryptedEntity addTodo(@RequestBody EncryptedEntity eEntity ) throws ServletException {
         return encryptedService.addEntity(eEntity);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping( value = "/colmoney", method = RequestMethod.GET )
    public List<EncryptedEntity> getTodoList() throws ServletException {
        return encryptedService.getEntitiesList();
    }



}



