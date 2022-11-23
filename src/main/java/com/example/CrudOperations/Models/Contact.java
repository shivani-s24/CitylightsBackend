package com.example.CrudOperations.Models;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "ContactList")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    private int id;


    private String email;


    private String username;


    private String query;




}
