package controller;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

import com.google.inject.Inject;

@Resource
public class IndexController {
	
	private static final double VERSION = 0.4;
	
	@Inject
	private Result result;
	
	@Get("/")
	public void index() {
		result.include("version", VERSION);
	}

}
