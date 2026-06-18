package com.train.usecase;

import com.train.util.RegexUtil;

public class UC11RegexValidation {

    public void execute() {

        String trainId = "TRN-1234";

        String cargoCode = "PET-AA";

        System.out.println(
                "Train Valid = "
                        + RegexUtil
                        .validateTrainId(trainId));

        System.out.println(
                "Cargo Valid = "
                        + RegexUtil
                        .validateCargoCode(cargoCode));
    }
}