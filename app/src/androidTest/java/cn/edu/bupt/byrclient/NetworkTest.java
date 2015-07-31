package cn.edu.bupt.byrclient;

import android.test.AndroidTestCase;

import cn.edu.bupt.byrclient.handler.JSONParser;
import cn.edu.bupt.byrclient.network.BYRURL;
import cn.edu.bupt.byrclient.network.HTTPClient;

/**
 * Created by Administrator on 2015/7/30 0030.
 */
public class NetworkTest  extends AndroidTestCase{
    public void testHTTPClient() throws Exception
    {
        HTTPClient httpClient = new HTTPClient(BYRURL.ROOT_SECTION_URL);
        JSONParser.readSectionJSONStream(httpClient.HTTPRequest());
    }
}
