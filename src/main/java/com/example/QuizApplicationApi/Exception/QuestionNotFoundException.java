package com.example.QuizApplicationApi.Exception;

public class QuestionNotFoundException extends RuntimeException{

    public  QuestionNotFoundException(String message){
        super(message);
    }
}
