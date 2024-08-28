package kr.ac.nollrae.config;

import org.springframework.context.annotation.Configuration;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    private final CustomOAuth2UserService customOAuth2UserService;

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http
                .csrf((csrf) -> csrf.disable())
                .formLogin((login) -> login.disable())
                .httpBasic((basic) -> basic.disable())
                .oauth2Login((oauth2)->oauth2
                        .userInfoEndPoint(
                                userInfoEndPointConfig ->
                                        userInfoEndpointConifg.userService(customOAuth2UserService)
                        ))

                //oauth2Client를 추가 하게 되면 세부 로그인 로직들을 구현 해야 한다.
                .authorizeHttpRequests((auth) -> auth
                        .requestMatchers("/").permitAll()
                        .anyRequest().authenticated());
        return http.build();
    }

}
