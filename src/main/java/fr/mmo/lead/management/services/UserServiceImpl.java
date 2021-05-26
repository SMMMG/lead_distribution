package fr.mmo.lead.management.services;

import org.springframework.stereotype.Service;

import fr.mmo.lead.management.domain.dtos.UserCreate;
import fr.mmo.lead.management.domain.dtos.UserExistanceView;
import fr.mmo.lead.management.domain.entities.User;
import fr.mmo.lead.management.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository repository;

    public UserServiceImpl(UserRepository repository) {
	this.repository = repository;
    }

    @Override
    public void create(UserCreate dto) {
	// TODO Auto-generated method stub
	if (repository.findByUserName(dto.getUserName()).isEmpty() == true) {
	    User user = new User();
	    user.setUserName(dto.getUserName());
	    user.setPassword(dto.getPassword());
	    repository.save(user);
	}
    }

    @Override
    public UserExistanceView getUserExistance(String userName) {
	// TODO Auto-generated method stub
	boolean userFlag = false;
	if (userName != null) {
	    userFlag = !repository.findByUserName(userName).isEmpty();// .get();
	}

	UserExistanceView view = new UserExistanceView();

	view.setFullMatch(userFlag);
	// view.setStartWithFlag(false);
	return view;
    }

}
