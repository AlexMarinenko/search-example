package ru.asmsoft.search.example.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.asmsoft.search.controller.SearchController;
import ru.asmsoft.search.example.entity.User;
import ru.asmsoft.search.example.service.UserSearchService;
import ru.asmsoft.search.model.SearchQuery;
import ru.asmsoft.search.model.SearchResult;

@RestController
@RequiredArgsConstructor
public class UserSearchController implements SearchController<User> {
    private final UserSearchService userSearchService;

    @PostMapping("/api/v1/users/search")
    @Override
    public SearchResult<User> search(@RequestBody SearchQuery searchQuery) {
        return userSearchService.search(searchQuery);
    }
}
