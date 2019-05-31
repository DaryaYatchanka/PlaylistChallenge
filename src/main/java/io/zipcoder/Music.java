package io.zipcoder;

import java.util.Arrays;

public class Music {

    private String[] playList;

    public Music(String[] playList) {
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {
        Integer count1 = 0;
        Integer count2 = 0;

        for (int i = startIndex; i < playList.length; i++) {
            if (!playList[i].equals(selection)) {


                count1 ++;


            }
        }
        for (int j = playList.length-1; j > 0; j--) {
            if (!playList[j].equals(selection)) {
                count2 ++;

            }
        }


        int min = Math.min(count1, count2);


        return min;
    }
}