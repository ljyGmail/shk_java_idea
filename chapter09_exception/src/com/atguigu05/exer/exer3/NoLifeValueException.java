package com.atguigu05.exer.exer3;

/**
 * ClassName: NoLifeValueException
 * Package: com.atguigu05.exer.exer3
 * Description:
 *
 * @Author: ljy
 * @Create: 2026. 5. 23. 오전 9:35
 * @Version 1.0
 */
public class NoLifeValueException extends RuntimeException {

    static final long serialVersionUID = -70348971934506939L;

    public NoLifeValueException() {
    }

    public NoLifeValueException(String message) {
        super(message);
    }
}
