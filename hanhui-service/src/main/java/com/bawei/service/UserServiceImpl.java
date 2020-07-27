package com.bawei.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bawei.bean.Meeting;
import com.bawei.bean.Type;
import com.bawei.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	public List<Meeting> selAll() {
		// TODO Auto-generated method stub
		return userMapper.selAll();
	}

	public void addMeeting(Meeting meeting) {
		// TODO Auto-generated method stub
		userMapper.addMeeting(meeting);
	}

	public void update(Meeting mid) {
		// TODO Auto-generated method stub
		userMapper.update(mid);
	}

	public Meeting selM(Integer mid) {
		// TODO Auto-generated method stub
		return userMapper.selM(mid);
	}

	public List<Type> selType() {
		// TODO Auto-generated method stub
		return userMapper.selType();
	}
}
