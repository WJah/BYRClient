package cn.edu.bupt.byrclient.handler;

import android.util.JsonReader;

import java.io.IOException;
import java.io.InputStream;

import cn.edu.bupt.byrclient.model.Section;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/7/30 0030.
 */
public class JSONParser {

    public static List<Section> readSectionJSONStream(InputStream is)
    {
        System.err.println(is);
        int name;
        String description;
        boolean is_root;
        String parent;
        List<Section> sections = new ArrayList<Section>();
        JsonReader reader = new JsonReader(new InputStreamReader(is));
        try {
            reader.beginObject();
            while (reader.hasNext())
            {
                reader.beginArray();
                while (reader.hasNext())
                {
                    String tag = reader.nextName();
                    if (tag.equals("name"))
                    {
                        name = reader.nextInt();
                    }else if (tag.equals("description"))
                    {
                        description = reader.nextString();
                    }else if (tag.equals("is_root")){
                        is_root = reader.nextBoolean();
                    }else if(tag.equals("parent"))
                    {
                        parent = reader.nextString();
                    }
                }
                reader.endArray();
            }
            reader.endObject();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return  null;
    }

}
