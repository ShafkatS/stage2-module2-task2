package com.example.filter;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

@WebFilter("/user/*")
public class AuthFilter extends HttpFilter {
    //write your code here!
}
