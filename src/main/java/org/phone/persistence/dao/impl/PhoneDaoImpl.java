package org.phone.persistence.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Disjunction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.phone.persistence.bean.Phone;
import org.phone.persistence.dao.PhoneDao;

@SuppressWarnings("unchecked")
public class PhoneDaoImpl extends DaoImpl<Phone> implements PhoneDao {

	public Phone get(Long id) {
		return super.get(Phone.class, id);
	}

	@Override
	public List<Phone> getAll() {
		return getHibernateTemplate().loadAll(Phone.class);
	}

	@Override
	public List<Phone> search(String stext) {
		Disjunction disjunction = Restrictions.disjunction();
		disjunction.add(Restrictions.ilike("name", stext, MatchMode.ANYWHERE));
		disjunction.add(Restrictions.ilike("phone", stext, MatchMode.ANYWHERE));

		DetachedCriteria criteria = DetachedCriteria.forClass(Phone.class);
		criteria.add(disjunction);
		return getHibernateTemplate().findByCriteria(criteria);
	}

}
