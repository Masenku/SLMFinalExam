package com.example.slmfinalexam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HammingWeightController {

    private String previousString;

    @RequestMapping ("/api/hamming/previous")
    public String getPreviousHammingWeight() {
        if (previousString == null) {
            return "0";
        } else {
            return previousString;
        }
    }

    @RequestMapping("/api/hamming")
    public int getHammingWeight(@RequestParam("string") String string) {
        return calculateHammingWeight(string);
    }

    private int calculateHammingWeight(String string) {
        previousString = string;
        int count = 0;
        for (char c : string.toCharArray()) {
            if (c != '0') {
                count++;
            }
        }
        return count;
    }

}
