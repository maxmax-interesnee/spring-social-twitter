/*
 * Copyright 2010 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.social.twitter;


/**
 * Interface specifying a basic set of operations for interacting with Twitter.
 * Implemented by TwitterTemplate. Not often used directly, but a useful option
 * to enhance testability, as it can easily be mocked or stubbed.
 *
 * @author Craig Walls
 */
public interface TwitterApi {

	/**
	 * Retrieves a list of users that the given user is being followed by
	 * @param screenName The user's Twitter screen name
	 * @return a list of user screen names
	 */
	List<String> getFollowers(String screenName);
	
	/**
	 * Allows the authenticated user to follow (create a friendship) with another user.
	 * @param screenName The screen name of the user to follow
	 * @return the name of the followed user if successful
	 */
	String follow(String screenName);

	/**
	 * Allows the authenticated use to unfollow (destroy a friendship) with another user
	 * @param screenName the screen name of the use to unfollow 
	 * @return the name of the unfolloed user if successful 
	 */
	String unfollow(String screenName);

}