package com.appsdeveloper.app.ws.userservice;

import com.appsdeveloper.app.ws.ui.model.request.UserDetailsRequestModel;
import com.appsdeveloper.app.ws.ui.model.response.UserRest;

public interface UserService {
	UserRest createUser(UserDetailsRequestModel userDetails);
}
