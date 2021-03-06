package com.lyf.mybatis.dao;

import com.lyf.mybatis.entity.Person;
import com.lyf.mybatis.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
/**
 * @Author: LYF
 * @Date: 2019/5/14 11:18
 */
@Repository
public interface UserMapper {

    @Select("SELECT * FROM Person WHERE id = #{id}")
    Person selectUser(int id);

    User sel(@Param("id") int id);
}
