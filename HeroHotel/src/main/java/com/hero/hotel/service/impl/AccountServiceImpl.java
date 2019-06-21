package com.hero.hotel.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.ModelAndView;

import com.hero.hotel.dao.AccountDao;
import com.hero.hotel.pojo.Account;
import com.hero.hotel.service.AccountService;
import com.hero.hotel.utils.JuHeDemo;
import com.hero.hotel.utils.RegexUtil;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {
	// 手机验证码变量
	String tpl_value = "";
	@Resource
	private AccountDao accountDao;

	public AccountDao getAccountDao() {
		return accountDao;
	}

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	// 注册
	@Override
	public String register(Account account) {
		String result = "注册失败";
		System.out.println(11);
		// 账号校验
		result = checkAccount(account);
		if (!result.equals("账号通过")) {
			// result = "账号未通过";
			return result;
		}
		// 密码校验
		result = passWordCheck(account);
		System.out.println(33);
		if (!result.equals("密码通过")) {
			// result = "密码未通过";
			return result;
		}

		// 手机号校验
		result = tellCheck(account);
		if (!result.equals("手机号通过")) {
			// result = "手机号未通过";
			return result;
		}
		// 手机短信验证

		if (account.getCode() == null) {
			result = "请输入验证码";
			return result;
		}
		String code = account.getCode();
		if (!code.equals(tpl_value)) {
			result = "验证码不正确，请核对";
			return result;
		}

		// 数据库操作
		// 从数据库检测该账号是否可用
		Account realaccount = accountDao.findAccountByAccount(account);
		if (realaccount.getAccount() != null) {
			result = "账号已存在";
			return result;
		}
		// 给账号密码加密
		account.setPassword(new SimpleHash("MD5", account.getPassword(), null, 1024).toString());
		// 生成创建时间
		String createTime = new SimpleDateFormat("yy/MM/dd HH:mm:ss").format(new Date());
		account.setRegisterTime(createTime); // 将信息插入到数据库
		boolean b = accountDao.insertAccount(account);
		if (b) {
			result = "注册成功";
			return result;
		}

		return result;
	}

	// 给手机发送短信
	public String sendMessage(Account account) {
		String result = "短信发送失败";
		// // 验证码校验
		// if (account.getCode() == null || account.getCode() == "") {
		// result = "请填写验证码";
		// return result;
		// }
		String mobile = account.getTell();// 获取手机号
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
	public String checkAccount(Account account) {
		String result = "注册失败";
		// 非空判断
		if (account == null) {
			return result;
		}
		// 账号非空判断
		if (account.getAccount().length() == 0 || account.getAccount() == null) {
			result = "账号不能为空";
			return result;
		}

		/* 账号格式检测 */
		// 账号为大写或小写字母开头，6-20位字母或数字组成
		if (!account.getAccount().matches(RegexUtil.REGEX_ACCOUNT)) {
			result = "账号不合法，账号为大写或小写字母开头，6-20位字母或数字组成";
			return result;
		}
		result = "账号通过";
		return result;
	}

	// 密码验证
	public String passWordCheck(Account account) {
		String result = "注册失败";
		// 非空判断
		if (account == null) {
			return result;
		}
		// 密码非空判断
		if (account.getPassword().length() == 0 || account.getAccount() == null) {
			result = "密码不能为空";
			return result;
		}
		/* 密码格式验证 */
		// 密码为数字或字母开头，6-12位字符组成
		if (!account.getPassword().matches(RegexUtil.REGEX_PASSWORD)) {
			result = "密码不合法，账号为大写或小写字母开头，6-20位字母或数字组成";
			return result;
		}
		result = "密码通过";
		return result;
	}

	// 手机验证
	public String tellCheck(Account account) {
		String result = "注册失败";
		// 非空判断
		if (account == null) {
			return result;
		}
		// 手机号非空判断
		if (account.getTell().length() == 0 || account.getTell() == null) {
			result = "手机号不能为空";
			return result;
		}
		/* 手机号格式验证 */
		if (!account.getTell().matches(RegexUtil.REGEX_MOBILE)) {
			result = "手机号格式不合法，目前只支持13*，14*，15*，17*，18*号段的手机号";
			return result;
		}
		result = "手机号通过";
		return result;
	}

	// 图形 验证码验证
	public String codeCheck(Account account, HttpSession session) {
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
		if (!account.getCode().equals(code)) {
			result = "验证码错误";
			return result;
		}
		result = "验证码通过";
		return result;
	}

}
