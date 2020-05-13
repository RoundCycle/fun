package com.round.cycle.fun.result;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.round.cycle.fun.exception.CustomException;
import com.round.cycle.fun.exception.CustomInfo;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.util.Map;

/**
 * @author wutong
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Slf4j
public class Result implements Serializable {

    private static final long serialVersionUID = -9127134373092799019L;

    @JsonProperty("success")
    private boolean success;
    @JsonProperty("data")
    private Object data;
    @JsonProperty("error")
    private Error error;

    private Result() {
    }

    public static Result buildSuccess() {
        Result result = new Result();
        result.setSuccess(true);
        return result;
    }

    public static Result buildSuccessResult(Object object) {
        Result result = new Result();
        result.setSuccess(true);
        result.setData(object);
        return result;
    }

    public static Result buildSuccessResult(Map<String, Object> data) {
        Result result = new Result();
        result.setSuccess(true);
        result.setData(data);
        return result;
    }

    public static Result buildCustomExceptionResult(CustomException ce) {
        Result result = new Result();
        result.setSuccess(false);
        result.setError(new Error(ce.getResponse()));
        return result;
    }

    public static Result buildSystemExceptionResult() {
        Result result = new Result();
        result.setSuccess(false);
        result.setError(new Error(CustomInfo.SYSTEM_ERROR));
        return result;
    }

    @Data
    static class Error {
        int errorCode;
        String msg;

        Error(CustomInfo e) {
            this.errorCode = e.getErrCode();
            this.msg = e.getDescription();
        }
    }

}