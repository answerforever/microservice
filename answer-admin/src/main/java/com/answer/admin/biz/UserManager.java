package com.answer.admin.biz;

import com.answer.admin.mapper.UserMapper;
import com.answer.admin.vo.GroupUsers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
//@Transactional(rollbackFor = Exception.class)
public class UserManager {
    @Autowired
    private UserMapper userMapper;

    /**
     * 获取群组关联用户
     *
     * @param groupId
     * @return
     */
    public GroupUsers getGroupUsers(int groupId) {
        return new GroupUsers(userMapper.selectMemberByGroupId(groupId), userMapper.selectLeaderByGroupId(groupId));
    }

}
