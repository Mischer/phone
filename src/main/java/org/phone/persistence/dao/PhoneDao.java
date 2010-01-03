package org.phone.persistence.dao;

import java.util.List;

import org.phone.persistence.bean.Phone;

public interface PhoneDao extends Dao<Phone> {

	Phone get(Long id);

	List<Phone> getAll();

	List<Phone> search(String stext);

}
