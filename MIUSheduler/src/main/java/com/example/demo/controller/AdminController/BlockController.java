package com.example.demo.controller.AdminController;

import com.example.demo.entity.Block;
import com.example.demo.service.BlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class BlockController {
    @Autowired
    private BlockService blockService;

    @GetMapping("/getSaveBlockForm")
    public String getBlockForm(){
        return "BlockCreate";
    }

    @PostMapping("/saveBlock")
    public String saveBlock(Block block){
        blockService.saveBlock(block);
        return "SuccessPage";
    }

    @GetMapping("/getAllblocks")
    public String getAllBlocks(Model model){
        List<Block> blockList = blockService.getAllBlocks();
        for(Block b: blockList){
            System.out.println(b.toString());
        }
        model.addAttribute(blockList);
        return "BlockRead";
    }
    @GetMapping("/getDeleteBlockForm")
    public String delete(){
        return "BlockDelete";
    }

    @PostMapping("/deleteBlockByName")
    public String deleteCourseByName(String name, String courseCode){
        blockService.deleteByBlockName(name,courseCode);
        return "SuccessPage";
    }
}
