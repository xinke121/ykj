package com.ykj.java.common.exception;

/**
 * 自定义异常
 * 
 * @author bnz
 * @email object_bnz@163.com
 * @date 2016年10月27日 下午10:11:27
 */
public class YkjException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
    private String msg;
    private int code = 500;
    
    public YkjException(String msg) {
		super(msg);
		this.msg = msg;
	}
	
	public YkjException(String msg, Throwable e) {
		super(msg, e);
		this.msg = msg;
	}
	
	public YkjException(String msg, int code) {
		super(msg);
		this.msg = msg;
		this.code = code;
	}
	
	public YkjException(String msg, int code, Throwable e) {
		super(msg, e);
		this.msg = msg;
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
	
	
}