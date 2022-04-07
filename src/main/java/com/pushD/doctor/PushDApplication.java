package com.pushD.doctor;
import com.pushD.doctor.entity.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class PushDApplication implements CommandLineRunner
{


	public  void main(String[] args)
	{
		SpringApplication.run(PushDApplication.class, args);
	}
    @Autowired
	BCryptPasswordEncoder bcrypt;

	@Override
	public void run(String... args) throws Exception
	{


			System.out.println("starting code");

			Doctor doctor = new Doctor();

			doctor.setFname("Debmalya");
			doctor.setLname("sen");
			doctor.setPassword(bcrypt.encode("abc"));
			doctor.setEmail("boonysen@gmail.com");

	}
}