package mockito;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.mockito.Mockito.when;

public class MockitoTest {
    @Mock
    MyDataBase databaseMock;

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Test
    public void testQuery() {
        ClassToTest t = new ClassToTest(databaseMock);
        when(databaseMock.query("* from t")).thenReturn(true);
        boolean check = t.query("* from t");
        Assert.assertTrue(check);
    }
}
