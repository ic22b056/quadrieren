package com.example.quadrieren;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuadrierenController
{
    @GetMapping("/api/square")
    public int square(int a)
    {
        return a*a;
    }
}
