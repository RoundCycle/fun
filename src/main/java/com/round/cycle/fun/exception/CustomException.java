package com.round.cycle.fun.exception;


/**
 * @author wutong
 */
public class CustomException extends RuntimeException {

    private static final long serialVersionUID = -3394232560014500748L;

    private final CustomInfo response;

    public CustomException(CustomInfo response) {
        this.response = response;
    }

    public CustomInfo getResponse() {
        return response;
    }
}
