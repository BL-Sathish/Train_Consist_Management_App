package com.train.util;

import java.util.regex.Pattern;

public class RegexUtil {

    private static final String TRAIN_PATTERN =
            "TRN-\\d{4}";

    private static final String CARGO_PATTERN =
            "PET-[A-Z]{2}";

    public static boolean validateTrainId(
            String trainId) {

        return Pattern.matches(
                TRAIN_PATTERN,
                trainId);
    }

    public static boolean validateCargoCode(
            String cargoCode) {

        return Pattern.matches(
                CARGO_PATTERN,
                cargoCode);
    }
}