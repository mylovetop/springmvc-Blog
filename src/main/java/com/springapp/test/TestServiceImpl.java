package com.springapp.test;

import java.util.List;

/**
 * Created by zdsoft on 14-7-7.
 */
public class TestServiceImpl implements TestService {

    @Override
    public List getAllObject() {
        System.out.println("---TestService：Cache内不存在该element，查找并放入Cache！");
        return null;
    }

    @Override
    public void updateObject(Object object) {
        System.out.println("---TestService：更新了对象，这个Class产生的cache都将被remove！");
    }
}
