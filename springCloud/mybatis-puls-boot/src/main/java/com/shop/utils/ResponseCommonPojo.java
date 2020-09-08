package com.shop.utils;


import com.alibaba.fastjson.JSON;

/**
 * @Auther: LELE
 * @Date: 2019/9/17 20:03
 * @Description:响应
 */
public class ResponseCommonPojo {

	protected int code;
	
	protected String msg;


	protected Object data;

	public static ResponseCommonPojo getInstance(int code, String msg){
		return new ResponseCommonPojo(code, msg);
	}

	public static ResponseCommonPojo getInstance(ExceptionEnum ee, String data){
		return new ResponseCommonPojo(ee.getCode(), ee.getMsg(), data);
	}


	public static ResponseCommonPojo getInstance(int code, String msg, Object data){
		return new ResponseCommonPojo(code, msg,data);
	}

	public static ResponseCommonPojo getInstance(ExceptionEnum ee, Object data){
		return new ResponseCommonPojo(ee.getCode(), ee.getMsg(),data);
	}

	public static ResponseCommonPojo getInstance(ExceptionEnum ee){
		return new ResponseCommonPojo(ee.getCode(), ee.getMsg());
	}

	public int getCode() {
		return code;
	}


	public void setCode(int code) {
		this.code = code;
	}


	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	private ResponseCommonPojo(int code, String msg) {
		super();
		this.code = code;
		this.msg = msg;
	}
	private ResponseCommonPojo(int code, String msg, Object data) {
		super();
		this.code = code;
		this.msg = msg;
		this.data=data;
	}

	public ResponseCommonPojo() {
		super();
	}

	@Override
	public String toString() {
		return JSON.toJSONString(this);
	}
	
	
	
}
