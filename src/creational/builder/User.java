package creational.builder;

public class User {

    private final String firstName;

    private final String lastName;

    private final Integer age;

    private final String email;

    private final String address;

    private User(UserBuilder userBuilder) {
        this.firstName = userBuilder.firstName;
        this.lastName = userBuilder.lastName;
        this.age = userBuilder.age;
        this.email = userBuilder.email;
        this.address = userBuilder.address;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static UserBuilder UserBuilder(String firstName, String lastName) {
        return new UserBuilder(firstName, lastName);
    }

    public static class UserBuilder {

        private String firstName;

        private String lastName;

        private Integer age;

        private String email;

        private String address;

        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder withAge(Integer age) {
            this.age = age;
            return this;
        }

        public UserBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder withAddress(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(this);
        }

    }

}
