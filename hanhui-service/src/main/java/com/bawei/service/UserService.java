package com.bawei.service;

import java.util.List;

import com.bawei.bean.Meeting;
import com.bawei.bean.Type;

public interface UserService {

	public List<Meeting> selAll();
	
	public void addMeeting(Meeting meeting);
	
	public List<Type> selType();
	
	public Meeting selM(Integer mid);
	public void update(Meeting meeting);
}
