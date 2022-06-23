package com.esprit.BackVoyagePro.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Comments implements Serializable{

    @Id
    @GeneratedValue
    private Long id;

  
    private String content;

    private LocalDateTime dateTimeOfComment = LocalDateTime.now();
    
}
