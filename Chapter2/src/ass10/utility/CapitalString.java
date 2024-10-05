package ass10.utility;


    public class CapitalString {
        public String capitalizeFirstLetter(String input) {
            if (input == null || input.isEmpty()) {
                return input; // Return the original string if it's null or empty
            }
            return input.substring(0, 1).toUpperCase() + input.substring(1);
        }
    }
