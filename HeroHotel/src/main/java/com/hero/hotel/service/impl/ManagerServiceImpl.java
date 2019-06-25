package com.hero.hotel.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hero.hotel.dao.InfoDao;
import com.hero.hotel.dao.ManagerDao;
import com.hero.hotel.pojo.Info;
import com.hero.hotel.pojo.User;
import com.hero.hotel.service.ManagerService;

@Service("managerService")
@Transactional
public class ManagerServiceImpl implements ManagerService{
	@Resource
	private ManagerDao managerDao;
	@Resource
	private InfoDao infoDao;

	/*
	 * 通过用户账号查找密码(non-Javadoc)
	 * @see com.hero.hotel.service.ManagerService#findManagerPwd(java.lang.Integer)
	 */

	@Override
	public User findManagerPwd(String account) {
		// TODO Auto-generated method stub
		return managerDao.findManagerPwd(account);
	}
	/*
	 * 获取所有管理员信息(non-Javadoc)
	 * @see com.hero.hotel.service.UserService#findAllManagers()
	 */
	@Override
	public List<User> findAllManagers() {
		
		return managerDao.findAllManagers();
	}
	/*
	 * 将禁用的管理员改为启用(non-Javadoc)
	 * @see com.hero.hotel.service.ManagerService#enable(java.lang.Integer)
	 */
	@Override
	public boolean enable(Integer id) {
		
		return managerDao.enable(id);
	}
	/*
	 * 把启用的管理员改为停用状态(non-Javadoc)
	 * @see com.hero.hotel.service.ManagerService#unable(java.lang.Integer)
	 */
	@Override
	public boolean unable(Integer id) {
		
		return managerDao.unable(id);
	}
	/*
	 * 删除管理员(non-Javadoc)
	 * @see com.hero.hotel.service.ManagerService#deleteManager(java.lang.Integer)
	 */
	@Override
	public boolean deleteManager(Integer id) {
		
		return managerDao.deleteManager(id);
	}
	/*
	 * 根据id获取管理员信息(non-Javadoc)
	 * @see com.hero.hotel.service.ManagerService#findManagerById(java.lang.Integer)
	 */
	@Override
	public User findManagerById(Integer id) {
		
		return managerDao.findManagerById(id);
	}
	/*
	 * 修改manager的信息(non-Javadoc)
	 * @see com.hero.hotel.service.ManagerService#updateMessage(com.hero.hotel.pojo.User, com.hero.hotel.pojo.Info)
	 */
	@Override
	public boolean updateMessage(User manager, Info info) {
		//更新管理员角色
		boolean b1=managerDao.updateManagerRole(manager);
		//更新管理员的个人信息
		boolean b2=infoDao.updateManagerMessage(info);
		System.out.println(b1+"==========="+b2);
		if(b1 && b2){
			return true;
		}
		return false;
	}
	/*
	 * 添加新的管理员(non-Javadoc)
	 * @see com.hero.hotel.service.ManagerService#addManager(com.hero.hotel.pojo.User)
	 */
	@Override
	public boolean addManager(User manager,Info info) {
		//判断个人信息是否已经存在
		Integer infoid=infoDao.findInfoidByInfo(info);
		if(infoid!=0){
			return false;
		}else{
			//插入管理员的个人信息
			boolean b1=infoDao.addInfo(info);
			if(b1){
				//获取新插入的个人信息的id
				infoid=infoDao.findInfoidByInfo(info);
				manager.setInfoid(infoid);
				//插入新的管理员账号信息
				boolean b2=managerDao.addManager(manager);
				if(b2){
					return true;
				}
			}
		}
		return false;
	}
	

}
