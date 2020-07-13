/**
 * Created by IntelliJ IDEA.
 * User: persistant
 * Date: 2020-07-13
 */
package com.persistant.utils.string;

import java.util.HashMap;
import java.util.Map;

public class StringUtils {

    /*判断一个字符串是否为空值，包含null和""*/
    public static boolean isEmpty(String s) {
       /* if (s != null) {
            return s.isEmpty();
        }
        return true;*/

        /*return !(s !=null && !s.equals(""));*/
        return !(s != null && s.length() != 0);
    }

    /*字符串反转*/
    public static String reverse(String s) {
        int length = s.length();
        String reverse = "";
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + s.charAt(i);
        }
        /*for (int i = 0; i < length; i++) {
            reverse = s.charAt(i) + reverse;
        }*/

        /*char[] chars = s.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            reverse = reverse + chars[i];
        }*/

        return reverse;
    }

    /*计算某个字符在字符串中的个数*/
    public static int wordCount(String word, String s) {
        int count = 0;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            if (word.equals(s.charAt(i) + "")) {
                count++;
            }
        }
        return count;
    }

    /*统计某一字符串在字符串中出现的次数*/
    public static int wordsCount(String words, String s) {
        int count = 0;
        int wordsLength = words.length();
        int sLength = s.length();

      /*  //为防止越界，计算最后循环位，若子串长度为2，串长度为4，则最后循环位下标位为2，即串第3位
        for (int i = 0; i < sLength - wordsLength + 1; i++) {
            //定义标志位
            int start = 0;
            for (int j = 0; j < wordsLength && words.charAt(j) == s.charAt(i + j); j++) {
                start++;
            }
            //若标志位等于子串，代表出现一次
            if (start == wordsLength) {
                count++;
            }
        }*/

        for (int i = 0; i < sLength - wordsLength + 1; i++) {
            String substring = s.substring(i, i + wordsLength);
            if (substring.equals(words)) {
                count++;
            }
        }

        return count;
    }

    /*统计字符串中出现的字符及次数*/
    public static Map wordCount(String s) {
        Map<String, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            String key = chars[i] + "";
            Integer value = map.get(key);
            if (map.keySet().contains(key)) {
                map.put(key, value + 1);
            } else {
                map.put(key, 1);
            }
        }
        return map;
    }

    /*统计字符串中出现的子串及其次数*/
    public static Map wordsCount(String s) {
        Map<String, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            String key = "";
            for (int j = 0; j < chars.length - i; j++) {
                key += chars[i + j];
                Integer value = map.get(key);
                if (map.containsKey(key)) {
                    map.put(key, value + 1);
                } else {
                    map.put(key, 1);
                }
            }
        }
        return map;
    }
}
