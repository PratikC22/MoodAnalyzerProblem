/***********************************************************************
 *  UC-1-ability to analyse and Respond Happy or Sad Mood message
 *
 * @author Pratik Chaudhari
 * @since 30/06/2021
 ***********************************************************************/
package com.pratik;

public class MoodAnalyser {
    String message;

    //Constructor without parameter
    public MoodAnalyser() {

    }

    //Constructor with parameter
    public MoodAnalyser(String message) {
        this.message = message;
    }

    //analyseMood method
    public String analyseMood() {
        if (message.contains("sad")) {
            return "SAD";
        } else {
            return "HAPPY";
        }
    }
}


