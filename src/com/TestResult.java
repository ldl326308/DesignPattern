package com;

import java.util.ArrayList;

public class TestResult {

    public static void main(String[] args) {

        ResultVo resultVo_1 = ResultVo.ok("正常返回");

        ResultVo resultVo = new ResultVo();
        ArrayList<ErrorDetail> list = new ArrayList<>();
        list.add(new ErrorDetail());
        list.add(new ErrorDetail());
        list.add(new ErrorDetail());
        list.add(new ErrorDetail());
        list.add(new ErrorDetail());
        list.add(new ErrorDetail());
        resultVo.setErrors(list);




        ResultVo resultVo_2 = ResultVo.ok("带分页信息返回");

        ResultVo resultVo_3 = ResultVo.status(201).data("正常返回");

        ResultVo resultVo_4 = ResultVo.err(400, "数据错误");

        ResultVo resultVo_5 = ResultVo.status(400).err(00);


    }
}

