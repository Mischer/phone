package org.phone.persistence.dao;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly=true)
public interface Dao<T> {

	@Transactional(readOnly=false,propagation=Propagation.REQUIRES_NEW)
	void create(T instance);

	@Transactional(readOnly=false,propagation=Propagation.REQUIRES_NEW)
	void delete(T instance);

	@Transactional(readOnly=false,propagation=Propagation.REQUIRES_NEW)
	T update(T insance);
}
