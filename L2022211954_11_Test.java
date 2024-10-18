import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;

/**
 *输入的数组可分为：含有2个及以下元素的整数数组，含有3个及以上的整数数组
 * 含有3个及以上的数组可分为：元素全是正数，全是负数，全是0，有正数也有负数
 */
class L2022211954_11_Test{

    @Test
        /*
         * 测试传入的整数数组的元素个数少于3个的情况
         * 测试用例：{1，2}
         * */
    void test1() {
        int[] nums = {1,2};
        Solution11 a = new Solution11();
        Assertions.assertEquals(0,a.threeSum(nums).size());
    }

    @Test
        /*
         * 测试传入的整数数组元素全是正数的情况
         * 测试用例：{1，2，3}*/
    void test2(){
        int[] nums = {1,2,3};
        Solution11 a = new Solution11();
        Assertions.assertEquals(0,a.threeSum(nums).size());
    }

    @Test
        /*
         * 测试传入的整数数组元素全是负数的情况
         * 测试用例：{-1，-2，-3}*/
    void test3(){
        int[] nums = {-1,-2,-3};
        Solution11 a = new Solution11();
        Assertions.assertEquals(0,a.threeSum(nums).size());
    }

    @Test
        /*
         * 测试传入的整数数组元素全是0的情况
         * 测试用例：{0，0，0，0}*/
    void test4(){
        int[] nums = {0,0,0,0};
        Solution11 a = new Solution11();
        Assertions.assertEquals(1,a.threeSum(nums).size());
    }

    @Test
        /*
         * 测试传入的整数数组元素有正有负的情况
         * 测试用例：{1，-1，0，2，-1}*/
    void test5(){
        int[] nums = {1,-1,0,2,-1};
        Solution11 a = new Solution11();
        Assertions.assertEquals(2,a.threeSum(nums).size());
    }


}