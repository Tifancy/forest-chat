package com.dempe.ocean.node.im.service;

import com.dempe.ocean.node.im.dao.UserGroupDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * User: Dempe
 * Date: 2016/3/8
 * Time: 11:36
 * To change this template use File | Settings | File Templates.
 */
@Service
public class UserGroupService {

    @Resource
    private UserGroupDao userGroupDao;


    public void saveUserGroup(Long createByUid, String groupName, String groupProfile) {
        userGroupDao.saveUserGroup(createByUid, groupName, groupProfile);

    }

}