public class Person {

    private int age;
    private String gender;
    private String status;
    
    // Maximum allowed age
    private static final int MAX_AGE = 75;
    // Valid gender values
    private static final String[] VALID_GENDERS = {"Male", "Female"};
    // Valid status values
    private static final String[] VALID_STATUSES = {"Rich", "Poor"};

    // Default constructor
    public Person() {
    }

    // Parameterized constructor
    public Person(int age, String gender, String status) {
        if (age > MAX_AGE) {
            throw new IllegalArgumentException("Person above age 75 cannot be created");
        }
        this.age = age;
        
        if (gender != null && !isValidGender(gender)) {
            throw new IllegalArgumentException("Gender must be either 'Male' or 'Female'");
        }
        this.gender = gender;
        
        if (status != null && !isValidStatus(status)) {
            throw new IllegalArgumentException("Status must be either 'Rich' or 'Poor'");
        }
        this.status = status;
    }
    
    // Helper method to validate gender
    private boolean isValidGender(String gender) {
        for (String validGender : VALID_GENDERS) {
            if (validGender.equals(gender)) {
                return true;
            }
        }
        return false;
    }
    
    // Helper method to validate status
    private boolean isValidStatus(String status) {
        for (String validStatus : VALID_STATUSES) {
            if (validStatus.equals(status)) {
                return true;
            }
        }
        return false;
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > MAX_AGE) {
            throw new IllegalArgumentException("Person above age 75 cannot be created");
        }
        this.age = age;
    }

    // Getter and Setter for gender
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender != null && !isValidGender(gender)) {
            throw new IllegalArgumentException("Gender must be either 'Male' or 'Female'");
        }
        this.gender = gender;
    }

    // Getter and Setter for status
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if (status != null && !isValidStatus(status)) {
            throw new IllegalArgumentException("Status must be either 'Rich' or 'Poor'");
        }
        this.status = status;
    }
} 