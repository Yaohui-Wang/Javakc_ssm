package com.zhg.javakc.modules.test.dao;

import com.zhg.javakc.base.dao.BaseDao;
import com.zhg.javakc.base.dao.MyBatisDao;
import com.zhg.javakc.modules.test.entity.TestEntity;

/**
 * @Author Mr.Wang
 * @Date 2019/09/27
 * @Version 1.0
 */
@MyBatisDao
public interface TestDao extends BaseDao<TestEntity> {
}
