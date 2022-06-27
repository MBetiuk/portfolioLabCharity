package pl.coderslab.charity.security;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableWebSecurity
@RequiredArgsConstructor
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {


    private final UserDetailsService userDetailsService;
//    private AuthenticationSuccessHandler customAuthSuccessHandler;
//    private AuthenticationFailureHandler customAuthFailureHandler;
//    private LogoutSuccessHandler customLogoutSuccessHandler;




    //określenie dostawcy danych, który wykorzysta źródło danych (bazę danych),
    // aby zweryfikować nazwę użytkownika i hasło przesłane z formularza logowania
    @Bean
    AuthenticationProvider authProvider() {
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
        authProvider.setUserDetailsService(userDetailsService);
        authProvider.setPasswordEncoder(new BCryptPasswordEncoder());
        return authProvider;
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(authProvider());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeRequests()
                .antMatchers("/", "/home", "/register", "/login", "/admin/**").permitAll()
//                .antMatchers("/admin/**").hasRole("ADMIN")
                .anyRequest().authenticated()
                .and().formLogin()
                .defaultSuccessUrl("/start") // TODO: 27/06/2022 zmienic adres strony !!
                .loginPage("/login").failureUrl("/login?error=true")
//                .successHandler(customAuthSuccessHandler)
//                .failureHandler(customAuthFailureHandler)
                .and().logout();
//                .logoutSuccessHandler(customLogoutSuccessHandler)
//                .invalidateHttpSession(false)
//                .deleteCookies("JSESSIONID").and().logout();

    }

    //Podajemy w niej wzorzec ścieżki przechowującej zasoby, tak aby
    // ikony i inne podobne zasoby były dostępne jeszcze przed autentykacją
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/resources/**");
    }
}
