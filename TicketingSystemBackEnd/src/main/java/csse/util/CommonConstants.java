package csse.util;

public class CommonConstants {

	/*
	 * Route constants
	 */
	///main
	public final static String ROUTE_USER_MAIN = "/api/user";
	public final static String ROUTE_LOCAL_USER_MAIN = "/api/localuser";
	public final static String ROUTE_FOREIGN_USER_MAIN = "/api/foreignuser";
	public final static String ROUTE_RIDE_MAIN = "/api/ride";

	///common
	public final static String ROUTE_CREATE = "/create";
	public final static String ROUTE_SINGLE = "/fetch/{id}";
	public final static String ROUTE_USER_LOGIN = "/login/{id}/{password}";
	public final static String ROUTE_CHECK_BALANCE = "/checkbalance/{id}";
	public final static String ROUTE_CHECK_USERNAME_IS_EXISTS = "/checkusernameisexists/{username}";
	public final static String ROUTE_CREATE_RIDE = "/createride/{tokenNumber}/{busNumber}/{latitude}/{longitude}";
	public final static String testRide = "/testRide/{id}";

}
