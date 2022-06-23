package com.esprit.BackVoyagePro.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Publication implements Serializable{

    @Id
    @GeneratedValue
    private Long idPub;

    private String title;

    private String content;

    private Boolean archive;

    private LocalDateTime dateTimeOfPub = LocalDateTime.now();

    private String imageUrl;


    
}
