package com.neptune.repository;

import java.util.List;

import com.neptune.model.Activity;

public interface ActivityRepository {

	List<Activity> findAllActivities();

	Activity findActivity(String activityId);

	void createActivity(Activity activity);

}