package com.lyf.mybatis.controller;

import com.lyf.mybatis.entity.Librarian;
import com.lyf.mybatis.service.LibrarianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: LYF
 * @Date: 2019/5/14 15:08
 */
@RestController
public class LibrarianController {

    @Autowired
    private LibrarianService librarianService;

    @GetMapping("/getLibrarian")
    public Librarian getALibrarianInfo(int id) {
        //System.out.println("test :id: "+id);
        return librarianService.selectLibrarian(id);
    }
}
