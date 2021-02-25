package com.example.laba1rest;

import org.springframework.stereotype.Service;

@Service
public class ZService
{
    public int Calculation (int weight1,int speed1,int weight2,int speed2)
    {
        int answer = (weight1 * speed1) - (weight2 * speed2);
        return answer;
    }
}
