package com.answer.auth.server.vo;

import lombok.Data;

/**
 * JWT认证请求实体
 */
@Data
public class JwtAuthenticationRequest {
    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

}
