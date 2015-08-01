package cn.edu.bupt.byrclient.network;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;
import org.apache.http.util.EntityUtils;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.*;

/**
 * Created by Administrator on 2015/7/30 0030.
 */
public class HTTPClient {
    URL url;
    public HTTPClient(String URLString)
    {
        try {
            url = new URL(URLString);
        }
        catch (MalformedURLException e)
        {
            e.printStackTrace();
        }
    }

    public InputStream HTTPRequest()
    {
        InputStream inputStream = null;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
            inputStream = httpURLConnection.getErrorStream();
            httpURLConnection.disconnect();
            /*
            HttpClient httpClient = new DefaultHttpClient();
            HttpGet httpGet = new HttpGet(BYRURL.TOP_TEN_URL);
            HttpResponse httpResponse = httpClient.execute(httpGet);
            HttpEntity httpEntity = httpResponse.getEntity();
             */
            System.out.println("entity:" + inputStream);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return  inputStream;
    }
}
