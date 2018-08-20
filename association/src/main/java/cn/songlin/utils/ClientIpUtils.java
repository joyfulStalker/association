package cn.songlin.utils;

import javax.servlet.http.HttpServletRequest;

/**
 * 获取客户端真实ip
 * 
 * @author liusonglin
 * @date 2018年8月20日
 */

public class ClientIpUtils {
	private static final String UNKNOWN = "unknown";

	/**
	 * 获取客户端真实ip
	 * 
	 * @param request
	 * @return
	 */
	public static String getClientIp(HttpServletRequest request) {
		String ip = request.getHeader("x-forwarded-for");
		if (ip == null || ip.length() == 0 || UNKNOWN.equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || UNKNOWN.equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || UNKNOWN.equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		return ip;
	}
}
