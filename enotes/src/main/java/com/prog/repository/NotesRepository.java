package com.prog.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prog.entity.Notes;
import com.prog.entity.User;

public interface NotesRepository extends JpaRepository<Notes, Integer>{

    public List<Notes> findByUser(User user);

    public Optional<Notes> findById(long id); 
}
