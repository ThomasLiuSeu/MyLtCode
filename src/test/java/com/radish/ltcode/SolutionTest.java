package com.radish.ltcode;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by admin on 2019/4/10.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SolutionTest {

    @Autowired
    Solution solution;

    @Test
    public void LT_387() {
        int res = solution.firstUniqChar("leetcode");
        System.out.println(res);
    }
}
