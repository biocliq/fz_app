package com.biocliq.myapp.admin;

import org.springframework.stereotype.Component;

import com.zitlab.palmyra.api2db.base.annotations.ApiMapping;
import com.zitlab.palmyra.cinch.pojo.QueryFilter;
import com.zitlab.palmyra.uiweb.handler.WebViewHandler;
import com.zitlab.palmyra.uiweb.handler.noop.MenuAuthorizationHandler;

@ApiMapping("group")
@Component
public class QueryGroup extends MenuAuthorizationHandler implements WebViewHandler{

	@Override
	public QueryFilter applyPreFilter(QueryFilter filter) {
		return filter;
	}
	
}
