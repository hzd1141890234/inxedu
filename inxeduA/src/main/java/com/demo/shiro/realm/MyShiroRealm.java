package com.demo.shiro.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.springframework.beans.factory.annotation.Autowired;



public class MyShiroRealm extends AuthenticatingRealm{

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken arg0) throws AuthenticationException {
		// TODO Auto-generated method stub
		return null;
	}

	/*@Autowired
	SysUserService sysUserService;
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token)
			throws AuthenticationException {
		
		UsernamePasswordToken uptoken = (UsernamePasswordToken) token;
		
		String username = uptoken.getUsername();
		String password = new String(uptoken.getPassword());
		System.out.println(username+"==="+password);
		SysUser sysUser = sysUserService.getSysUser(username);
		if(sysUser!=null){
			if(!sysUser.getPassword().equals(password)){
				throw new AuthenticationException("密码错误");
			}
		}else{
			throw new UnknownAccountException("用户不存在");
		}
		return new SimpleAuthenticationInfo(username, password, getName());
	}*/

}
