package org.xs.bookrack.web.common.security;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xs.bookrack.api.entity.UserInfo;
import org.xs.bookrack.api.service.UserService;

/**
 * 安全认证实现类
 */
@Service
public class UserRealm extends AuthorizingRealm {
	
	@Autowired
	UserService userService;
	
	/**
	 * 获取授权信息
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		
		UserInfo userInfo = (UserInfo) getAvailablePrincipal(principals);
		
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		info.addStringPermission("admin");
		
		return info;
	}

	/**
	 * 获取认证信息
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken) throws AuthenticationException {
		
		UsernamePasswordToken token = (UsernamePasswordToken) authcToken;
		
		//验证用户信息
		UserInfo userInfoReq = new UserInfo();
		userInfoReq.setEmail(token.getUsername());
		userInfoReq.setPassword(String.valueOf(token.getPassword()));
		UserInfo userInfo = userService.get(userInfoReq);
		if(userInfo != null) {
			
			return new SimpleAuthenticationInfo(userInfo, userInfo.getPassword(), getName());
		} else {
			throw new UnknownAccountException();
		}
	}
}
