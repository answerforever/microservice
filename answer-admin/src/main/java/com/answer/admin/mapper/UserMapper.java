package com.answer.admin.mapper;

import com.answer.admin.entity.User;
import com.answer.admin.entity.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface UserMapper extends Mapper<User> {
//    int countByExample(UserExample example);
//
//    int deleteByExample(UserExample example);
//
//    List<User> selectByExample(UserExample example);
//
//    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);
//
//    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    List<User> selectMemberByGroupId(@Param("groupId") int groupId);

    List<User> selectLeaderByGroupId(@Param("groupId") int groupId);

}