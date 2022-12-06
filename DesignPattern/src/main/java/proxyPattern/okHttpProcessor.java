package proxyPattern;
import okhttp3.*;

import java.io.IOException;
import java.util.Map;
import java.util.logging.LogRecord;

public class okHttpProcessor implements IhttpProcessor {
    private static  OkHttpClient mOkHttpClient;
    public okHttpProcessor(){
        mOkHttpClient=new OkHttpClient();
    }
    public Response get(String url, Map<String, Object> params){
        Request request = new Request.Builder()
                .url(setPath(url,params))
                .build();
        try {
            return newCall(request);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public Response post(String url, Map<String, Object> params){

        RequestBody requestBody = appendBody(params);

        Request request = new Request.Builder()
                .post(requestBody)
                .url(url)
                .build();
        try {
            return newCall(request);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private Response newCall(Request request) throws IOException {
        Response response = null;
        response = mOkHttpClient.newCall(request).execute();
        return response;
    }
    //传入参数，返回添加头信息
    private RequestBody appendBody( Map<String, Object> params){
        FormBody.Builder body = new FormBody.Builder();
        if(params == null || params.isEmpty()){
            return body.build();
        }
        for(Map.Entry<String, Object> entry : params.entrySet()){
            body.add(entry.getKey(),entry.getValue().toString());
        }
        return body.build();
    }
    public String setPath(String url,Map<String, Object> bodyParams) {
        StringBuilder mid = new StringBuilder('?');
        for (String key : bodyParams.keySet()) {
            //如果参数不是null并且不是""，就拼接起来
            mid.append("&");
            mid.append(key);
            mid.append("=");
            mid.append(bodyParams.get(key).toString());
        }
        return url+mid.toString();
    }

}
