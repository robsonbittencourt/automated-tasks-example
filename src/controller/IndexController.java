package controller;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

import com.google.inject.Inject;

@Resource
public class IndexController {
	
	@Inject
	private Result result;
	
	@Get("/index")
	public void index() {
		result.include(0.1);
	}

}
