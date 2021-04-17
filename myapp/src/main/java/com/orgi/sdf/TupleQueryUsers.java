package com.orgi.sdf;

import org.springframework.stereotype.Component;

import com.zitlab.palmyra.api2db.handler.QueryHandler;
import com.zitlab.palmyra.cinch.pojo.QueryFilter;
import com.zitlab.palmyra.cinch.pojo.Tuple;

@Component("query/Users")
public class TupleQueryUsers implements QueryHandler{

	@Override
	public int aclCheck(String subType, String action, Tuple item) {
		return 7;
	}

	@Override
	public QueryFilter applyPreFilter(QueryFilter filter) {
		return filter;
	}

}
