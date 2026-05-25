package com.atguigu06.project.team.service;

/**
 * ClassName: TeamException
 * Package: atguigu06.project.team.service
 * Description:
 *
 * @Author ljy
 * @Create 2025-03-18 오전 10:13
 * @Version 1.0
 */
public class TeamException extends Exception {
    static final long serialVersionUID = -338751699312948L;

    public TeamException() {
    }

    public TeamException(String message) {
        super(message);
    }
}
