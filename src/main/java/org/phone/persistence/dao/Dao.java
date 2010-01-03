package org.phone.persistence.dao;

public interface Dao<T> {

	void create(T instance);

	void delete(T instance);

	T update(T insance);
}
