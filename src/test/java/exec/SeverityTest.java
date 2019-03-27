package exec;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SeverityTest {

    @Test
    @Severity(SeverityLevel.BLOCKER)
    void block(){
        assertThat(1, is(1));
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    void critical(){
        assertThat(1, is(1));
    }

    @Test
    @Severity(SeverityLevel.MINOR)
    void minor(){
        assertThat(1, is(1));
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    void normal(){
        assertThat(1, is(1));
    }

    @Test
    @Severity(SeverityLevel.TRIVIAL)
    void trivial(){
        assertThat(1, is(1));
    }
}
