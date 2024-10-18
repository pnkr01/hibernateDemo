package com.fil.impl;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.fil.dao.EntityManagerFactoryProvider;
import com.fil.dao.PackageDao;

import java.util.List;

public class PackageDaoImpl implements PackageDao{
//	private PackageDao packageDao;
//
	public PackageDaoImpl() {
	}

	@Override
	public List<Package> getPackage(String source, String destination) {
		EntityManager em = EntityManagerFactoryProvider.getEntityManagerFactory();
		Query query = em.createQuery("SELECT p from Package p WHERE p.pkg_src=:source AND p.pkg_description=:destination", Package.class);
		query.setParameter("source", source);
		query.setParameter("destination", destination);
		return query.getResultList();
	}
}
