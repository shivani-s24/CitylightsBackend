package com.example.CrudOperations.Repository;

import com.example.CrudOperations.Models.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepo extends JpaRepository<Contact, Integer> {
}
