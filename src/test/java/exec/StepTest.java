package exec;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Test;

public class StepTest {

    @Step("执行了first")
    void first(){
        //TODO
    }

    @Step("执行了Second")
    void second(){
        //TODO
    }

    @Step("执行Third，输入{message}")
    void third(String message){

    }

    @Step("执行Fourth，参数1 = {0}， 参数2 = {1}")
    void fourth(String message, String message2){

    }

    @Test
    @Step("只执行first")
    void test1(){
        first();
    }

    @Test
    @Step("执行first、Second")
    void test2(){
        first();
        second();
    }

    @Test
    @Step("按顺序执行First、Second、Third、Fourth")
    void test3(){
        first();
        second();
        third("Test");
        fourth("msg1", "msg2");
    }

    @Test
    @Step("执行Third、First、Fourth")
    void test4(){
        third("First");
        first();
        fourth("Study", "Step");
    }
}
