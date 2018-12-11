package com;


import java.util.ArrayList;
import java.util.List;

public class ResultVo<T>{
    private int code;  //响应状态编码
    private String errMsg; //错误信息
    private T data; //数据
    private List<ErrorDetail> errors; //错误信息集合
    private long dataTimestamp; //时间戳

    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getErrMsg() {
        return errMsg;
    }
    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
    public List<ErrorDetail> getErrors() {
        return errors;
    }
    public void setErrors(List<ErrorDetail> errors) {
        this.errors = errors;
    }
    public long getDataTimestamp() {
        return dataTimestamp;
    }
    public void setDataTimestamp(long dataTimestamp) {
        this.dataTimestamp = dataTimestamp;
    }


    // director
    public static ResultBuilder status(int code){
        ResultBuilder builder = new DefaultBuilder<>();
        builder.status(code);
        return builder;
    }

    public static ResultBuilder addError(String type, String message) {
        ResultBuilder builder = new DefaultBuilder<>();
        builder.addError(type, message);
        return builder;
    }

    public static ResultVo ok(Object data){
        ResultBuilder builder = new DefaultBuilder<>();
        return builder.data(data);
    }


    public static ResultVo err(int code,String errMsg){
        return null;
    }




    public static class DefaultBuilder<T> implements ResultBuilder<T> {
        private ResultVo<T> resultVo;

        public DefaultBuilder() {
            this.resultVo = new ResultVo<T>();
        }

        @Override
        public ResultBuilder addError(String type, String message) {
            if(resultVo.getErrors() == null) {
                resultVo.setErrors(new ArrayList<>());
            }
            ErrorDetail detail = new ErrorDetail();
            detail.setType(type);
            detail.setMessage(message);
            resultVo.getErrors().add(detail);
            return this;
        }

        @Override
        public ResultBuilder status(int status) {
            resultVo.setCode(status);
            return this;
        }

        @Override
        public ResultVo<T> data(T data) {
            return null;
        }

        @Override
        public ResultVo<T> data(int status, T data) {
            // status 200
            this.status(status);
            resultVo.setData(data);
            return resultVo;
        }

        @Override
        public ResultVo<T> err(int status) {
            return null;
        }

        @Override
        public ResultVo<T> err(int status, String emsg) {
            return null;
        }
    }
}

// 函数的类型签名
 interface ResultBuilder<T> {
    ResultBuilder addError(String type, String message);
    ResultBuilder status(int status);

    ResultVo<T> data(T data);
    ResultVo<T> data(int status, T data);
    ResultVo<T> err(int status);
    ResultVo<T> err(int status, String emsg);
}

class ErrorDetail { //错误详细类
    private String type;
    private String message;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
