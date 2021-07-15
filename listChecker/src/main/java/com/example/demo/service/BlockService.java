package com.example.demo.service;

import com.example.demo.entity.Block;
import com.example.demo.repo.BlockDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlockService {
    @Autowired
    private BlockDao blockDao;

    public void saveBlock(Block block){
        blockDao.save(block);
    }
    public List<Block> getAllBlocks(){
        return blockDao.findAll();
    }
    public void deleteByBlockName(String name, String courseCode){
        Block a = blockDao.findByBlockNameAndAndCourseCode(name,courseCode);
        blockDao.delete(a);
    }

}
