package com.miageif.projectweb;

import com.miageif.projectweb.Controller.SearchApi;
import com.miageif.projectweb.Model.Search;
import com.miageif.projectweb.Model.Stock;
import com.miageif.projectweb.Model.User;
import com.miageif.projectweb.Repository.SearchRepository;
import org.jeasy.random.EasyRandom;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.stream.Collectors;

@ExtendWith(MockitoExtension.class)
public class ApiTest {
    @Mock
    private SearchRepository searchRepository;

    @Mock
    private User user;

    @Mock
    private Stock stock;

    @Mock
    private Search searchModel;

    private SearchApi searchApi;

    private EasyRandom random;


    @BeforeEach
    public void setUp(){
        MockitoAnnotations.openMocks(this);
        random = new EasyRandom();
    }

    @Test
    public void getAllSearch(){
        List<Search> searchList = random.objects(Search.class,10).collect(Collectors.toList());
        Mockito.when(searchRepository.findAll()).thenReturn(searchList);

        List<Search> output = searchApi.findAll();
        Assert.assertEquals(searchList,output);
    }


}
