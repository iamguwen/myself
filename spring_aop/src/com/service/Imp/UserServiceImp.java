package com.service.Imp;

import com.service.UserService;

public class UserServiceImp implements UserService {

	@Override
	public void delete() {
		System.out.println("删除用户");
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("添加用户");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("更新用户");
	}

	@Override
	public void serach() {
		// TODO Auto-generated method stub
		System.out.println("查找用户");
	}
	
}
