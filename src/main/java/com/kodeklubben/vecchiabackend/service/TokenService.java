package com.kodeklubben.vecchiabackend.service;
import org.springframework.security.oauth2.jwt.JwtClaimsSet;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.security.oauth2.jwt.JwtEncoderParameters;
import org.springframework.stereotype.Service;
import java.util.Calendar;
import java.util.Date;

@Service
public class TokenService {
  private final JwtEncoder jwtEncoder;

  public TokenService(JwtEncoder jwtEncoder) {
    this.jwtEncoder = jwtEncoder;
  }

  public String generateToken(String username) {
    Date now = new Date();
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(now);
    calendar.add(Calendar.HOUR, 1);
    Date expiration = calendar.getTime();
    JwtClaimsSet claims = JwtClaimsSet.builder()
            .issuer("self")
            .issuedAt(now.toInstant())
            .expiresAt(expiration.toInstant())
            .subject(username)
            .build();
    return this.jwtEncoder.encode(JwtEncoderParameters.from(claims)).getTokenValue();
  }
}
