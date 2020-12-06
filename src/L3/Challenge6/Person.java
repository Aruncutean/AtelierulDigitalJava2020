package L3.Challenge6;

public class Person {

    private String name;
    private String job;
    private String university;
    private String drivingLicense;
    private String isMarried;

    private Person(PersonBuilder builder) {
        this.name = builder.name;
        this.job = builder.job;
        this.university = builder.university;
        this.drivingLicense = builder.drivingLicense;
        this.isMarried = builder.isMarried;
    }


    public String getJob() {
        return job;
    }

    public String getUniversity() {
        return university;
    }

    public String getName() {
        return name;
    }

    public static class PersonBuilder {

        private String name;
        private String job;
        private String university;
        private String drivingLicense;
        private String isMarried;

        public PersonBuilder(String name) {
            this.name = name;
        }

        public PersonBuilder setJob(String job) {
            this.job = job;
            return this;
        }

        public PersonBuilder setUniversity(String university) {
            this.university = university;
            return this;
        }

        public PersonBuilder setDrivingLicense(String drivingLicense) {
            this.drivingLicense = drivingLicense;
            return this;
        }

        public PersonBuilder setIsMarried(String isMarried) {
            this.isMarried = isMarried;
            return this;
        }


        public Person build() {
            return new Person(this);
        }


    }
}
