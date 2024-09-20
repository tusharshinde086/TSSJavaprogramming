
    class Logger {
        void log(String message) {
            System.out.println("Log: " + message);
        }
    }
    
    class User extends Logger {
        String username;
    
        User(String username) {
            this.username = username;
        }
    
        void greet() {
            log("User " + username + " has logged in.");
        }
    }
    
    public class decorator {
        public static void main(String[] args) {
            User user = new User("Bob");
            user.greet();
        }
    }
    