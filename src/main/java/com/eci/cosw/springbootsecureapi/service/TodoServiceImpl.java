package com.eci.cosw.springbootsecureapi.service;

import com.eci.cosw.springbootsecureapi.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class TodoServiceImpl implements TodoService {
    private List<Todo> toDos = new ArrayList<>();


    @Autowired
    public TodoServiceImpl(){
    }

    @PostConstruct
    private void populateSampleData()
    {
        toDos.add( new Todo( "Hacer COSW", 1, new Date()));
    }

    @Override
    public List<Todo> getTodoList(){
        return toDos;
    }
    @Override
    public Todo addTodo(Todo todo){
        return toDos.get( 0 );
    }
}
