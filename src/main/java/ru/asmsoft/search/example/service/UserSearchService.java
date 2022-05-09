package ru.asmsoft.search.example.service;

import org.springframework.stereotype.Service;
import ru.asmsoft.search.example.repository.UserRepository;
import ru.asmsoft.search.example.entity.User;
import ru.asmsoft.search.service.SearchService;

@Service
public class UserSearchService extends SearchService<User, UserRepository> {
    public UserSearchService(UserRepository repository) {
        super(repository);
    }
}
