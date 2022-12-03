import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Passport {

    public static class DateOfBirth {
        private final int year;
        private final int month;
        private final int day;
        LocalDate dateOfBirth;

        public DateOfBirth(int year, int month, int day) {
            this.year = year;
            this.month = month;
            this.day = day;
            this.dateOfBirth = LocalDate.of(year, month, day);
        }

        public int getYear() {
            return year;
        }

        public int getMonth() {
            return month;
        }

        public int getDay() {
            return day;
        }

        public LocalDate getDateOfBirth() {
            return dateOfBirth;
        }

        @Override
        public String toString() {
            return String.valueOf(dateOfBirth);
        }
    }


    private final int number;
    private final String surname;
    private final String name;
    private final String lastName;
    private DateOfBirth dateOfBirth;


    public static Set<Passport> passports = new HashSet<>();

    public Passport(int number, String surname, String name, String lastName, DateOfBirth dateOfBirth) {
        this.number = number;
        this.surname = ValidationUtils.ValidationString(surname,"Заполните данные");
        this.name = ValidationUtils.ValidationString(name, "Заполните данные");
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        passports.add(Passport.this);
    }

    public static Passport search(int number) {
        for (Passport passport:passports){
            if (passport.getNumber() == number) {
                System.out.println(passport.toString());
                return passport;
            }
        }
        return null;
    }

    public int getNumber() {
        return number;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public DateOfBirth getDateOfBirth() {
        return dateOfBirth;
    }

    public Set<Passport> getPassports() {
        return passports;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return number == passport.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return "Ф.И.О.: "+surname+" "+name+" "+lastName+", номер паспорта: "+number+" , дата рождения: "+dateOfBirth+"\n";
    }
}

