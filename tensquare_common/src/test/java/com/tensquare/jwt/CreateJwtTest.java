package com.tensquare.jwt;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

/**
 * @author: Quan
 * @program: tensquare_parent
 * @description:
 * @create: 2019-04-16 00:22
 **/
public class CreateJwtTest {
    public static void main(String[] args) {
        JwtBuilder builder= Jwts.builder().setId("888")
                .setSubject("小白")
                .setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS256,"helloKitty")
                .setExpiration(new Date(new Date().getTime()+60000));
        System.out.println( builder.compact() );
    }
}
