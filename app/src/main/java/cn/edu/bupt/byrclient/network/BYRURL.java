package cn.edu.bupt.byrclient.network;

import junit.framework.Test;

/**
 * Created by Administrator on 2015/7/30 0030.
 */
public interface BYRURL {
    public static String TEST_API_URL = "http://bbs.byr.cn/open/";
    public static String GET_METHOD_PROPERTY = "?packegename=cn.edu.bupt.byrclient&signature=26d667a23dbdba6577524e52030b181c";
    public static String ROOT_SECTION_URL = TEST_API_URL + "section.json" + GET_METHOD_PROPERTY;
    public static String TOP_TEN_URL = TEST_API_URL + "widget/topten.json";
}
