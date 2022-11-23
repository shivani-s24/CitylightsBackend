package com.example.CrudOperations.Service;


import com.example.CrudOperations.Models.Contact;
import com.example.CrudOperations.Repository.ContactRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {
    @Autowired
    private ContactRepo contactRepo;

    public ContactServiceImpl(ContactRepo contactRepo) {
        this.contactRepo = contactRepo;
    }
    @Override
    public Contact saveContact(Contact contact)
    {
        return contactRepo.save(contact);
    }

    @Override
    public List<Contact> getAllContacts() {
        return contactRepo.findAll();
    }
    @Override
    public void deleteContact(int id)
    {
        contactRepo.findById(id);
        contactRepo.deleteById(id);
    }

    @Override
    public Contact getContactById(int id) {
        return null;
    }
}
