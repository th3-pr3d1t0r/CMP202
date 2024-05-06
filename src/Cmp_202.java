public class Cmp_202 {
        int age;
        float height;
        String name;
        String password;

        void printUserDetails() {
            age = 23;
            height = 172;
            name = "th3-pr3d1t0r";
            name.length();
            password = "User@123";
            if (password.contains("123") || password.contains("User")) {
                System.out.println("Password is not strong enough");
            }
        }
    }

