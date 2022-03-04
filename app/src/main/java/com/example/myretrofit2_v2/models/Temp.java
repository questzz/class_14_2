package com.example.myretrofit2_v2.models;

//
// {
//         "id" : 10,
//         "account" : {
//         "name" : "홍길동",
//         "email" : "a@naver.com"
//         }
//
//         }

public class Temp {
    private int id;
    private Account account;

    class Account {
        private String name;
        private String email;
    }
}


