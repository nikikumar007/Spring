package com.training.ifaces;



import java.util.List;

import com.training.model.BloodDonor;

public interface DataAccess<T> {
	public int add(T t);
    public List<BloodDonor> findAll();
}
