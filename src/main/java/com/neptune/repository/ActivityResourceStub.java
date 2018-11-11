package com.neptune.repository;

import java.util.ArrayList;
import java.util.List;

import com.neptune.model.Activity;
import com.neptune.model.User;

public class ActivityResourceStub implements ActivityRepository {
   
	@Override
	public void createActivity(Activity activity) {
		
	    Activity activity1 = activity;
	}
	
	

	@Override
	public List<Activity> findAllActivities()
	{
		List<Activity> activities = new ArrayList<Activity>();
		
		
		
		Activity activity1 = new Activity();
		activity1.setDescription("Swimming");
		activity1.setDuration(30);
		
		Activity activity2 = new Activity();
		activity2.setDescription("Cycling");
		activity2.setDuration(30);
		
		Activity activity3 = new Activity();
		activity3.setDescription("Running");
		activity3.setDuration(50);
		
		activities.add(activity1);
		activities.add(activity2);
		activities.add(activity3);
		
		return activities;
	}
	
	@Override
	public Activity findActivity(String activityId)
	{
		Activity activity2 = new Activity();
		activity2.setDescription("Cycling");
		activity2.setDuration(30);
		activity2.setId("1234");
		
		User user = new User();
		user.setId("5768");
		user.setName("Samir");
		activity2.setUser(user);
		
		return activity2;
	
	}
   
}
