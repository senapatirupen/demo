package com.ecom.app.util;

import com.ecom.app.entity.Address;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AddressFormatter {

    public static String addressFormat(Address address) {
        String addressAfterFormat =
                Stream.of(address.getAddressLineOne(), address.getAddressLineTwo(),
                        address.getZipcode()).filter(StringUtils::isNotBlank)
                        .collect(Collectors.joining(", "));
        return addressAfterFormat;
    }

    public static String addressCommaFormat(Address address) {
        return String.format("%s, %s", address.getAddressLineOne(), address.getAddressLineTwo());
    }

}
