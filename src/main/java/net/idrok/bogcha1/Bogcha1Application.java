package net.idrok.bogcha1;

import net.idrok.bogcha1.entity.Role;
import net.idrok.bogcha1.entity.User;
import net.idrok.bogcha1.repository.UserRepository;
import net.idrok.bogcha1.security.JwtUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;


import javax.annotation.PostConstruct;

import java.time.LocalDateTime;

@SpringBootApplication
public class Bogcha1Application {
 
	public static void main(String[] args) {
		SpringApplication.run(Bogcha1Application.class, args);
	}

	@Autowired 
	UserRepository userRepository;

	final Logger LOG = LoggerFactory.getLogger(Bogcha1Application.class.getName());


	@Autowired
	PasswordEncoder encoder;
	@PostConstruct
	public void birlamchiAdminlarniBelgilash(){


		if(userRepository.findByLogin("admin123").isEmpty()){
			User user = new User();
			user.setIsm("Administrator");
			user.setLogin("admin123");
			user.setParol(encoder.encode("admin123"));
			user.setAktiv(true);
			user.setRegVaqt(LocalDateTime.now());
			user.setRole(Role.ADMIN);
			userRepository.save(user);
		}
	}

	@Autowired
	JwtUtil jwtUtil;

	@PostConstruct
	public void jwtSinov(){
		//jwt generatsiya qilish

		// String jwt = Jwts.builder()
		// 		.setSubject("admin123")
		// 		.setIssuedAt(Date.from(Instant.now()))
		// 		.claim("ism", "Otabek")
		// 		.claim("lavozim", "admin")
		// 		.signWith(SignatureAlgorithm.HS256, "salom")
		// 		.compact();
		// LOG.info(jwt);

	//	jwt ni ochish
		// String jwt2 = "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZG1pbjEyMzQiLCJyb2xlIjoiYWRtaW4iLCJpYXQiOjE2NTI4Mjg2MDAsImV4cCI6MTY1MzQzMzQwMH0.vxtIIF41LT6SbWv-T1-xWDZ8CYrIseX6GR-apAr5Wag";

		// Jws<Claims> claims  = Jwts.parser()
		// 		.setSigningKey("salom")
		// 		.parseClaimsJws(jwt2);
		// LOG.info("Subject: "+claims.getBody().getSubject());

		// Yaratilgan JwtUtilni sinaymiz
		LOG.info("----------------");
		String token = jwtUtil.generateToken("admin123", "admin");
		LOG.info(token);
		LOG.info("----------------");
		LOG.info("Haqiqiy: "+jwtUtil.validateToken(token));
		LOG.info("Login: "+jwtUtil.getLogin(token));
		LOG.info("Role: "+jwtUtil.getRole(token));



	}


}
   