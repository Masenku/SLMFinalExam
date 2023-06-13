package com.example.slmfinalexam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HammingWeightController {

    @RequestMapping("/api/hamming")
    public int getHammingWeight(@RequestParam("string") String string) {
        return calculateHammingWeight(string);
    }

    private int calculateHammingWeight(String string) {
        int count = 0;
        for (char c : string.toCharArray()) {
            if (c != '0') {
                count++;
            }
        }
        return count;
    }

}
