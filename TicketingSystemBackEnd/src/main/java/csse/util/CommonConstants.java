package csse.util;

public class CommonConstants {

	/*
	 * Route constants
	 */
	///main
	public final static String ROUTE_ADMIN_MAIN = "/api/admin";
	public final static String ROUTE_STUDENT_MAIN = "/api/student";
	public final static String ROUTE_TUTOR_MAIN = "/api/tutor";
	public final static String ROUTE_USER_MAIN = "/api/user";
	public final static String ROUTE_LOCAL_USER_MAIN = "/api/localuser";
	public final static String ROUTE_INSTITUTE_MAIN = "/api/institute";
	public final static String ROUTE_COURSE_MAIN = "/api/course";
	public final static String ROUTE_AUTH_MAIN = "/api/auth";
	public final static String ROUTE_VIDEO_MAIN = "/api/video";

	///common
	public final static String ROUTE_CREATE = "/create";
	public final static String ROUTE_UPDATE = "/update";
	public final static String ROUTE_ALL = "/fetch/all";
	public final static String ROUTE_COUNT = "/fetchcount";
	public final static String ROUTE_SINGLE = "/fetch/{id}";
	public final static String ROUTE_PAGINATION_ADMIN = "/fetch/{name}/{email}/{nic}/{address}/{page}/{limit}";
	public final static String ROUTE_PAGINATION_STUDENT = "/fetch/{name}/{email}/{nic}/{address}/{type}/{status}/{page}/{limit}";
	public final static String ROUTE_PAGINATION_TUTOR = "/fetch/{name}/{email}/{nic}/{address}/{page}/{limit}";
	public final static String ROUTE_PAGINATION_COURSE = "/fetch/{name}/{grade}/{tutor}/{page}/{limit}";
	public final static String ROUTE_REMOVE = "/remove/{id}";
	public final static String ROUTE_AUTHENTICATE = "/authenticate";

}
