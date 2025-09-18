package com.snow.code;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * @author bedou
 * @version 1.0
 * @className: MyHttpClient
 * @package: com.snow.code
 * @date: 2025/09/18 19:57
 * @description HttpClient
 * @copyright: Copyright (c) 2025 [AutoTest]
 * @since 2025-09-18
 */
public class MyHttpClient {

    @Test
    public void test1() throws IOException {
        //用来存放我们的结果
        String result;
        HttpGet httpGet = new HttpGet("http://www.baidu.com");
        //用来执行get方法
        HttpClient httpClient = new DefaultHttpClient();
        HttpResponse  response = httpClient.execute(httpGet);
        result = EntityUtils.toString(response.getEntity(), "utf-8");
        System.out.println(result);
    }
}
