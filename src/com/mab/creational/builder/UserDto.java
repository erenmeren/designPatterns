package com.mab.creational.builder;

public class UserDto {

    private final String id;
    private final String email;
    private final String name;
    private final String surname;
    private final String wallet;

    public static UserDto.UserDtoBuilder builder() {
        return new UserDto.UserDtoBuilder();
    }

    public String getId() {
        return this.id;
    }

    public String getEmail() {
        return this.email;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getWallet() {
        return this.wallet;
    }

    public UserDto(final String id, final String email, final String name, final String surname, final String wallet) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.surname = surname;
        this.wallet = wallet;
    }

    public static class UserDtoBuilder {
        private String id;
        private String email;
        private String name;
        private String surname;
        private String wallet;

        UserDtoBuilder() {
        }

        public UserDto.UserDtoBuilder id(final String id) {
            this.id = id;
            return this;
        }

        public UserDto.UserDtoBuilder email(final String email) {
            this.email = email;
            return this;
        }

        public UserDto.UserDtoBuilder name(final String name) {
            this.name = name;
            return this;
        }

        public UserDto.UserDtoBuilder surname(final String surname) {
            this.surname = surname;
            return this;
        }

        public UserDto.UserDtoBuilder wallet(final String wallet) {
            this.wallet = wallet;
            return this;
        }

        public UserDto build() {
            return new UserDto(this.id, this.email, this.name, this.surname, this.wallet);
        }

        public String toString() {
            return "UserDto.UserDtoBuilder(id=" + this.id + ", email=" + this.email + ", name=" + this.name + ", surname=" + this.surname + ", wallet=" + this.wallet + ")";
        }
    }
    
}
