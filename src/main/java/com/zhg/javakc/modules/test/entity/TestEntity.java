package com.zhg.javakc.modules.test.entity;

import com.zhg.javakc.base.entity.BaseEntity;
import java.util.Date;

/**
 * @Author Mr.Wang
 * @Date 2019/09/27
 * @Version 1.0
 */
public class TestEntity extends BaseEntity<TestEntity> {
    /**
     * 主键Id
     */
    private String testId;
    /**
     * 测试姓名
     */
    private String testName;
    /**
     * 测试性别
     */
    private String testSex;
    /**
     * 测试日期
     */
    private Date testDate;

    public String getTestId() {
        return testId;
    }

    public void setTestId(String testId) {
        this.testId = testId;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getTestSex() {
        return testSex;
    }

    public void setTestSex(String testSex) {
        this.testSex = testSex;
    }

    public Date getTestDate() {
        return testDate;
    }

    public void setTestDate(Date testDate) {
        this.testDate = testDate;
    }
}
