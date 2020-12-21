package com.example.finalhomework.bean;


import com.example.finalhomework.R;

import java.util.ArrayList;

public class GoodsInfo {

    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "airpodspro", "sony", "technica", "sennheiser", "philips", "shuru","huawei","jbl"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "Apple/苹果 AirPods Pro 无线蓝牙耳机降噪",
            "Sony/索尼 MDR-EX255AP 入耳式耳机有线带麦重低音炮",
            "铁三角ATH-SR30BT无线蓝牙耳机运动跑步hifi头戴式全包耳重低音",
            "SENNHEISER/森海塞尔 IE 40 PRO 入耳式HIFI专业监听音乐耳机IE40",
            "飞利浦 SHP9500头戴式发烧音乐耳机游戏有线监听电脑网课",
            "舒尔 SE215-BT2入双耳式无线蓝牙耳塞运动手机通用hifi耳机",
            "Huawei华为FreeBuds3无线蓝牙耳机无线快充",
            "JBL T220TWS真无线蓝牙耳机耳麦手机通用立体声通话"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {1999,1399,599,299,399,788,999,799};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.airpodspro_s,R.drawable.sony_s,R.drawable.triangle_s,
            R.drawable.sennheiser_s,R.drawable.philips_s,R.drawable.shuer_s,
            R.drawable.huawei_s,R.drawable.jbl_s

    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.airpodspro,R.drawable.sony,R.drawable.triangle,
            R.drawable.sennheiser,R.drawable.philips,R.drawable.shuer,
            R.drawable.huawei,R.drawable.jbl

    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}


