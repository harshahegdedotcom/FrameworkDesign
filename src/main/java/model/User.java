package model;


import org.apache.commons.lang3.builder.Builder;

public class User {

    private String Username;
    private String Password;
    private  User(Builder builder) {
        this.Username = builder.username;
        this.Password = builder.password;
    }

    class Builder {
        private String username;
        private String password;

        public Builder setUsername(String username) {
            this.username = username;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
