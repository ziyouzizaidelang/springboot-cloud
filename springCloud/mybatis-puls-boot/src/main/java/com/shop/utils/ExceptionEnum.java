package com.shop.utils;

/**
 * @Auther: LELE
 * @Date: 2019/9/17 20:30
 * @Description:
 */
public enum ExceptionEnum {

    SUCCESS(200, "OK"),

    UNKNOWN(201, "数据问题"),

    EXIST(202, "已存在"),

    LACK_PARAMETER(300, "缺少参数"),

    UNABLE_NULL(301, "不能为NULL"),

    ES_ERROR(302, "ES异常或操作失败"),

    MYSQL_ERROR(304, "mysql异常或操作失败"),

    ERROR(-1, "系统错误"),

    ERROR_FILE(001, "文件格式不正确,应为Excel或cse文件"),

    ERROR_FILE_2CSV(002, "文件错误,请检查文件内容"),

    BLANKFILE(000, "空文件");


    private int code;

    private String msg;

    private ExceptionEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
