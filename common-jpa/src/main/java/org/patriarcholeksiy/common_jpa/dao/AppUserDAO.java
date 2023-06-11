package org.patriarcholeksiy.common_jpa.dao;

import org.patriarcholeksiy.common_jpa.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserDAO extends JpaRepository<AppUser, Long> {
}
