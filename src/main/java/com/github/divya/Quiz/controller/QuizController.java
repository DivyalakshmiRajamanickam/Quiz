package com.github.divya.Quiz.controller;

import com.github.divya.Quiz.model.Quiz;
import com.github.divya.Quiz.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {
    @Autowired
    private QuizService quizService;

    public QuizController(QuizService service) {
        this.quizService = service;
    }

    @GetMapping(value = "/")
    public ResponseEntity<List<Quiz>> getAllQuizzes(){
        List<Quiz> responseBody = quizService.getAllQuizzes();
        ResponseEntity responseEntity = new ResponseEntity<>(responseBody, HttpStatus.OK);
        return responseEntity;
    }

    @RequestMapping(value="/create", method= RequestMethod.POST)
    public  ResponseEntity<Quiz> create(@RequestBody Quiz quiz){
        Quiz responseBody = (Quiz) quizService.create(quiz);
        ResponseEntity responseEntity = new ResponseEntity<>(responseBody, HttpStatus.OK);
        return responseEntity;
    }


    @RequestMapping(value = "/read/{id}", method = RequestMethod.GET)
    public ResponseEntity<Quiz> get(@PathVariable Integer id) {
        Quiz responseBody = quizService.get(id);
        ResponseEntity responseEntity = new ResponseEntity<>(responseBody, HttpStatus.OK);
        return  responseEntity;
    }


    @RequestMapping(value="/update/{id}", method=RequestMethod.PUT)
    public ResponseEntity<Quiz> update(@PathVariable Integer id, @RequestBody Quiz quiz){
        Quiz responseBody = quizService.update(id,quiz);
        ResponseEntity responseEntity = new ResponseEntity<>(responseBody,HttpStatus.OK);
        return responseEntity;
    }


    @RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
    public ResponseEntity<Quiz> delete(@PathVariable Integer id){
        Quiz responseBody = quizService.delete(id);
        ResponseEntity responseEntity = new ResponseEntity<>(responseBody, HttpStatus.OK);
        return responseEntity;
    }
}