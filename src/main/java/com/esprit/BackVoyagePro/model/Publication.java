package com.esprit.BackVoyagePro.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.NonNull;

public class Publication implements Serializable{

    @Id
    @GeneratedValue
    private Long idPub;

 
    @NonNull
    private String title;

   
    @NonNull
    @Column(columnDefinition = "TEXT")
    private String content;

    private String Archive;


    
}
