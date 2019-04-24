package com.tensquare.jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

/**
 * @author: Quan
 * @program: tensquare_parent
 * @description:
 * @create: 2019-04-16 00:26
 **/
public class ParseJwtTest {
    public static void main(String[] args) {
        String token="eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI4ODgiLCJzdWIiOiLlsI_nmb0iLCJpYXQiOjE1NTUzNDYxMjcsImV4cCI6MTU1NTM0NjE4N30.MMQODCOuS29g5dQWpmeaUiKR-65xgK14mSImXlx-UCo";
        Claims claims = Jwts.parser().setSigningKey("helloKitty").parseClaimsJws(token).getBody();
        System.out.println("id:"+claims.getId());
        System.out.println("subject:"+claims.getSubject());
        System.out.println("IssuedAt:"+claims.getIssuedAt());
        System.out.println("Expiration"+claims.getExpiration());
    }
}
