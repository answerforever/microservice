package com.answer.admin.controller;

import com.answer.admin.biz.UserManager;
import com.answer.admin.vo.GroupUsers;
import com.answer.common.answercommon.msg.ObjectRestResponse;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("group")
@Api("群组模块")
public class GroupController {
    @Autowired
    private UserManager userManager;

    @RequestMapping(value = "/{id}/user", method = RequestMethod.GET)
    @ResponseBody
    public ObjectRestResponse<GroupUsers> getUsers(@PathVariable int id){
        return new ObjectRestResponse<GroupUsers>().rel(true).data(userManager.getGroupUsers(id));
    }

}
