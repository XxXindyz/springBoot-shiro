package com.xxxindy.springBoot.service.impl;

import com.xxxindy.springBoot.domain.mapper.test1.SysPermisssionMapper;
import com.xxxindy.springBoot.domain.mapper.test1.SysRoleMapper;
import com.xxxindy.springBoot.domain.mapper.test1.UserInfoMapper;
import com.xxxindy.springBoot.domain.user.entity.SysPermission;
import com.xxxindy.springBoot.domain.user.entity.SysRole;
import com.xxxindy.springBoot.domain.user.entity.UserInfo;
import com.xxxindy.springBoot.service.UserInfoService;
import org.apache.commons.collections.CollectionUtils;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

/**
 * @Author: xxxindy
 * @Date:2018/2/8 上午10:01
 * @Description:
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Resource
    private UserInfoMapper userInfoMapper;

    @Resource
    private SysRoleMapper sysRoleMapper;

    @Resource
    private SysPermisssionMapper sysPermisssionMapper;

    @Override
    public UserInfo findByUsername(String username) {
        System.out.println("UserInfoServiceImpl.findByUsername()");
        UserInfo userInfo = userInfoMapper.findByUsername(username);
        List<Integer> roleIds = sysRoleMapper.getRoleIdByUid(userInfo.getUid());
        List<SysRole> roles = sysRoleMapper.getSysRolesByRoleIds(roleIds);
        for(SysRole sysRole : roles) {
            List<Integer> permissionIds = sysPermisssionMapper.getPermissionIdByRoleid(sysRole.getId());
            if(CollectionUtils.isEmpty(permissionIds)) break;
            List<SysPermission> sysPermissions = sysPermisssionMapper.getPermissionsByPermissionIds(permissionIds);
            sysRole.setPermissions(sysPermissions);
        }
        userInfo.setRoleList(roles);
        return userInfo;
    }

    @Override
    @Transactional(value = "test1TransactionManager")
    public void signUp(String username, String simpleHash, String salt) throws Exception {

        userInfoMapper.addUserInfo(username,simpleHash,salt);
    }
}
