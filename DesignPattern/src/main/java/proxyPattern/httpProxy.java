package proxyPattern;

import okhttp3.Response;

import java.util.Map;

public class httpProxy {
    private static IhttpProcessor mIhttpProcessor;
    public static void init(IhttpProcessor httpProcessor){
        mIhttpProcessor=httpProcessor;
    }
    public Response get(String url, Map<String, Object> params){
        Response res=null;
        if(preValid(url))
           res=mIhttpProcessor.get(url,params);
        return res;
    }
    public Response post(String url, Map<String, Object> params) {
        Response res=null;
        if(preValid(url))
            res=mIhttpProcessor.post(url,params);
        return res;
    }

    /**
     *
     * 验证是否为https地址
     */
    public boolean preValid(String url){
        if(url.startsWith("https"))
            return true;
        else
            return false;
    }



}
