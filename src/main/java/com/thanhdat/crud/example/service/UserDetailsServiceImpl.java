package com.thanhdat.crud.example.service;

import com.thanhdat.crud.example.entity.Customer;
import com.thanhdat.crud.example.entity.Role;
import com.thanhdat.crud.example.reponsitory.CustomerRepository;
import com.thanhdat.crud.example.reponsitory.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.Set;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
        Customer customer = customerRepository.findByEmail(username);
        if(customer==null){
            throw new UsernameNotFoundException("User not found");
        }

        //get usename and password de xac nhan

        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        Set<Role> roles = roleRepository.getRolesFromUser(customer.getId());
        for(Role role : roles){
            grantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));
        }
        return new org.springframework.security.core.userdetails.User(customer.getEmail(),customer.getPassword(),grantedAuthorities);
        //return null;
    }

}
