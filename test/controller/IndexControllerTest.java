package controller;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.MockitoAnnotations.initMocks;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import br.com.caelum.vraptor.util.test.MockResult;

public class IndexControllerTest {
	
	@InjectMocks
	private IndexController controller;
	@Mock
	private MockResult result;
	
	@Before
	public void setUp() {
		initMocks(this);
	}
	
	@Test
	public void shouldRedirectToIndexPageWhenRequestIndexUrl() {
		controller.index();
		verify(result).include(eq("versicon"), any(Double.class));
	}
}
