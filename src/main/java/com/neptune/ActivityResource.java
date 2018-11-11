package com.neptune;
import java.util.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

import com.neptune.model.*;
import com.neptune.repository.*;

@Path("activities")
public class ActivityResource {

	 private ActivityRepository repository = new ActivityResourceStub();
	 
	 @GET
	 @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	 public List<Activity> getActivities()
	 {
		 //return "Hello World";
		 return repository.findAllActivities();
	 }
	 
	 @GET
	 @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	 @Path("{activityId}/user")
	 public User findActivity(@PathParam ("activityId") String activityId)
	 {
		 return repository.findActivity(activityId).getUser();
	 }
	 
	 @POST
	 @Consumes({MediaType.APPLICATION_FORM_URLENCODED})
	 @Path("activityParams")
	 public Activity CreateActivityParams(MultivaluedMap<String,String> formParams)
	 {
		 System.out.println(formParams.getFirst("description"));
		 System.out.println(formParams.getFirst("duration"));
		 
		 Activity activity = new Activity();
		 activity.setDescription(formParams.getFirst("description"));
		 activity.setDuration(Integer.parseInt(formParams.getFirst("duration")));
		 
		 repository.createActivity(activity);
		 return activity;
	 }
	 
	 @POST
	 @Consumes({MediaType.APPLICATION_JSON})
	 @Path("activity")
	 public Activity CreateActivity(Activity activity)
	 {
		
		 
		 repository.createActivity(activity);
		 return activity;
	 }
	 
}
