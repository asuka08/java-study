package com.verysb.service;

import org.springframework.core.io.Resource;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-10-2
 * Time: 下午8:06
 * To change this template use File | Settings | File Templates.
 */
public class TestBean {

    private Resource res;

    public void parse() throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(res.getFile()));
        String lineText;
        while (null != (lineText = br.readLine())) {
            System.out.println(lineText);
        }
    }

    public void setRes(Resource res) {
        this.res = res;
    }
}
