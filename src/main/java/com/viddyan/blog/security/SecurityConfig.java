//package com.viddyan.blog.security;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.provisioning.JdbcUserDetailsManager;
//import org.springframework.security.provisioning.UserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//import javax.sql.DataSource;
//
//@Configuration
//public class SecurityConfig {
//
//    @Bean
//    public UserDetailsManager userDetailsManager(DataSource dataSource){
//        return new JdbcUserDetailsManager(dataSource);
//    }
//
//
////    @Bean
////    public InMemoryUserDetailsManager userDetailsManager(){
////
////        UserDetails gyan = User.builder()
////                .username("gyan")
////                .password("{noop}gyan@011")
////                .roles("VISITOR")
////                .build();
////
////        UserDetails mary = User.builder()
////                .username("mary")
////                .password("{noop}mary@011")
////                .roles("VISITOR","MANAGER")
////                .build();
////
////        UserDetails susan = User.builder()
////                .username("susan")
////                .password("{noop}susan@011")
////                .roles("VISITOR","MANAGER","ADMIN")
////                .build();
////
////        return new InMemoryUserDetailsManager(gyan,mary,susan);
////    }
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http.authorizeHttpRequests( configurer ->
//                configurer
//                        .requestMatchers(HttpMethod.GET,"/api/blogs").hasRole("VISITOR")
//                        .requestMatchers(HttpMethod.GET,"/api/blogs/**").hasRole("VISITOR")
//                        .requestMatchers(HttpMethod.POST,"/api/blogs").hasRole("MANAGER")
//                        .requestMatchers(HttpMethod.PUT,"/api/blogs").hasRole("MANAGER")
//                        .requestMatchers(HttpMethod.DELETE,"/api/blogs/**").hasRole("ADMIN"));
//
//        http.csrf().disable();
//        http.httpBasic();
//        return http.build();
//    }
//
//
//
//}
