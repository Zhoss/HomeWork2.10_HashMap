package PhoneBook;

import java.util.Objects;

public class PhoneContact {
    private String fullName;
    private String phoneNumber;

    public PhoneContact(String fullName, String phoneNumber) {
        setFullName(fullName);
        setPhoneNumber(phoneNumber);
    }

    public String getFullName() {
        return fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setFullName(String fullName) {
        if (fullName != null && !fullName.isEmpty() && !fullName.isBlank()) {
            this.fullName = fullName;
        } else {
            System.out.println("Данные заполнены некорректно");
        }
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber != null && !phoneNumber.isEmpty() && !phoneNumber.isBlank()) {
            this.phoneNumber = phoneNumber;
        } else {
            System.out.println("Данные заполнены некорректно");
        }
    }

    @Override
    public String toString() {
        return fullName +
                ", номер телефона " + phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneContact that = (PhoneContact) o;
        return fullName.equals(that.fullName) && phoneNumber.equals(that.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, phoneNumber);
    }
}
