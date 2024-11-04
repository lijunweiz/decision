package cn.unminded.rtool.core;


import java.io.Serializable;

public class Result implements Serializable {

    public static final Integer OK_CODE = 1;
    public static final Integer FAIL_CODE = 0;
    public static final String OK_MSG = "处理成功";
    public static final String FAIL_MSG = "处理失败";

    private Integer code;

    private String desc;

    private Object data;

    public Result() {
    }

    public Result(Integer code, String desc, Object data) {
        this.code = code;
        this.desc = desc;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public Result setCode(Integer code) {
        this.code = code;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public Result setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public Object getData() {
        return data;
    }

    public Result setData(Object data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", desc='" + desc + '\'' +
                ", data=" + data +
                '}';
    }

    public static Result ok() {
        return new Result(OK_CODE, OK_MSG, null);
    }

    public static Result ok(Object data) {
        return new Result(OK_CODE, OK_MSG, data);
    }

    public static Result ok(Integer code) {
        return new Result(code, OK_MSG, null);
    }

    public static Result ok(String desc) {
        return new Result(OK_CODE, desc, null);
    }

    public static Result ok(Integer code, String desc) {
        return new Result(code, desc, null);
    }

    public static Result ok(Integer code, String desc, Object data) {
        return new Result(code, desc, data);
    }

    public static Result fail() {
        return new Result(FAIL_CODE, FAIL_MSG, null);
    }

    public static Result fail(Integer code) {
        return new Result(code, FAIL_MSG, null);
    }

    public static Result fail(String desc) {
        return new Result(FAIL_CODE, desc, null);
    }

    public static Result fail(Integer code, String desc) {
        return new Result(code, desc, null);
    }

    public static Result fail(Integer code, String desc, Object data) {
        return new Result(code, desc, data);
    }

}
