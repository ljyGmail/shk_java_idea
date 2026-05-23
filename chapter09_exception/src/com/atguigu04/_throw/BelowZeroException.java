package com.atguigu04._throw;

/**
 * ClassName: BelowZeroException
 * Package: com.atguigu04._throw
 * Description:
 *
 * @Author: ljy
 * @Create: 2026. 5. 23. 오전 9:05
 * @Version 1.0
 */
public class BelowZeroException extends Exception {

    static final long serialVersionUID = -3387516999948L;

    public BelowZeroException() {
    }

    public BelowZeroException(String message) {
        super(message);
    }

    public BelowZeroException(String message, Throwable cause) {
        super(message, cause);
    }
}
