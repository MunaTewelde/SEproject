package com.example.demo.repo;


import com.example.demo.entity.Entry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntryDao extends JpaRepository<Entry,Integer> {
    @Override
    void delete(Entry entity);

    Entry findByName(String name);
}
