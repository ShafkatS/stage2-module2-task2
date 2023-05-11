package com.example.filter;
import javax.servlet.annotation.WebFilter;

@WebFilter("/user/*")
public class AuthFilter extends HttpFilter {
    //write your code here!
}
