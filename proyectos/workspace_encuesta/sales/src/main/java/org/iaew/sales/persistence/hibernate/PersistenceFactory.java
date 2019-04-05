package org.iaew.sales.persistence.hibernate;

import org.iaew.sales.persistence.facade.exception.PersistenceException;
import org.iaew.sales.persistence.facade.ICustomerPromotionPersist;
import org.iaew.sales.persistence.hibernate.CustomerPromotionPersist;
import org.iaew.sales.persistence.hibernate.HibernateUtil;

public class PersistenceFactory{
	public ICustomerPromotionPersist getCustomerPromotionPersist()
			throws PersistenceException {

		return new CustomerPromotionPersist(HibernateUtil.getSessionFactory()
				.openSession());
	}
}
