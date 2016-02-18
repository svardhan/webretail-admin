/**
 * 
 */
package com.rsinc.webretail.b2c.estore.domain.manager.impl;

import java.util.List;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import org.springframework.stereotype.Component;

import com.rsinc.webretail.b2c.estore.common.exception.BeanValidationException;
import com.rsinc.webretail.b2c.estore.common.util.Constants;
import com.rsinc.webretail.b2c.estore.data.dao.BaseDao;
import com.rsinc.webretail.b2c.estore.data.dao.UserDao;
import com.rsinc.webretail.b2c.estore.data.entity.UserBean;
import com.rsinc.webretail.b2c.estore.data.entity.enums.UserStatus;
import com.rsinc.webretail.b2c.estore.domain.manager.PartyEntityManager;
import com.rsinc.webretail.b2c.estore.domain.manager.UserEntityManager;

/**O
 * @author Roshan Titus 
 *
 */
@Component
@TransactionAttribute(TransactionAttributeType.MANDATORY)
public class UserEntityManagerImpl extends BaseEntityManagerImpl<UserBean> implements UserEntityManager {

	/**
	 * 
	 */
	@Inject
	private UserDao<UserBean> userDao;
	
	@Inject
	private PartyEntityManager partyEntityManager;
	
	public UserEntityManagerImpl() {
	}
	
	@Override
	public void setDefaultValues(UserBean userBean) {
	
		if(null == userBean.getRewardPoints())
		{
			userBean.setRewardPoints(Constants.ZERO);
		}
		if(null == userBean.getLocaleCode())
		{
			userBean.setLocaleCode(Constants.DEFAULT_LOCALE);
		}	
		if(null == userBean.getSubscribedForNewsLetterYN())
		{
			userBean.setSubscribedForNewsLetterYN(Constants.False);
		}		
		if(null == userBean.getStatus())
		{
			userBean.setStatus(UserStatus.NEW.toString());
		}		
		partyEntityManager.setDefaultValues(userBean.getParty());
		super.setDefaultValues(userBean);
	}

	@Override
	public void validateForCreate(UserBean userBean) throws BeanValidationException {
		if(null == userBean)
		{
			throw new IllegalArgumentException("UserBean object cannot be null"); 
		}			
		partyEntityManager.validateForCreate(userBean.getParty());
		super.validateForCreate(userBean);
	}

	@Override
	public BaseDao<UserBean> getDao() {
		return userDao;
	}
	
	@Override
	public UserBean loadById(Object id){

		return load(UserBean.class, id);
	}

	@Override
	public void deleteById(Object id){
		
		deleteById(UserBean.class, id);
	}

	/* (non-Javadoc)
	 * @see com.rsinc.webretail.b2c.estore.domain.manager.impl.BaseEntityManagerImpl#findAll(java.lang.Class)
	 */
	@Override
	public List<UserBean> findAll() {
		return getDao().findAll(UserBean.class);
	}
}