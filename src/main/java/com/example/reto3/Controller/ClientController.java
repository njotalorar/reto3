package com.example.reto3.Controller;

import com.example.reto3.Model.Client;
import com.example.reto3.Service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")  //acepte todas las peticiones entrantes
@RequestMapping("/api/Client")
public class ClientController {
    @Autowired
    private ClientService clientService;
    @GetMapping( "/all")  //
    public List<Client> getAll(){
        return clientService.getAll();
    }

    @GetMapping( "/{id}")
    public Optional<Client> getClient(@PathVariable int id){
        return clientService.getClient(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Client Save(@RequestBody Client client){
        return clientService.save(client);
    }
}
