package com.train.util;

public class SearchUtil {

    public static boolean linearSearch(
            String[] ids,
            String target) {

        for (String id : ids) {

            if (id.equals(target)) {

                return true;
            }
        }

        return false;
    }

    public static boolean binarySearch(
            String[] ids,
            String target) {

        int low = 0;

        int high = ids.length - 1;

        while (low <= high) {

            int mid =
                    (low + high) / 2;

            int result =
                    ids[mid].compareTo(target);

            if (result == 0) {

                return true;
            }

            if (result < 0) {

                low = mid + 1;
            } else {

                high = mid - 1;
            }
        }

        return false;
    }
}