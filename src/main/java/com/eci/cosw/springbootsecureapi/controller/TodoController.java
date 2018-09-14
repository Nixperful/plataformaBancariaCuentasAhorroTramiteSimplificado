package com.eci.cosw.springbootsecureapi.controller;

import com.eci.cosw.springbootsecureapi.model.Todo;
import com.eci.cosw.springbootsecureapi.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;


@RestController
@RequestMapping( "api" )
public class TodoController {

    @Autowired
    private TodoService todoService;

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping( value = "/todos", method = RequestMethod.POST )
    public void addTodo(@RequestBody Todo todo ) throws ServletException {
         todoService.addTodo(todo);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping( value = "/todos", method = RequestMethod.GET )
    public void getTodoList() throws ServletException {
        todoService.getTodoList();
    }



}



