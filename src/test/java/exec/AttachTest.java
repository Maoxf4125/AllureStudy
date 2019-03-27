package exec;

import io.qameta.allure.Attachment;
import org.junit.jupiter.api.Test;

public class AttachTest {

    @Test
    @Attachment(value = "screen shot",type = "image/png")
    public byte[] getScreenTest(byte[] screenShot){

        return screenShot;
//        return Driver.getDriver().getScreenshotAs(OutputType.BYTES);
    }

    @Test
    @Attachment
    public String performedActionsTest(String text) {
        return text;
    }
}
