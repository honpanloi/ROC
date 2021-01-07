import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import com.app.Calculater;
import com.app.CalculatorService;

public class TestCalculator {

	Calculater c = null;
	@Mock
	CalculatorService service;
	//CalculatorService service = mock(CalculatorService.class);
	
	@Rule
	public MockitoRule rule = MockitoJUnit.rule();
	
	@Before
	public void setUp() {
		c = new Calculater(service);
	}
	
	@Test
	public void testPerform() {
		when(service.sum(4, 5)).thenReturn(9);
		assertEquals(36, c.perform(4, 5));
		verify(service).sum(4, 5);
	}

}
