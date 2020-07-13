/**
 * Created by IntelliJ IDEA.
 * User: persistant
 * Date: 2020-07-13
 */
package com.persistant.utils;

import com.persistant.utils.string.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StringUtilsTest {

    @Test
    public void reverse() {
        String reverse = StringUtils.reverse("123");
        System.out.println(reverse);
    }

    @Test
    public void isEmpty() {
//        boolean empty = StringUtils.isEmpty(null);
        boolean empty = StringUtils.isEmpty("");
        System.out.println(empty);

       /* 空指针异常
        String s = null;
        boolean empty1 = s.isEmpty();
        System.out.println(empty1);
        */

        String s = "";
        boolean empty1 = s.isEmpty();
        System.out.println(empty1);
    }

    @Test
    public void wordCount() {
        int count = StringUtils.wordCount("0", "121");
        System.out.println(count);
    }

    @Test
    public void wordsCount() {
        int count = StringUtils.wordsCount("ab", "ababacb");
        System.out.println(count);
    }

    @Test
    public void wordCountMap() {
        Map countMap = StringUtils.wordCount("adfav1234v");
        for (Object key : countMap.keySet()) {
            System.out.println(key.toString() + ":  " + countMap.get(key).toString());
        }
    }

    @Test
    public void wordsCountMap() {
        Map countMap = StringUtils.wordsCount("adfav");
        for (Object key : countMap.keySet()) {
            System.out.println(key.toString() + ":  " + countMap.get(key).toString());
        }
    }

}
