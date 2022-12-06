package proxyPattern;

import okhttp3.Response;

import java.util.Map;

public interface IhttpProcessor {
    //get请求接口
    Response get(String url, Map<String,Object> params);
    //post请求接口
    Response post(String url, Map<String,Object> params);
}
