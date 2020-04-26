package com.ecom.app.dto.transformer;

import com.ecom.app.web.model.Option;
import com.ecom.app.web.model.Poll;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.HashSet;

public class PollTransformerTest {

    @Test
    public void testTransfer() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            new Poll().getOptions().add(new Option());
        });
    }

    @Test
    public void testDefaultTransfer() {
        new Poll().getDefaultOptions().add(new Option());
    }
}
