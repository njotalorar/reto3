package com.example.reto3.Controller;

import com.example.reto3.Model.Score;
import com.example.reto3.Service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*") //acepte todas las peticiones entrantes
@RequestMapping("/api/Score")
public class ScoreController {
    @Autowired
    private ScoreService scoreService;
    @GetMapping("/all")  //
    public List<Score> getAll(){
        return scoreService.getAll();
    }

    @GetMapping( "/{id}")
    public Optional<Score> getScore(@PathVariable int id){
        return scoreService.getScore(id);
    }
}
