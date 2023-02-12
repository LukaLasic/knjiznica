package ba.sum.fsre.ednevnik.model;

import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

public class StudentDetails implements org.springframework.security.core.userdetails.UserDetails {
    private Student student;

    public StudentDetails(Student student) {this.student=student;}

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }


    public String getFullName() {
        return student.getFirstname() + " " + student.getLastname();
    }

}
