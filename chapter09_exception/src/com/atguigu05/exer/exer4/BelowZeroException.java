package com.atguigu05.exer.exer4;

/**
 * ClassName: BelowZeroException
 * Package: com.atguigu05.exer.exer4
 * Description:
 *
 * @Author: ljy
 * @Create: 2026. 5. 23. 오후 1:48
 * @Version 1.0
 */
public class BelowZeroException extends Exception {

    static final long serialVersionUID = -3381283129039931222L;

    public BelowZeroException() {
    }

    public BelowZeroException(String message) {
        super(message);
    }
}
