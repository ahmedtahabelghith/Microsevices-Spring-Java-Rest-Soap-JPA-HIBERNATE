package com.time;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	public void globalConfig( AuthenticationManagerBuilder auth ) throws Exception
	
	{
		auth.inMemoryAuthentication().withUser("admin").password("123").roles("ADMIN","DRH") ;
		auth.inMemoryAuthentication().withUser("ahmed").password("0000").roles("ADMIN") ;
		auth.inMemoryAuthentication().withUser("drh").password("0000").roles("DRH") ;
		
	}
	@Override
	protected void configure(HttpSecurity http) throws Exception
	{
		http
		.csrf().disable()
		.authorizeRequests()
		   .anyRequest()
		        .authenticated()
		          .and()
		             .formLogin()
		             .loginPage("/login")
		                  .permitAll()
		                  ;
		
	}

}
