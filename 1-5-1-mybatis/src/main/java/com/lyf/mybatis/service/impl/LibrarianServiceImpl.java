package com.lyf.mybatis.service.impl;

import com.lyf.mybatis.dao.LibrarianMapper;
import com.lyf.mybatis.entity.Librarian;
import com.lyf.mybatis.service.LibrarianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: LYF
 * @Date: 2019/5/14 15:09
 */
@Service
public class LibrarianServiceImpl implements LibrarianService {

    @Autowired
    private LibrarianMapper librarianMapper;

    @Override
    public Librarian selectLibrarian(int id) {
        return librarianMapper.selectLibrarian(id);
    }
}
