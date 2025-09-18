package com.snow.httpclient.cookies;

import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.cookie.Cookie;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author bedou
 * @version 1.0
 * @className: MyCookiesForPost
 * @package: com.snow.code
 * @date: 2025/09/18 20:17
 * @description MyCookiesForPost
 * @copyright: Copyright (c) 2025 [AutoTest]
 * @since 2025-09-18
 */
public class MyCookiesForPost {
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
    public void testPostCookies() throws IOException {
        String uri = resourceBundle.getString("test.post.with.cookies");
       //拼接最终的测试地址
        String testUrl = this.url + uri;

        //声明一个client对象，用来进行方法执行
        DefaultHttpClient client = new DefaultHttpClient();
        //声明一个方法，这个方法就是post方法
        HttpPost post = new HttpPost(testUrl);
        //添加参数
        JSONObject param = new JSONObject();
        param.put("name", "zhangsan");
        param.put("age", "18");

        //设置请求头信息 设置header
        post.setHeader("content-type", "application/json");
        //将参数信息添加到方法中
        StringEntity postEntity = new StringEntity(param.toString(),"UTF-8");
        post.setEntity(postEntity);
        //声明一个对象来进行响应结果的存储
        String result;
        //设置cookies信息
        client.setCookieStore(this.Store);
        //执行post方法
        HttpResponse response = client.execute(post);
        //获取响应结果
        result = EntityUtils.toString(response.getEntity());
        System.out.println(result);
        //处理结果，判断返回结果是否符合预期
        //将返回的响应结果字符串转化为json对象
        JSONObject obj = new JSONObject(result);

        //具体的判断返回结果的值
        String success = (String) obj.getString("zhangsan");
        String status = (String)obj.getString("status");
        //获取到结果值
        Assert.assertEquals("success", success);
        Assert.assertEquals("1", status);
    }
}
