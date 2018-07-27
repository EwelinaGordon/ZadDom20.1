import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;


public class SumOfMultiplyTest {

    @Test
    public void shouldReturnZeroFromZero(){
        //given
        SumOfMultiply sumOfMultiply = new SumOfMultiply();
        int a = 0;
        //when
        int result = sumOfMultiply.sumOfMultiply(a);
        //then
        Assert.assertThat(result, CoreMatchers.is(0));
    }

    @Test
    public void shouldReturn23From10(){
        //given
        SumOfMultiply sumOfMultiply = new SumOfMultiply();
        int a = 10;
        //when
        int result = sumOfMultiply.sumOfMultiply(a);
        //then
        Assert.assertThat(result, CoreMatchers.is(23));
    }

    @Test
    public void shouldReturn0From1000(){
        //given
        SumOfMultiply sumOfMultiply = new SumOfMultiply();
        int a = 1000;
        //when
        int result = sumOfMultiply.sumOfMultiply(a);
        //then
        Assert.assertThat(result, CoreMatchers.is(0));
    }

    }

