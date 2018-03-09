package com.onion.dao

import com.onion.model.Users
import onion.com.tgb.dao.GenericDao
import org.springframework.stereotype.Component

@Component
class UsersDao: GenericDao<Users, Long>() {

}