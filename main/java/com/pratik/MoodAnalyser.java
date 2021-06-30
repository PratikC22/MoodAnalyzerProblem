/***********************************************************************
 *  UC-1-ability to analyse and Respond Happy or Sad Mood message
 *  UC-2-Handle Exception if user provides invalid mood
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
        try {
            if (message.contains("sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (NullPointerException npe) {
            return "HAPPY";
        }
    }
}


