package com.example.reto3.Controller;

import com.example.reto3.Model.Message;
import com.example.reto3.Service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*") //acepte todas las peticiones entrantes
@RequestMapping("/api/Message")
public class MessageController {
    @Autowired
    private MessageService messageservice;
    @GetMapping(value = "/all")  //
    public List<Message> getAll(){
        return messageservice.getAll();
    }

    @GetMapping(value = "/{id}")
    public Optional<Message> getClient(@PathVariable int id){
        return messageservice.getMessage(id);
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Message Save(@RequestBody Message message){
        return messageservice.save(message);
    }
}
