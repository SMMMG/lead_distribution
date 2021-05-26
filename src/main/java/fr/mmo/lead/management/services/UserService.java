package fr.mmo.lead.management.services;

import fr.mmo.lead.management.domain.dtos.UserCreate;
import fr.mmo.lead.management.domain.dtos.UserExistanceView;

public interface UserService {

    void create(UserCreate dto);

    UserExistanceView getUserExistance(String userName);
}
