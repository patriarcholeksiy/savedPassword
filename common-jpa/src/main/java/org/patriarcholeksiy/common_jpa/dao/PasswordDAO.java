package org.patriarcholeksiy.common_jpa.dao;

import org.patriarcholeksiy.common_jpa.entity.Password;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PasswordDAO extends JpaRepository<Password, Long> {
}
