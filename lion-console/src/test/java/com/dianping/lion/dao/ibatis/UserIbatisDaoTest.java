/**
 * Project: com.dianping.lion.lion-console-0.0.1
 * 
 * File Created at 2012-7-9
 * $Id$
 * 
 * Copyright 2010 dianping.com.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Dianping Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with dianping.com.
 */
package com.dianping.lion.dao.ibatis;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.dianping.lion.dao.UserDao;
import com.dianping.lion.entity.User;
import com.dianping.lion.support.AbstractDaoTestSupport;

public class UserIbatisDaoTest extends AbstractDaoTestSupport {
	
	@Autowired
	private UserDao userDao;

	@Test
	public void testGetTeams() {
		List<User> users = userDao.findAll();
		Assert.assertNotNull(users);
	}

}
