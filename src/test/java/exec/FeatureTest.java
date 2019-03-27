package exec;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Epic：第一级 Class之上
 * Feature: 第二级
 * Story：第三级
 */
@Epic("Epic 最大")
public class FeatureTest {

    @Test
    @Feature("Feature第二")
    @Story("Story第三")
    void test(){
        assertThat(1, is(2));
    }

    @Test
    @Feature("Feature第二")
    @Story("并列第三")
    void test2(){
        assertThat(1, equalTo(1));
    }

    @Test
    @Feature("并列第二")
    @Story("并列第二的下一级")
    void test3(){

    }

    @Test
    @Feature("并列第二")
    @Story("并列第二的并列第三")
    void test4(){

    }

}
