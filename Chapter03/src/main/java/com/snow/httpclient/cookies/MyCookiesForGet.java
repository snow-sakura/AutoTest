package com.snow.httpclient.cookies;

import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author bedou
 * @version 1.0
 * @className: MyCookiesForGet
 * @package: com.snow.httpclient.cookies
 * @date: 2025/09/18 21:47
 * @description Httpcilent
 * @copyright: Copyright (c) 2025 [AutoTest]
 * @since 2025-09-18
 */
public class MyCookiesForGet {

    private String url;
    private ResourceBundle resourceBundle;
    //用来存储cookie
    private CookieStore Store;

    @BeforeTest
    public void beforeTest(){
        resourceBundle = ResourceBundle.getBundle("application", Locale.CHINESE);
        url = resourceBundle.getString("test.url");
    }
    @Test
    public void testGetCookies() throws IOException {
        String result;
        //从配置文件中拼接测试的url
        String uri = resourceBundle.getString("getCookies.uri");
        String testUrl = this.url + uri;
        //测试逻辑代码
        HttpGet get = new HttpGet(testUrl);
        DefaultHttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(get);
        result = EntityUtils.toString(response.getEntity());
        System.out.println(result);

        //获取cookies信息
        this.Store = client.getCookieStore();
        List<Cookie> cookieList = Store.getCookies();
        for (Cookie cookie : cookieList) {
            String name = cookie.getName();
            String value = cookie.getValue();
            System.out.println("name: " + name+", value: " + value);
        }
    }

    @Test(dependsOnMethods = {"testGetCookies"})
    public void testGetWithCookies() throws IOException {
        String uri = resourceBundle.getString("test.get.with.cookies");
        String testUrl = this.url + uri;
        HttpGet get = new HttpGet(testUrl);
        DefaultHttpClient client = new DefaultHttpClient();
        //设置cookies信息
        client.setCookieStore(this.Store);
        HttpResponse response =  client.execute(get);
        //获取响应的状态码
        int statusCode = response.getStatusLine().getStatusCode();
        System.out.println("statusCode: " + statusCode);
        if (statusCode == 200) {
            String result = EntityUtils.toString(response.getEntity(), "UTF-8");
            System.out.println(result);
        }
    }
}
