package com.example.demo.repo;

import com.example.demo.entity.Block;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BlockDao extends JpaRepository<Block,Integer> {
    @Override
    void delete(Block entity);
    Block findByBlockName(String name);
    Block findByBlockNameAndAndCourseCode(String blockName, String courseCode);

    List<Block> findAllByBlockName(String blockName);
//    List<Block> findAll();
//    void deleteByBlockName(String name);
}
