package com.hero.hotel.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hero.hotel.dao.UserDao;
import com.hero.hotel.pojo.User;
import com.hero.hotel.service.UserService;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.transaction.annotation.Transactional;

import com.hero.hotel.utils.JuHeDemo;
import com.hero.hotel.utils.RegexUtil;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
	// 手机验证码变量
	String tpl_value = "";
	@Resource
	private UserDao userDao;


	//查找所有vip
	public List<User> findAllVip() {

		return userDao.findAll();
	}
	
	// 注册
	@Override
	public String register(User user) {
		String result = "注册失败";
		// 账号校验
		result = checkAccount(user);
		if (!result.equals("账号通过")) {
			// result = "账号未通过";
			return result;
		}
		// 密码校验
		result = passWordCheck(user);
		if (!result.equals("密码通过")) {
			// result = "密码未通过";
			return result;
		}

		// 手机号校验
		result = tellCheck(user);
		if (!result.equals("手机号通过")) {
			// result = "手机号未通过";
			return result;
		}
		// 手机短信验证

		if (user.getCode() == null) {
			result = "请输入验证码";
			return result;
		}
		String code = user.getCode();
		if (!code.equals(tpl_value)) {
			result = "验证码不正确，请核对";
			return result;
		}

		// 数据库操作
		// 从数据库检测该账号是否可用
		User realuser = userDao.findAccountByAccount(user);
		if (realuser.getAccount() != null) {
			result = "账号已存在";
			return result;
		}
		// 给账号密码加密
		user.setPassword(new SimpleHash("MD5", user.getPassword(), null, 1024).toString());
		/*// 生成创建时间
		String createTime = new SimpleDateFormat("yy/MM/dd HH:mm:ss").format(new Date());*/
		user.setCreatetime(new Date());// 将信息插入到数据库
		boolean b = userDao.insertAccount(user);
		if (b) {
			result = "注册成功";
			return result;
		}
		return result;
	}

	// 给手机发送短信（注册或登录时使用）
	public String sendMessage(User user) {
		String result = "短信发送失败";
		String mobile = user.getTel();// 获取手机号
		int tpl_id = 166892;// 短信模板
		// 获取随机动态码
		tpl_value = "";
		for (int i = 0; i < 6; i++) {
			int k = (int) (Math.random() * 10);
			tpl_value += k;
		}
		boolean b1 = JuHeDemo.mobileQuery(mobile, tpl_id, tpl_value);
		// System.out.println(b1);
		if (tpl_value.length() == 6 && b1) {
			result = "短信发送成功，请注意查收";
			System.out.println("验证码：" + tpl_value);
			System.out.println(result);
			return result;
		}
		System.out.println(result);
		return result;
	}

	// 账号验证
	public String checkAccount(User user) {
		String result = "注册失败";
		// 非空判断
		if (user == null) {
			return result;
		}
		// 账号非空判断
		if (user.getAccount().length() == 0 || user.getAccount() == null) {
			result = "账号不能为空";
			return result;
		}

		/* 账号格式检测 */
		// 账号为大写或小写字母开头，6-20位字母或数字组成
		if (!user.getAccount().matches(RegexUtil.REGEX_ACCOUNT)) {
			result = "账号不合法，账号为大写或小写字母开头，6-20位字母或数字组成";
			return result;
		}
		result = "账号通过";
		return result;
	}

	// 密码验证
	public String passWordCheck(User user) {
		String result = "注册失败";
		// 非空判断
		if (user == null) {
			return result;
		}
		// 密码非空判断
		if (user.getPassword().length() == 0 || user.getAccount() == null) {
			result = "密码不能为空";
			return result;
		}
		/* 密码格式验证 */
		// 密码为数字或字母开头，6-12位字符组成
		if (!user.getPassword().matches(RegexUtil.REGEX_PASSWORD)) {
			result = "密码不合法，账号为大写或小写字母开头，6-20位字母或数字组成";
			return result;
		}
		result = "密码通过";
		return result;
	}

	// 手机验证
	public String tellCheck(User user) {
		String result = "注册失败";
		// 非空判断
		if (user == null) {
			return result;
		}
		// 手机号非空判断
		if (user.getTel().length() == 0 || user.getTel() == null) {
			result = "手机号不能为空";
			return result;
		}
		/* 手机号格式验证 */
		if (!user.getTel().matches(RegexUtil.REGEX_MOBILE)) {
			result = "手机号格式不合法，目前只支持13*，14*，15*，17*，18*号段的手机号";
			return result;
		}
		result = "手机号通过";
		return result;
	}

	// 图形 验证码验证(账号登录时使用)
	public String codeCheck(User user, HttpSession session) {
		String result = "注册失败";
		// 验证码非空判断
		// 获取code
		Object ocode = session.getAttribute("code");
		if (ocode == null) {
			result = "请输入验证码";
			return result;
		}
		// 判断
		String code = (String) ocode;
		if (!user.getCode().equals(code)) {
			result = "验证码错误";
			return result;
		}
		result = "验证码通过";
		return result;
	}
	/*
	 * 停用vip账号(non-Javadoc)
	 * @see com.hero.hotel.service.UserService#vipStop(java.lang.Integer)
	 */
	@Override
	public String vipStop(Integer id) {
		boolean boo=userDao.vipStop(id);
		if(boo){
			return "success";
		}
		return "defeat";
	}
	/*
	 * 启用被通用的用户账号(non-Javadoc)
	 * @see com.hero.hotel.service.UserService#vipStart(java.lang.Integer)
	 */
	@Override
	public String vipStart(Integer id) {
		boolean boo=userDao.vipStart(id);
		if(boo){
			return "success";
		}
		return "defeat";
	}
	/*
	 * 删除用户账号(non-Javadoc)
	 * @see com.hero.hotel.service.UserService#userDelete(java.lang.Integer)
	 */
	@Override
	public String userDelete(Integer id) {
		boolean boo=userDao.userDelete(id);
		if(boo){
			return "success";
		}
		return "defeat";
	}
	/*
	 * 获取所有已删除的会员(non-Javadoc)
	 * @see com.hero.hotel.service.UserService#findAllDeletedVips()
	 */
	@Override
	public List<User> findAllDeletedVips() {
		
		return userDao.findAllDeletedVips();
	}
	

}
