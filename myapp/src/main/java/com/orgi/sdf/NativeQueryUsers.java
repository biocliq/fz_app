package com.orgi.sdf;

import org.springframework.stereotype.Component;

import com.zitlab.palmyra.api2db.handler.NativeQueryHandler;
import com.zitlab.palmyra.cinch.pojo.NativeQuery;
import com.zitlab.palmyra.cinch.pojo.SelectCriteria;
import com.zitlab.palmyra.cinch.pojo.Tuple;


@Component("nquery/nusers")
public class NativeQueryUsers implements NativeQueryHandler{


	@Override
	public int aclCheck(String arg0, String arg1, Tuple arg2) {
		return 7;
	}

	@Override
	public NativeQuery getQuery(String subType, String action, SelectCriteria filter) {
		NativeQuery result = new NativeQuery();
		result.setQuery("select id,name from palmyra.users");
		return result;
	}

}
