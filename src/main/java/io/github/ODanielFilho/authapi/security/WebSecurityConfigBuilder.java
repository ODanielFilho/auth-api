package io.github.ODanielFilho.authapi.security;

public class WebSecurityConfigBuilder {
    private CustomBasicAuthenticationFilter customBasicAuthenticationFilter;

    public WebSecurityConfigBuilder setCustomBasicAuthenticationFilter(CustomBasicAuthenticationFilter customBasicAuthenticationFilter) {
        this.customBasicAuthenticationFilter = customBasicAuthenticationFilter;
        return this;
    }

    public WebSecurityConfig createWebSecurityConfig() {
        return new WebSecurityConfig(customBasicAuthenticationFilter);
    }
}