package io.jpress.front.controller;

import io.jpress.Consts;
import io.jpress.core.BaseFrontController;
import io.jpress.router.RouterMapping;

@RouterMapping(url = Consts.ROUTER_ABOUT)
public class AboutController extends BaseFrontController {
	
	public void index() {
		render("about.html");
	}
}
