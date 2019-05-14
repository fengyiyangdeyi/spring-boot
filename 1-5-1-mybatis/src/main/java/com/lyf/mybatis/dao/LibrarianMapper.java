package com.lyf.mybatis.dao;

/**
 * @Author: LYF
 * @Date: 2019/5/14 15:10
 */


import com.lyf.mybatis.entity.Librarian;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LibrarianMapper {
    Librarian selectLibrarian(int id);
}
