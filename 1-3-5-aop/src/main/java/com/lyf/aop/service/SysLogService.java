package com.lyf.aop.service;

import com.lyf.aop.entity.SysLogBO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Author: LYF
 * @Date: 2019/5/14 9:56
 */

@Slf4j
@Service
public class SysLogService {

    public boolean save(SysLogBO sysLogBO){
        // 这里就不做具体实现了
        log.info(sysLogBO.getParams());
        return true;
    }
}
