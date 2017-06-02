package com.gvs.framedemo.utils;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author jane
 * @time 2016/10/25  13:22
 * @desc ${TODD}
 */
public class NetWorkUtils {
    public static String doPost(String urlPath, HashMap<String ,String> params) {
        try {
            URL url = new URL(urlPath);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");

            String paramsStr="";
            Set<Map.Entry<String, String>> entryset = params.entrySet();
            for (Map.Entry<String, String>  entry: entryset) {
              paramsStr+= "&"+ entry.getKey()+"="+entry.getValue();
            }
            paramsStr= paramsStr.substring(1);

            conn.setDoOutput(true);
            conn.getOutputStream().write(paramsStr.getBytes());

            if(conn.getResponseCode()==200) {
                InputStream is = conn.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                return reader.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
    public static String doGet(String urlPath){
        try {
            URL url = new URL(urlPath);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            if(conn.getResponseCode()==200) {
                InputStream is = conn.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                return reader.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}
