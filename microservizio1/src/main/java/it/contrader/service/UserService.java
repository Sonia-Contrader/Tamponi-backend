package it.contrader.service;

import it.contrader.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.contrader.dao.UserRepository;
import it.contrader.dto.UserDTO;
import it.contrader.mapper.UtenzaMapper;

import java.util.List;

@Service
public class UserService {
	
	 UtenzaMapper utenzaMapper = UtenzaMapper.INSTANCE;
	 @Autowired
	 UserRepository userRepository;

	 public List<UserDTO> getAll(){
		 return utenzaMapper.toUserList((List<User>) userRepository.findAll());
	 }
	
	//LOGIN method
	public UserDTO findByUsernameAndPassword(String username, String password) {
		return utenzaMapper.toUser((userRepository).findByUsernameAndPassword(username, password));
	}

}
