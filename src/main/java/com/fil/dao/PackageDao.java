package com.fil.dao;

import java.util.List;

public interface PackageDao {
	List<Package> getPackage(String source, String destination);
}
