package com.thanhdat.crud.example.reponsitory;

import com.thanhdat.crud.example.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Set;

public interface RoleRepository extends JpaRepository<Role,Integer> {
    Role findByName(String name);

    //https://www.baeldung.com/spring-data-jpa-query
    @Query("SELECT new com.thanhdat.crud.example.entity.Role(r.id,r.name) from Role r join UserRole u on r.id = u.roleId join Customer c on u.userId = c.id where c.id = ?1")
    public Set<Role> getRolesFromUser(int id);
}
