package com.company;

public class bobThePainter {
    public static void main(String[] args) {
        System.out.println(getBucketCount(10, 10, 6, 1));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, double extraBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBucket < 0) {
            return -1;
        }
        double area = (width * height);

        double amountThatExtraBucketsCover = areaPerBucket * extraBucket;
        area -= amountThatExtraBucketsCover;

        if (area == 0) {
            return 0;
        } else {
            int i = 1;
            while (true) {
                if (area / areaPerBucket == i) {
                    return i;
                }
                i++;
            }
        }

    }
}
