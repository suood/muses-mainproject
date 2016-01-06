package com.muses.spider;

import com.alibaba.fastjson.JSON;
import org.apache.commons.lang3.StringEscapeUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Alexander on 15/12/24.
 */
public class SimpleSpider {
    public static  final  String HTML_REG = "</?[^>]+>";
    public static  final String UN_EXPECT_CHAR = "<a>\\s*|\t|\r|\n</a>";
    public static  final String START_URL = "http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/2013/";
    public static void main(String[] args) throws IOException {

        BufferedWriter writer = null;
        String logFilePath  ="/Users/Alexander/Documents/test.txt";
        try {
            //create a temporary file
            File logFile = new File(logFilePath);

            // This will output the full path where the file will be written to...
            System.out.println(logFile.getCanonicalPath());

            writer = new BufferedWriter(new FileWriter(logFile));
        getArea("http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/2013/53.html",0,writer);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Close the writer regardless of what happens...
                writer.close();
            } catch (Exception e) {
            }
        }
    }
    public static void getArea(String startUrl,int times4Id,BufferedWriter writer) throws IOException {


        Document doc = Jsoup.connect(startUrl).timeout(60*1000*3600).get();

        Elements elements = doc.getElementsByTag("a");
        Set <String> set = new HashSet();
//        for (Element element : elements) {
//            if (element.attr("href").equals("http://www.miibeian.gov.cn/")){
//                continue;
//            }
////            System.out.println(times4Id + ":" + element.attr("href").substring(0, element.attr("href").indexOf(".")) + ":" + element.html().replaceAll(HTML_REG, "").replaceAll(UN_EXPECT_CHAR, ""));
//            if(!checkChar(element.html().replaceAll(HTML_REG, "").replaceAll(UN_EXPECT_CHAR, "")) || !set.add(doc.location().substring(0,doc.location().lastIndexOf("/")+1)+element.attr("href"))){
//                    continue;
//                }
//
////             element.attr("href").substring(0, element.attr("href").indexOf(".")) + ":" + element.html().replaceAll(HTML_REG, "").replaceAll(UN_EXPECT_CHAR, ""));
//        }

        Elements elementsTrTowns= doc.select("tr.towntr");
        for (Element elementsTrTown : elementsTrTowns) {
            Elements elementsTDTowns = elementsTrTown.children();
            Element elementTdTownFirst = elementsTDTowns.first();
            Element elementTdTownLast = elementsTDTowns.last();
             Element elementAFirst =   elementTdTownFirst.child(0);
            Element elementALast =   elementTdTownLast.child(0);
            System.out.print(elementAFirst.attr("href").substring(0, elementAFirst.attr("href").indexOf("."))+":"+elementAFirst.html()+":"+elementALast.html().replaceAll(HTML_REG, "").replaceAll(UN_EXPECT_CHAR, "")+"\n");
            writer.write(elementAFirst.attr("href").substring(0, elementAFirst.attr("href").indexOf("."))+":"+elementAFirst.html()+":"+elementALast.html().replaceAll(HTML_REG, "").replaceAll(UN_EXPECT_CHAR, "")+"\n");
            set.add(doc.location().substring(0, doc.location().lastIndexOf("/") + 1) + elementAFirst.attr("href"));

        }
        Elements elementsTrProvinces= doc.select("tr.provincetr");
        for (Element elementsTrProvince : elementsTrProvinces) {
            Elements elementsTDProvinces = elementsTrProvince.children();
            Element elementTdTownFirst = elementsTDProvinces.first();
            Element elementAFirst =   elementTdTownFirst.child(0);
            System.out.print(elementAFirst.attr("href").substring(0, elementAFirst.attr("href").indexOf(".")) + ":" + elementAFirst.html().replaceAll(HTML_REG, "").replaceAll(UN_EXPECT_CHAR, "") + "\n");
            writer.write(elementAFirst.attr("href").substring(0, elementAFirst.attr("href").indexOf("."))+":"+elementAFirst.html().replaceAll(HTML_REG, "").replaceAll(UN_EXPECT_CHAR, "")+"\n");
            set.add(doc.location().substring(0, doc.location().lastIndexOf("/") + 1) + elementAFirst.attr("href"));

        }

        Elements elementsTrCountys= doc.select("tr.countytr");
        for (Element elementsTrCounty : elementsTrCountys) {
            Elements elementsTDCountys = elementsTrCounty.children();
            Element elementTdCountyFirst = elementsTDCountys.first();
            Element elementTdCountyLast = elementsTDCountys.last();
            if(elementTdCountyFirst.children().size()<1){
                continue;
            }
            Element elementCountyAFirst =  elementTdCountyFirst.children().size()>0?elementTdCountyFirst.child(0):elementTdCountyFirst;
            Element elementCountyALast =   elementTdCountyLast.children().size()>0?elementTdCountyLast.child(0):elementTdCountyLast;
            System.out.print(elementCountyAFirst.attr("href").substring(0, elementCountyAFirst.attr("href").indexOf(".")) + ":" + elementCountyAFirst.html() + ":" + elementCountyALast.html().replaceAll(HTML_REG, "").replaceAll(UN_EXPECT_CHAR, "")+"\n");
            writer.write(elementCountyAFirst.attr("href").substring(0, elementCountyAFirst.attr("href").indexOf(".")) + ":" + elementCountyAFirst.html() + ":" + elementCountyALast.html().replaceAll(HTML_REG, "").replaceAll(UN_EXPECT_CHAR, "")+"\n");
            set.add(doc.location().substring(0, doc.location().lastIndexOf("/") + 1) + elementCountyAFirst.attr("href"));

        }
        Elements elementsTrCitys = doc.select("tr.citytr");
        for (Element elementsTrCity : elementsTrCitys) {
            Elements elementsTdCitys = elementsTrCity.children();
            Element elementTdCityFirst = elementsTdCitys.first();
            Element elementTdCityLast = elementsTdCitys.last();
            Element elementCityAFirst =   elementTdCityFirst.child(0);
            Element elementCityALast =   elementTdCityLast.child(0);
            System.out.print(elementCityAFirst.attr("href").substring(0, elementCityAFirst.attr("href").indexOf(".")) + ":" + elementCityAFirst.html() + ":" + elementCityALast.html().replaceAll(HTML_REG, "").replaceAll(UN_EXPECT_CHAR, "") + "\n");
            writer.write(elementCityAFirst.attr("href").substring(0, elementCityAFirst.attr("href").indexOf(".")) + ":" + elementCityAFirst.html() + ":" + elementCityALast.html().replaceAll(HTML_REG, "").replaceAll(UN_EXPECT_CHAR, "")+"\n");
            set.add(doc.location().substring(0, doc.location().lastIndexOf("/") + 1) + elementCityAFirst.attr("href"));

        }
        if (set.size()>0){

            for (String s : set) {
                getArea(s,times4Id,writer);
            }
        }
        else {

           String refer = doc.location().replaceAll(START_URL,"");
            refer =  refer.substring(0, refer.lastIndexOf("."));
            Elements els= doc.select("tr.villagetr");
            for (Element el : els) {
                StringBuffer sb = new StringBuffer(refer+":");
                Elements tdEls = el.children();
                for (Element tdEl : tdEls) {
                    if(tdEl.html().length()<4 && !checkChar(tdEl.html().replaceAll(HTML_REG, "").replaceAll(UN_EXPECT_CHAR, ""))){
                        continue;
                    }
                    sb.append(tdEl.html() + ":"+"\n");
                }
                System.out.print(sb.toString());
                writer.write(sb.toString());
            }
        }

    }
    public static boolean checkChar(String str){
        Pattern p_str = Pattern.compile("[\\u4e00-\\u9fa5]+");

        Matcher m = p_str.matcher(str);
        if(m.find()&&m.group(0).equals(str)) {
            return true;
        }else {
            return false;
        }
    }
}